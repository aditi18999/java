

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
       try(Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your 1st num");
             int a=in.nextInt();
             System.out.println("Enter your 2nd num");
             int b=in.nextInt();
             System.out.println("Enter your commmandd");
             char c =in.next().charAt(0);

            
             switch(c){
             
             case '+' -> {
               }
                case'-' -> {
               }
            
                default -> System.out.println("lol");
            
   }
        }
}
}


        
    
    

