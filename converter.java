import java.util.Scanner;
/**
 * Takes the oinmfix and converts to postfix
 *
 * Emmanuel Okala Uduma
 */
public class converter
{
    
    public void converter()
    {
        // initialise instance variables
        Scanner scanner = new Scanner(System.in);
        String exp;
        InfixToPostfix postfix = new InfixToPostfix();
        System.out.println("Enter infix expression: max 20 characters");
        exp = scanner.nextLine();
        
        if(exp.length()>20)
        {
            String e = exp.substring(0,20);
            exp = e;
            System.out.println("More than 20 chracters");
        }
        else 
        {
            System.out.println("Postfix: " + postfix.infixToPostfix(exp));
        }
    }
}
