package net.slimediamond.data.identification;

/**
 * A data object which is catalogued by a
 * {@link ResourceKey}
 */
public interface ResourceKeyable {
    /**
     * Get the resource key
     *
     * @return Resource key
     */
    ResourceKey getResourceKey();
}
