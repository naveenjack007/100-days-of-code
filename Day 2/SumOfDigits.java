//import java.lang.reflect.Array;
import java.util.*;

public class SumOfDigits{
    public static void main(String[] args) {

        int n;
        int sum = 0;
        int digit;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        while(n > 0){
            digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println(sum);

    }
}