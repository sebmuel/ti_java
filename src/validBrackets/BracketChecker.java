package validBrackets;

import java.util.HashMap;
import java.util.Stack;

public class BracketChecker {
    public static boolean check(String str){
        Stack<Character> stack = new Stack<>();
        for (Character ch :  str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            // if current char is a closing bracket of any kind and the stack is empty we can return false
            if (stack.isEmpty() && (ch == ']' || ch == '}' || ch == ')')){
                return false;
            }
            char topOfStack;
            switch(ch){
                case ')' -> {
                    topOfStack = stack.pop();
                    if (topOfStack == '{' || topOfStack == '['){
                        return false;
                    }
                }
                case '}' -> {
                    topOfStack = stack.pop();
                    if (topOfStack == '[' || topOfStack == '('){
                        return false;
                    }
                }
                case ']' -> {
                    topOfStack = stack.pop();
                    if (topOfStack == '(' || topOfStack == '{'){
                        return false;
                    }
                }
            }
        }
        return (stack.isEmpty());
    }

}
