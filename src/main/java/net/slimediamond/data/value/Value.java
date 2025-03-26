package net.slimediamond.data.value;

/**
 * Storage for a value
 *
 * @param <T> The type of value
 */
public interface Value<T> {
    /**
     * Get the value
     *
     * @return Value
     */
    T getValue();

    /**
     * The {@link Value} factory
     *
     * @param value The value for this value
     * @return Value
     */
    static <Z> Value<Z> of(Z value) {
        return () -> value;
    }
}
