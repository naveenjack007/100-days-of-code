import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          this.age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          String s;
          if(age < 0)
          {
              
              age = 0;
              System.out.println("Age is not valid, setting age to 0.");
              s = "You are young.";
          }
          if(age < 13)
          {
              s = "You are young.";

          }
          else if(age >= 13 && age < 18)
          {
              s = "You are a teenager.";
          }
          else{
              s = "You are old.";
          }
        
          System.out.println(s);
	}

	public void yearPasses() {
  		// Increment this person's age.
          age = age + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}