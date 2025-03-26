package net.slimediamond.data;

import net.slimediamond.data.value.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * An object which holds data using a {@link Key} and {@link Value}
 *
 * <p>A {@link Key} can be offered to a data holder with {@link #offer(Key, Object)}, and
 * obtained later using {@link #get(Key)}</p>
 */
public interface DataHolder {
    Map<Key<? extends Value<?>>, Value<?>> storage = new HashMap<>();

    /**
     * Offer this object data to store.
     *
     * @param key   The identifier for the storage
     * @param value The value to set it to
     */
    default <Z> void offer(Key<Value<Z>> key, Z value) {
        storage.put(key, Value.of(value));
    }

    /**
     * Get the value of a {@link Key} stored on this data holder.
     *
     * @param key The key
     * @return The key's value if present, otherwise {@link Optional#empty()}
     */
    @SuppressWarnings("unchecked")
    default <Z> Optional<Z> get(Key<Value<Z>> key) {
        return Optional.ofNullable((Z)storage.get(key).getValue());
    }

    /**
     * Get all {@link Key}s and {@link Value}s stored on a {@link DataHolder}
     *
     * @return Keys and values
     */
    default Map<Key<? extends Value<?>>, Value<?>> getKeys() {
        return storage;
    }
}
