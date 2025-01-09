package newhello;

import java.util.Scanner;
import java.awt.*;

public class hello1 {
    public static int num1, num2, num3, choice;
      public static void main(String[] args) {
           choice=1;
           do {
                math();
           }while(choice==1);
          while (num3 == 0) {
               prompt();
         }
    }
    
    public static void math(){
       try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number");
        num1 =scanner.nextInt();
        System.out.println("enter 2nd number");
        num2=scanner.nextInt();
        num3 = num1+num2;
        System.out.println("the answer is : "+num1 +"+"+ num2
           +"=" + num3);
           num3 = 1;
            choice = 3;
           prompt();
         }catch(Exception e){
             System.out.print("invalid input try again"+"\n");
             num3 =0;
         }
        
    }
    public static void prompt(){
        choice = 3;
        try{
            while (choice == 3){
                Scanner scan2 = new Scanner(System.in);
                System.out.println("to continue press"+" 1 and to exit press 2\n");
                choice = scan2.nextInt();
            
                if (choice == 1){
                     math();
                 }else if(choice == 2){
                     System.out.println("have a nice time .. bye!");
                      num3 = 5;
                 }else{
                      System.out.println("invalid choice. choose again");
                     choice = 3;
                 }
            }
        }catch(Exception e){
            System.out.println("invalid choice. choose again");
             num3=1;
            choice = 3;
             gui();
        }
    }
     public static void gui(){
         prompt();
     }
}
