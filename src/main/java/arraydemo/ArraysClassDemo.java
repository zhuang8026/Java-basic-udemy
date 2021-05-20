package arraydemo;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {

        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        for (double item : numbers) {
            System.out.print(item + " ");
        }

        System.out.println();

        double[] numbers1 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers1, 1, 3); // 對部分參數進行排序（1-2 不包括3）
        for (double item : numbers1) {
            System.out.print(item + " ");
        }

        System.out.println();
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("binarySearch-> index:" + Arrays.binarySearch(list, 11)); // 傳入array，並查找相對應的參數位置
        System.out.println("binarySearch-> index:" + Arrays.binarySearch(list, 1)); // 無找到，返回 -1


        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10, 33, 45, 6};
        int[] list3 = {4, 2, 7, 10};

        System.out.println(Arrays.equals(list1, list2)); // false
        System.out.println(Arrays.equals(list2, list3)); // false

        Arrays.fill(list1, 5);                  // 填充數組 (用參數 5 將 list 填滿 )
        System.out.println(Arrays.toString(list1)); // 迴圈數組 返回string

        Arrays.fill(list2, 1, 5, 8); // 填充部分數組 (用參數 8 將 list 下標為1～4 填滿 )
        System.out.println(Arrays.toString(list2));        // 迴圈數組 返回string


    }
}
