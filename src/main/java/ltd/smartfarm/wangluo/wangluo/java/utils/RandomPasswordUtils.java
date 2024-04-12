package ltd.smartfarm.wangluo.wangluo.java.utils;

import java.security.SecureRandom;

/**
 * 随机密码
 *
 * @author wangl
 * @since 2024/2/19
 */
public class RandomPasswordUtils {

    private static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    //private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
    private static final String SPECIAL_CHARACTERS = "!@#$%&*";

    public static String generateRandomString(int minLength, int maxLength) {
        if (minLength < 8 || maxLength > 15 || minLength > maxLength) {
            throw new IllegalArgumentException("Invalid length range");
        }

        SecureRandom random = new SecureRandom();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int category = random.nextInt(4);

            switch (category) {
                case 0:
                    sb.append(getRandomChar(BASE_CHAR));
                    break;
                case 1:
                    sb.append(getRandomChar(BASE_CHAR.toUpperCase()));
                    break;
                case 2:
                    sb.append(getRandomChar(DIGITS));
                    break;
                case 3:
                    sb.append(getRandomChar(SPECIAL_CHARACTERS));
                    break;
            }
        }

        return sb.toString();
    }

    private static char getRandomChar(String characters) {
        SecureRandom random = new SecureRandom();
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}
