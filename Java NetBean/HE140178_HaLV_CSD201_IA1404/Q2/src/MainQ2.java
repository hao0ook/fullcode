// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
import java.util.*;
public class MainQ2
 {public static void main(String args[])
   {char choice;
    Scanner r = new Scanner(System.in);
    MyList t = new MyList();
    while(true)
     {System.out.println();
      System.out.println(" 1. Test f1 (1 mark)");
      System.out.println(" 2. Test f2 (1 mark)");
      System.out.println(" 3. Test f3 (1 mark)");
      System.out.println(" 4. Test f4 (1 mark)");
      System.out.println(" 0. Exit ");
      System.out.print("    Your selection (0 -> a): ");
      choice = r.nextLine().trim().charAt(0);
      choice = Character.toUpperCase(choice);
      if(choice=='0') break;
      switch(choice)
       {
        case '1': System.out.println("\n 1. Test f1:");
                    t.f1();                    
                    break;

        case '2': System.out.println("\n 2. Test f2:");
                    t.f2();                    
                    break;

        case '3': System.out.println("\n 3. Test f3:");
                    t.f3();                   
                    break;

        case '4': System.out.println("\n 4. Test f4:");
                    t.f4();
                    System.out.println("Your output:");                    
                    break;
       }
     }      
    System.out.println();
   }
 }
