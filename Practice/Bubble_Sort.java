package Practice;

import java.util.Arrays; // 導入 Arrays 類別以便列印陣列

public class Bubble_Sort {
    /**
     * 使用 Bubble Sort 演算法對整數陣列進行排序 (由小到大)。
     *
     * @param arr 要排序的整數陣列。
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // 外層迴圈控制排序的趟數
        // n-1 趟足以完成排序
        for (int i = 0; i < n - 1; i++) {
            // 標記，用於判斷本趟排序是否發生交換
            boolean swapped = false;

            // 內層迴圈進行比較和交換
            // 每趟排序後，最大的元素會被「冒泡」到陣列的末尾
            // 所以下一趟排序的比較範圍可以縮小
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前一個元素大於後一個元素，則交換它們
                if (arr[j] > arr[j + 1]) {
                    // 交換 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // 發生了交換
                }
            }

            // 如果本趟排序沒有發生交換，說明陣列已經有序，可以直接結束
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {41, 59, 36, 78, 12};

        System.out.println("原始陣列: " + Arrays.toString(arr));

        // 呼叫 bubbleSort 函式來排序陣列
        bubbleSort(arr);

        System.out.println("排序後的陣列: " + Arrays.toString(arr));
    }
}