package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className YanghuiTest
 * @description 杨辉三角
 * @since 2021/7/29 9:55 下午
 */
public class YanghuiTest {
    public static void main(String[] args) {
        //创建二维数组
        int triangle[][]=new int[10][];

        //遍历二维数组的第一层
        for (int i = 0; i <triangle.length ; i++) {
            //初始化第二层数组的大小
            triangle[i]=new int[i+1];

            //遍历二维数组
            for (int j = 0; j <=i ; j++) {
                //将两侧的数组元素赋值为1
                if (i==0||j==0||j==i){
                    triangle[i][j]=1;

                }
                else {
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                }
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
