package ltd.smartfarm.wangluo.wangluo.java.utils;

import ltd.smartfarm.wangluo.wangluo.java.algorithm.BubbleSortComponent;

/**
 * 算法工具类
 * @author wangluo
 * @since 2024/5/8 10:48
 */
public class AlgorithmUtils {

    /**
     * 冒泡排序升序
     * @param arr
     */
    public static void bubbleSortAscend(int[] arr) {
        BubbleSortComponent.bubbleSortAscend(arr);
    }


    /**
     * 冒泡排序降序
     * @param arr
     */
    public static void bubbleSortDescend(int[] arr) {
        BubbleSortComponent.bubbleSortDescend(arr);
    }
}
