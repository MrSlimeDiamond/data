package net.slimediamond.data.registry;

import net.slimediamond.data.identification.ResourceKey;
import net.slimediamond.data.identification.ResourceKeyable;

import java.util.List;
import java.util.Optional;

/**
 * A registry storing values of a certain type, allowing cataloguing and retrieval of them.
 *
 * <p>Objects can be registered to this registry using {@link #register(ResourceKeyable)},
 * and can later be unregistered with {@link #unregister(ResourceKeyable)}</p>
 *
 * @see BasicRegistry
 */
public interface Registry<T extends ResourceKeyable> {
    /**
     * Get all that is registered.
     *
     * @return All registered objects
     */
    List<T> all();

    /**
     * Get the value from a {@link ResourceKey}
     *
     * @param resourceKey The key to search for
     * @return Value
     */
    Optional<T> from(ResourceKey resourceKey);

    /**
     * Add something to this registry
     *
     * @param object The object to add
     * @return true if all went well, false if it was a duplicate
     */
    boolean register(T object);

    /**
     * Remove something from this registry
     *
     * @param object The object to remove
     */
    void unregister(T object);

    /**
     * Remove something from this registry.
     *
     * @param resourceKey ResourceKey to remove
     */
    void unregister(ResourceKey resourceKey);
}
