public class Excepion {
    public static void main(String[] args) {
        /*try{
            int i = 1/0;

        }*/
        try {
           int i = 1/0; 
        } catch (Exception e) {
            System.out.println("Please Check the correctness of your code");
        }
    }
}
