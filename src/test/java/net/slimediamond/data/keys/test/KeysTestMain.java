package net.slimediamond.data.keys.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KeysTestMain {

    @Test
    public void integerEqual() {
        TestDataHolder testDataHolder = new TestDataHolder();

        testDataHolder.offer(Keys.INTEGER, 22);

        Assertions.assertTrue(testDataHolder.get(Keys.INTEGER).isPresent());
        Assertions.assertEquals(22, testDataHolder.get(Keys.INTEGER).get());
    }

}
