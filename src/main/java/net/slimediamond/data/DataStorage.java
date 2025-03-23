package net.slimediamond.data;

/**
 * A way of storing data.
 */
public interface DataStorage<T> {
    /**
     * Get the type that this instance stores.
     *
     * @return Storage type
     */
    Class<T> getType();
}
