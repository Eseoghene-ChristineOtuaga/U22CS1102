 import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double x, y, result;
     char operator;

     System.out.println("Welcome!"); 
     System.out.println("Enter two numbers");
     x = input.nextDouble();
     y = input.nextDouble();
     System.out.println("Enter an operator (+,-,*,/,^,%): ");
     operator = input.next().charAt(0);
     // I tried to use a switch operator but it didn't work so I used the If/else statement instead.
     if (operator == '+'){
        result = x + y;
        System.out.println( result );
       System.out.println( " Have a nice day!" ); 
        } 
     else if (operator == '-'){
            result = x - y;
            System.out.println( result);
             }
     else if (operator == '*'){
        result = x * y;
        System.out.println( result);
        }
        else if (operator == '/'){
            result = x / y;
            System.out.println( result);
            }
            else if (operator == '%'){
                result = x % y;
                System.out.println( result);}
                else if (operator == '^'){
                    result = Math.pow(x, y);
                    System.out.println( result);
                    }
                    else if( operator== '/'){
                        if( y !=0){
                            result = x/y;
                            System.out.println( x/y);
                        } 
                        else{ System.out.println("Error!");}
                    }
                        else {
                              System.out.println("Invalid operator");
                                    }
                                    // Made by Ese.
    
    }
    
}