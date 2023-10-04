import java.util.Arrays;
public class shuzu{
    public static void main(String args[]) {
        shuzu A=new shuzu();
        int []a=new int[]{3,4,5,6,0,0,0,0};
        int []b=new int[]{6,7,8,9};
        A.Getnum(a,4,b,4);
    }
    public void Getnum(int []A,int m,int []B,int n) {
        int i=m-1;//数组M现在的长度
        int j=n-1;//数组N现在的长度
        int t=m+n-1;//数组M的实际长度
        while(i>0&&j>0) {   //如果i,j满足要求则持续执行此循环
            if(A[i]>B[j]) {
                A[t--]=B[i--];
            }else {
                A[t--]=B[j--];    		}
        }
        while(j>=0) {     //如果N数组顺利填充到M数组里则用不到，如果从后

            A[t--]=B[j--];
        }
        System.out.println(Arrays.toString(A));
    }
}


