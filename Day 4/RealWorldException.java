import java.util.Scanner;

public class RealWorldException {
    public static void main(String[] args) {
        try {
            int userid;
            Scanner input = new Scanner(System.in);
            userid = input.nextInt();
            input.close();
            System.out.println("Your User Id is "+userid);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Please enter only numeric Values");

        }
    }
}
