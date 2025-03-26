package net.slimediamond.data.identification;

/**
 * An object which has a namespace, so that a {@link ResourceKey} can be made from using
 * an instance of this object
 * <br>
 * <code>ResourceKey.of(NamespaceHolder, String)</code>
 */
public interface NamespaceHolder {
    /**
     * Get the namespace
     *
     * @return Namespace
     */
    String getNamespace();
}
