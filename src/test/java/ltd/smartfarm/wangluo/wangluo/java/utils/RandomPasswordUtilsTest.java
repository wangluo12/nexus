package ltd.smartfarm.wangluo.wangluo.java.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * RandomPasswordUtilsTest
 *
 * @author wangl
 * @date 2024/4/11
 */
public class RandomPasswordUtilsTest {

    @Test
    public void testGenerateRandomString_validLength() {
        String randomString = RandomPasswordUtils.generateRandomString(8, 10);
        assertNotNull(randomString);
        assertTrue(randomString.length() >= 8 && randomString.length() <= 10);
    }

    @Test
    public void testGenerateRandomString_invalidLength() {
        assertThrows(IllegalArgumentException.class, () -> RandomPasswordUtils.generateRandomString(6, 12));
    }
}
