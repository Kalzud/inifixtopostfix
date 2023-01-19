
/**
 * This class shows the infix to posfix 
 * expression coverter coding.
 * Emmanuel Okala Uduma
 */
public class InfixToPostfix
{
    public static int precedence(char ch)//this is to check the charcters and there precedenc the higher the precedence the higher the number assigned
    {
        switch(ch)//this would test the charcters against each case stated to return a number
        {
            case '+':
            case '-':
            return 1;
            
            case '*':
            case '/':
            return 2;
            
            case '^':
            return 3;
        }
        return -1;
    }
    
    public static String infixToPostfix(String infix)//changing infix to postfix
    {
        String result = new String("");//initilize new string for result
        Stack stack = new LinkedStack();//initializing new stack
        
        for (int i = 0; i < infix.length(); i++)
        {
         char c = infix.charAt(i);// this code would find the character of the particular index i is on
            
         //this code is to move evry operand encountered straight to output
         if (Character.isLetterOrDigit(c))
         result += c; //adds charcter to result
          
         //to handle left brackets
         else if (c == '(')//if scanned character is '('
         stack.push(c);//push it into the stack
         
         //to handle right brackets
         else if (c == ')')//if scanned character is ')' 
         {
          while (!stack.isEmpty() &&  !stack.peek().equals('('))//loop runs if the stack is not empty and a left bracket has not been reache
         
          result += stack.pop();//pop characters to the result 
             //stack.push(c);//pop character
         stack.pop();
        }
         
         else
         {
         //to handle operators encountered
        while (!stack.isEmpty() && precedence(c) <= precedence((Character)stack.peek()))//loop runs if stack is not empty an return value of operator in switch is not greater than return value of first operator
        {
           result += stack.pop(); //pop operators from stack
        }
        stack.push(c);// push character into stck if it is empty or the return value in switch is greater than th return value of first operator
       
        }    
        }
        //popping the remaining operators in stack
        while (!stack.isEmpty())
        {
            if(stack.peek().equals('('))
            return "invalid  Expression";
        result += stack.pop();
        }
        return result;
    }  
}
