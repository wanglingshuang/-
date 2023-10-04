/*梯子问题（两种方法递归和动态规划）
* 宜宾学院A区硕勋楼前的阶梯有108梯，
*同学们上该阶梯时每一步可以只上一梯也可以上二梯，
* 问总共有多少种不同的上梯方式。
 */
//2023.10.2 by 王凌霜
//打算用动态规划来解决该问题
//思路：dp[n] = dp[n - 1] + dp[n - 2]
public class ladder {
    public static void main(String[] args) {
        //n = 0是不需要上梯所以是0，n = 1时返回1；
        int n = 108;
        //我们需要创建一个数组来保存历史数据
        int []dp = new int[n + 1];
        //我们需要给出初始值
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        //根据思路也就是关系式，来计算dp[n]
        for(int i=3 ;i <= n;i++ ){
            dp[i] = dp[i - 1] + dp[i - 2];
            //dop[2] = 2;
        }
        System.out.println("总共有" + dp[n] +"种不同的上梯子的方式");

    }

    }
