package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className selectsort
 * @description 选择排序法进行数组排序
 * @since 2021/8/1 10:52 下午
 */
public class selectsort {
    public static int[] orderby(int[]nums ,String str){
        if (str.equalsIgnoreCase("desc")){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1   ; j < nums.length ; j++) {
                    if (nums[i]<nums[j]){
                        int tem=nums[i];
                        nums[i]=nums[j];
                        nums[j]=tem;
                    }
                }
            }
        }
        else if (str.equalsIgnoreCase("esc")){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1    ; j < nums.length ; j++) {
                    if (nums[i]>nums[j]){
                        int tem=nums[i];
                        nums[i]    =nums[j];
                        nums[j]=tem;
                    }
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int []nums =orderby(new int[]{1,5,3,4,43 ,6345,7657,575,34545,453,4},"desc");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");

        }

    }
}

