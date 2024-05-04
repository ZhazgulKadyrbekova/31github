package done;

import java.util.Stack;

/*
Simple advise!
We add each char to stack till we get ], in
this case, we can start decoding by taking last
values from stack, process them (crate string,
and multiply to integer) and push back into stack,
hope it will help you to find right direction.
 */

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
//            System.out.printf(ch + "\t");
            if (ch != ']') {
                stack.push(String.valueOf(ch));
            }
            else {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    String lastElem = stack.lastElement();
                    if (!lastElem.equals("[")) {
                        sb.insert(0, lastElem);
                        stack.pop();
                    } else {
                        //remove [
                        stack.pop();
                        break;
                    }
                }
//                System.out.println(sb);

                int k = 0, power = 0;
                while (!stack.isEmpty()) {
                    char lastElem = stack.lastElement().toCharArray()[0];
                    if (lastElem >= '0' && lastElem <= '9') {
                        k += (lastElem - '0') * Math.pow(10, power++);
                        stack.pop();
                    } else {
                        break;
                    }
                }
//                System.out.println(k);

                sb.append(sb.toString().repeat(Math.max(0, k - 1)));
                stack.push(sb.toString());
            }
//            System.out.println(stack);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
