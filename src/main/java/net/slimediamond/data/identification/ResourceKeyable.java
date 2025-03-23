package net.slimediamond.data.identification;

/**
 * A data object which is catalogued by a
 * {@link ResourceKey}
 */
public class ResourceKeyable {
    private final ResourceKey resourceKey;

    public ResourceKeyable(ResourceKey resourceKey) {
        this.resourceKey = resourceKey;
    }

    public ResourceKey getResourceKey() {
        return resourceKey;
    }
}
