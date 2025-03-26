package net.slimediamond.data.keys.test;

import net.slimediamond.data.Key;
import net.slimediamond.data.identification.ResourceKey;
import net.slimediamond.data.value.Value;

public class Keys {
    private static final String NAMESPACE = "keys-test";

    public static final Key<Value<Integer>> INTEGER = Key.from(ResourceKey.of(NAMESPACE, "integer"), Integer.class);
}
