//package Day 3;
import java.lang.*;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        input.close();
        for(int i = 1;i <= 10;i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
