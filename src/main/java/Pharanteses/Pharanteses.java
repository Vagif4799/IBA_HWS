package Pharanteses;

import java.util.Stack;

public class Pharanteses {

        public Stack<String> stack1 = new Stack<>();


        public int calculator (String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '(' && word.charAt(i+1) != ')') {
                stack1.push("(");
            }
        }

        return stack1.size()+1;
    }


}
