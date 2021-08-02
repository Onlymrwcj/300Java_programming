package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className BubbleSort
 * @description 使用冒号排序法进行排序
 * @since 2021/8/2 8:57 下午
 */
public class BubbleSort {
    public void sortArray(){
        int []arr={2,1,3,5,6,8,31,12};
//定义一个数组
        System.out.println("冒号排序前的结果是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);

        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\n冒号排序后的结果是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        BubbleSort p=new BubbleSort();
        p.sortArray();
    }
}
