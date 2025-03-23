package net.slimediamond.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * An object which holds data
 * using some form of {@link DataStorage}
 */
public class DataHolder {
    private Map<DataStorage<?>, Object> storage = new HashMap<>();

    /**
     * Offer this object data to store.
     *
     * @param store The identifier for the storage
     * @param value The value to set it to
     * @param <Z>   The type of valuer
     */
    public <Z> void offer(DataStorage<Z> store, Z value) {
        storage.put(store, value);
    }

    /**
     * Get the value of a {@link DataStorage} stored on this data holder.
     *
     * @param store
     * @return
     * @param <Z>
     */
    @SuppressWarnings("unchecked")
    public <Z> Optional<Z> get(DataStorage<Z> store) {
        return Optional.ofNullable((Z)storage.get(store));
    }
}
