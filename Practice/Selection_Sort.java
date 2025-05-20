package Practice;

import java.util.Arrays; // 導入 Arrays 類別以便列印陣列

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // 一個範例陣列

        System.out.println("原始陣列: " + Arrays.toString(arr));

        // 呼叫 selectionSort 函式來排序陣列
        selectionSort(arr);

        System.out.println("排序後的陣列: " + Arrays.toString(arr));

        int[] arr2 = {5, 1, 4, 2, 8};
        System.out.println("原始陣列 2: " + Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("排序後的陣列 2: " + Arrays.toString(arr2));
    }

    /**
     * 使用 Selection Sort 演算法對整數陣列進行排序 (由小到大)。
     *
     * @param arr 要排序的整數陣列。
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 外層迴圈控制排序的趟數，以及已排序部分的邊界
        // 需要 n-1 趟來完成排序
        for (int i = 0; i < n - 1; i++) {
            // 假設目前未排序部分的最小元素的索引是 i
            int minIndex = i;

            // 內層迴圈從 i+1 開始，遍歷未排序部分，找到最小元素的實際索引
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 更新最小元素的索引
                }
            }

            // 如果最小元素不在目前趟次的起始位置 i，則交換它們
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}