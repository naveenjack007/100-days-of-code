import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
        {
            i++;
            System.out.println(i+ " " + input.nextLine());
        }
    }
}
