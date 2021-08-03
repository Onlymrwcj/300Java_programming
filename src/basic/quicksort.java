package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className quicksort
 * @description 快速排序法进行数组排序
 * @since 2021/8/3 9:27 下午
 */
public class quicksort {
    public static void main(String[] args) {
        int[] intarray={123,32,453,56,67,35,67,43,54};
        System.out.println("数组排序前");
        for (int i = 0; i < intarray.length ; i++) {
            System.out.println(" " + intarray[i]);
            //每五个元素换一行
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
            System.out.println();
            int []b=quicksort(intarray,0,intarray.length-1);


            System.out.println("数组排序后的数组");
            for (int j = 0; j < b.length; j++) {
                System.out.println(" "+b[j]);
                if ((j+1)%5==0){
                    System.out.println();
                }
            }
        }








    public static int getMiddle(int[]array,int left,int right){
        int temp;
        int mid=array[left];
        while (left<right){
            while (left<right&&array[right]>=mid)
                right--;
            //将比中心点小的数据移动到左边
            temp=array[right];
            array[right]=array[left];
            array[left]=temp;
            while (left<right&&array[left]<=mid)
                left++;
            //将比中心点大的数据移动到右边
            temp=array[right];
            array[right]=array[left];
            array[left]=temp;
        }
        array[left]=mid;
        //将中心移到正确的位置
        return left;
    }
    public static  int[] quicksort(int[]array,int left,int right){
        if (left<right-1){
            int mid=getMiddle(array,left,right);
            //重新获取中间点
            quicksort(array,left,right);
            quicksort(array, mid+1, right);
        }
        return array; }
}