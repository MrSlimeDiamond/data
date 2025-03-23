package net.slimediamond.data.keys.test;

import net.slimediamond.data.Key;
import net.slimediamond.data.identification.ResourceKey;

public class Keys {
    private static final String NAMESPACE = "keys-test";

    public static final Key<Integer> INTEGER = Key.of(ResourceKey.of(NAMESPACE, "integer"), Integer.class);
}
