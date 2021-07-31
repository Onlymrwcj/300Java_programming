package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className ThreeDigit
 * @description 1、2、3、4能组成多少个互不相同的三位数
 * @since 2021/7/31 5:27 下午
 */
public class ThreeDigit {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        System.out.println("满足条件的三位数是：");
        for (int i = 0; i < a.length; i++) {
            //百位数
            for (int j = 0; j < a.length; j++) {
                if (j==i)
                    continue;
                //十位数
                for (int k = 0; k <a.length; k++) {
                    if (k==i||k==j)
                        continue;
                    //个位数
                    for (int l = 0; l < a.length; l++) {
                        if (l==i||l==j||l==k){
                            continue;
                        }
                        System.out.println(a[j]*100+a[k]*10+a[l]+" ");
                    }
                }
            }
        }
    }
}
