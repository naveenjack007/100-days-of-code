import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class If {

//Write your code here
    static int B;
    static int H;
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    static boolean flag;
    if(B < 0 || H < 0)
    {
        flag = false;
    } 
    else{ssssssss
        flag = true;
    }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
		
	}//end of main

}//end of class
