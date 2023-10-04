/*3.自然数的拆分（中等）
任何一个大于1的自然数n，总可以拆分成若干个小于n的自然数之和。试求自然数n的所有不同的拆分。*/
//2023.10.2 by 王凌霜

public class split{
    public static void main(String[]args){
        //也可以进行输入，但为了方便就用9
        int n = 9;
        //System.out.println(n);
    splitNumber(n,new int[n],0);
    }
    public static void splitNumber(int n,int[]result,int index){
        //当n = 1后，再次调用splitNumber(),此时n = 0，我们需要将上面的运算过程都打印出来
        if(n == 0) {
            for (int i = 0; i < index; i++) {
                System.out.print(result[i]);
                if (i < index - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println();
            return;
        }
        for(int i = 1;i <= n;i++){
            //坐标索引为0或者i 比索引的的前一个元素要大或者相等
            //n = 9;9 = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
        if(index == 0||i >= result[index - 1]){
            //比如说上面的例子，i = 1，index == 0,那么result[index] = result[0] = 1
            result[index] = i;
            //用递归
            splitNumber(n - i,result,index + 1);
            //n - 1以后，n = 8,index 变成了1，int 1 = 1,i还是小于n,result[index - 1] = 1,
            //(i = 1) >= result[index - 1],result[index] = result[2] = i = 1.
        }
        }
    }
}
