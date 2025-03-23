package net.slimediamond.data.identification;

/**
 * A resource key used to identify a namespace and an id.
 *
 * @see ResourceKeyable
 */
public class ResourceKey {
    private final String namespace;
    private final String id;

    private ResourceKey(String namespace, String id) {
        this.namespace = namespace;
        this.id = id;
    }

    /**
     * The factory for a {@link ResourceKey}.
     *
     * @param namespace Namespace for this key.
     * @param id        Id of this key.
     * @return The resultant {@link ResourceKey} object.
     */
    public static ResourceKey of(String namespace, String id) {
        return new ResourceKey(namespace, id);
    }

    /**
     * Get the namespace for this resource key
     *
     * @return Resource key namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Get the ID for this resource key
     *
     * @return Resource key ID
     */
    public String getId() {
        return id;
    }
}
