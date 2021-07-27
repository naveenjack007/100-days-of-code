//package Day 2;
import java.util.*;

public class Odd {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();
        if (N%2 != 0) {
            System.out.println("Weird");
        }else if(N >= 6 && N <= 20) {
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
