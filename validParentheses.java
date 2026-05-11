import java.util.Stack; 
public class validParentheses {
    public static void main(String[] args) {
        validParentheses solver = new validParentheses();
        String test1 = "()[]{}";
        String test2 = "(]";
        System.out.println("Is '()[]{}' valid? " + solver.isValid(test1));
        System.out.println("Is '(]' valid? " + solver.isValid(test2));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
