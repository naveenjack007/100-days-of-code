import java.io.*;
import java.util.*;
import java.lang.*;

public class InputOutput{
    public static void main(String[] args) {
        int a;
        double b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextDouble();
        input.nextLine();
        String s = input.nextLine();
        input.close();
        System.out.println("String: "+s);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);

    }
}