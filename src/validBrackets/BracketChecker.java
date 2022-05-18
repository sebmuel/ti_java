package validBrackets;

import java.util.Stack;

public class BracketChecker {
    public static boolean check(String str){
        Stack<Character> stack = new Stack<>();

        for (Character ch :  str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
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
