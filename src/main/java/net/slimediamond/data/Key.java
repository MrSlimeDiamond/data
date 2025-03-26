package net.slimediamond.data;

import net.slimediamond.data.identification.ResourceKey;
import net.slimediamond.data.identification.ResourceKeyable;
import net.slimediamond.data.value.Value;

import java.lang.reflect.Type;

/**
 * A key, used to map data, storing a {@link Value}, so that it can be obtained from
 * a {@link DataHolder} object.
 *
 * <p>Keys may be offered to a {@link DataHolder} using the
 * {@link DataHolder#offer(Key, Object)} method, and may be obtained from the
 * relevant {@link DataHolder} using {@link DataHolder#get(Key)}</p>
 *
 * @param <T> The type value for this key
 */
public interface Key<T extends Value<?>> extends ResourceKeyable {

    /**
     * The {@link Key} factory.
     *
     * <p>Creates a key without any value assigned to it, only
     * initializing the <strong>registry key</strong>.</p>
     *
     * @param resourceKey The resource key for this key
     * @return The resultant key object.
     */
    static <T> Key<Value<T>> from(ResourceKey resourceKey, Class<T> type) {
        return new Key<Value<T>>() {
            @Override
            public Type getType() {
                return type;
            }

            @Override
            public ResourceKey getResourceKey() {
                return resourceKey;
            }
        };
    }

    /**
     * Get the type that this key stores
     *
     * @return Key type
     */
    Type getType();
}
