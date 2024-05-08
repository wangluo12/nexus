package ltd.smartfarm.wangluo.wangluo.java.algorithm;

/**
 * @author wangluo
 * @since 2024/5/8 10:49
 */
public class BubbleSortComponent {

    /**
     * 冒泡排序-升序
     *
     * @param arr 待排序的数组
     */
    public static void bubbleSortAscend(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // 设置一个标志，用于优化算法
            boolean swapped = false;
            // 最后一个元素已经在它应该在的位置，所以每次循环的范围可以减少
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于下一个元素，交换它们
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果在这一轮排序中没有交换任何元素，说明数组已经排序完成
            if (!swapped) {
                break;
            }
        }
    }


    /**
     * 冒泡排序-升序
     *
     * @param arr 待排序的数组
     */
    public static void bubbleSortDescend(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // 设置一个标志，用于优化算法
            boolean swapped = false;
            // 最后一个元素已经在它应该在的位置，所以每次循环的范围可以减少
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于下一个元素，交换它们
                if (arr[j] < arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果在这一轮排序中没有交换任何元素，说明数组已经排序完成
            if (!swapped) {
                break;
            }
        }
    }
}
