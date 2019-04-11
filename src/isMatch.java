import java.util.Scanner;
import java.util.Stack;

/**
 * Created by valar on 2019/4/11.
 */
public class isMatch {
    static boolean isMatch(String str) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(str.charAt(0));
        for (int i =1;i<str.length();++i){
            Character c1 = (Character) stack.peek();
            Character c2 = str.charAt(i);
            if ((c1.toString().equals("(") && c2.toString().equals(")"))
                    || (c1.toString().equals("[") && c2.toString().equals("]"))
                    || (c1.toString().equals("{") && c2.toString().equals("}")))
                stack.pop();
            else {
                stack.push(c2);
            }
        }
        return stack.isEmpty();

    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
        res = isMatch(_str);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
