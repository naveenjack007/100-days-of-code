import java.lang.*;
import java.util.*;
public class Loops2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            //double s[] = new double[100];
            for(int k = 0;k < n; k++ )
            {
                a += Math.pow(2,k)*b ;
                System.out.printf("%s ",a);

            }
            System.out.println();
        }
        in.close();
    }
}