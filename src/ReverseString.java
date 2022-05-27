import java.util.Stack;

public class ReverseString {

    public void reverseString(String s) {
        Stack<Character> stack = new Stack<>();
            for(int i = s.length() -1; i >= 0; i--) {
            stack.push(s.charAt(i));
            }

        System.out.println(stack);

        }

    }

