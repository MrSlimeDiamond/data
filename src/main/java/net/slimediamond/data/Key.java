package net.slimediamond.data;

import net.slimediamond.data.identification.ResourceKey;
import net.slimediamond.data.identification.ResourceKeyable;

/**
 * A key, used to map data
 *
 * @param <T> The type value for this key
 */
public class Key<T> extends ResourceKeyable {
    private final Class<T> type;

    private Key(ResourceKey resourceKey, Class<T> type) {
        super(resourceKey);
        this.type = type;
    }

    /**
     * The {@link Key} factory.
     *
     * <p>Creates a key without any value assigned to it, only
     * initializing the <strong>registry key</strong>.</p>
     *
     * @param resourceKey The resource key for this key
     * @return The resultant key object.
     */
    public static <Z> Key<Z> of(ResourceKey resourceKey, Class<Z> type) {
        return new Key<>(resourceKey, type);
    }

    /**
     * Get the type that this key stores
     *
     * @return Key type
     */
    public Class<T> getType() {
        return type;
    }
}
