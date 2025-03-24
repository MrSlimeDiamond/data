package net.slimediamond.data.registry;

import net.slimediamond.data.identification.ResourceKey;
import net.slimediamond.data.identification.ResourceKeyable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BasicRegistry<T extends ResourceKeyable> implements Registry<T> {
    private final List<T> keys = new ArrayList<>();

    @Override
    public List<T> all() {
        return Collections.unmodifiableList(keys);
    }

    @Override
    public Optional<T> from(ResourceKey resourceKey) {
        return keys.stream()
                .filter(key -> key.getResourceKey().getNamespace().equals(resourceKey.getNamespace()))
                .filter(key -> key.getResourceKey().getId().equals(resourceKey.getId()))
                .findAny();
    }

    @Override
    public boolean register(T key) {
        if (keys.contains(key)) {
            return false;
        }

        if (keys.stream()
                .map(ResourceKeyable::getResourceKey)
                .filter(resourceKey -> resourceKey.getNamespace().equals(key.getResourceKey().getNamespace()))
                .anyMatch(resourceKey -> resourceKey.getId().equals(key.getResourceKey().getId()))) {
            return false;
        }

        // We've finally validated it, so we can add it
        keys.add(key);
        return true;
    }

    @Override
    public void unregister(T object) {
        keys.remove(object);
    }

    @Override
    public void unregister(ResourceKey resourceKey) {
        keys.stream()
                .filter(key -> key.getResourceKey().getNamespace().equals(resourceKey.getNamespace()))
                .filter(key -> key.getResourceKey().getId().equals(resourceKey.getId()))
                .forEach(key -> keys.remove(key));
    }
}
