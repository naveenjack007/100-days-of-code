import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        input.close();
        if(number < 0)
        {
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }

    }
    
}
