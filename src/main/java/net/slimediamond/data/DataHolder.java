package net.slimediamond.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * An object which holds data using a {@link Key}
 */
public abstract class DataHolder {
    private Map<Key<?>, Object> storage = new HashMap<>();

    /**
     * Offer this object data to store.
     *
     * @param store The identifier for the storage
     * @param value The value to set it to
     * @param <Z>   The type of valuer
     */
    public <Z> void offer(Key<Z> store, Z value) {
        storage.put(store, value);
    }

    /**
     * Get the value of a {@link Key} stored on this data holder.
     *
     * @param store
     * @return
     * @param <Z>
     */
    @SuppressWarnings("unchecked")
    public <Z> Optional<Z> get(Key<Z> store) {
        return Optional.ofNullable((Z)storage.get(store));
    }
}
