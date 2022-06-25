package Algoexpert.Stack;

import java.util.Stack;
//https://www.algoexpert.io/questions/balanced-brackets
public class BalancedBrackets {
    class Program {
        public boolean balancedBrackets(String str) {
            // Write your code here.
            Stack<Character> stack=new Stack<>();
            int i=0;
            while(i<str.length()){
                if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                    stack.push(str.charAt(i));
                }

                else if( !stack.isEmpty() && str.charAt(i)==')' && stack.peek()=='('){
                    stack.pop();
                }

                else if( !stack.isEmpty() &&str.charAt(i)=='}' && stack.peek()=='{'){
                    stack.pop();
                }

                else if(!stack.isEmpty() &&str.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }

                //if ,match not found
                else if(!stack.isEmpty() && (str.charAt(i)==']' || str.charAt(i)==')') ||
                        str.charAt(i)=='}'){
                    return false;
                }

                //if close bracket came but stack is empty
                else if(stack.isEmpty() && (str.charAt(i)==']' || str.charAt(i)==')') ||
                        str.charAt(i)=='}'){
                    return false;
                }





                i++;
            }

            if(stack.isEmpty()) return true;
            return false;
        }
    }

}
