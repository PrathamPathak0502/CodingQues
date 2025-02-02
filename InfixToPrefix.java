//Prefix to infix 
//Infix to Prefix

import java.util.Stack;

public class InfixToPrefix {

 
  public static int precedence(char op) {
    switch (op) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
      default:
        return -1;
    }
  }

  
  public static String infixToPrefix(String infix) {
    StringBuilder prefix = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    
    for (int i = infix.length() - 1; i >= 0; i--) {
      char ch = infix.charAt(i);

      
      if (Character.isLetterOrDigit(ch)) {
        prefix.append(ch);
      } else if (ch == ')') {
        stack.push(ch);
      } else if (ch == '(') {
        while (!stack.isEmpty() && stack.peek() != ')') {
          prefix.append(stack.pop());
        }
        stack.pop(); 
      } else {
        
        while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
          prefix.append(stack.pop());
        }
        stack.push(ch); 
      }
    }

   
    while (!stack.isEmpty()) {
      prefix.append(stack.pop());
    }

    return prefix.toString();
  }

  public static void main(String[] args) {
    String infix = "(a-b/c)*(a/k-l)";
    String prefix = infixToPrefix(infix);
    System.out.println("Original infix expression: " + infix);
    System.out.println("Prefix expression: " + prefix); // Output: *-a/bc-/akl
  }
}
String infix = "(a-b/c)*(a/k-1)";
String prefix= infixToPrefix(infix);
Systrm.out.println("original infix");
System.out.println("prefix expression");

//reverse it for next program
