//2023.9.24
//maopao.java by wanglingshuang
import java.util.Arrays;
public class maopao {
    public static void main(String[] args) {
    int []a = {6,5,4,3,2,1};
    System.out.println(Arrays.toString(a));
    bubble(a, a.length - 1);
    System.out.println(Arrays.toString(a));
    }

    public static void bubble(int[] a,int j){
        if(j == 0){
            return;
        }
        for(int i = 0;i < j;i++){
            if(a[i] > a[i +1]) {
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
            }
        }
        bubble(a,j - 1);
    }

}
