package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className MatrixTranspose
 * @description 对于矩阵的转置
 * @since 2021/7/31 5:04 下午
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("输出转置前的矩阵：");
        printArray(array);
        int[][] arr2 = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr2[i][j] = array[j][i];
            }

        }
        System.out.println("输出转置后的矩阵：");
        printArray(arr2);
    }

    //函数遍历数组
    public static void printArray(int arry[][]) {
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
}
