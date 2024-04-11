//import java.util.Stack;
//
//public class StringToken {
//    public static void main(String[] args) {
//        String exp = "[()]{}{[()()]()}";
//        System.out.println(expCheck(exp));
//    }
//
//    private static String expCheck(String exp) {
//        Stack<Character> characterStack = new Stack<Character>();
//        String result;
//        int length = exp.length()-1;
//        Character ch;
//        for(int i=0;i<length;i++){
//            ch = exp.charAt(i);
//            if(ch=='(' || ch=='{' || ch=='['){
//                characterStack.push(ch);
//            }else if(ch=='}'){
//                if(characterStack.isEmpty() || characterStack.pop()!='{'){
//                    result="Unbalanced";
//                    return result;
//                }
//
//            } else if (ch==']') {
//                if(characterStack.isEmpty() || characterStack.pop()!='['){
//                    result="Unbalanced";
//                    return result;
//                }
//
//            }
//            else if (ch==')') {
//                if(characterStack.isEmpty() || characterStack.pop()!='('){
//                    result="Unbalanced";
//                    return result;
//                }
//
//            }
//            else{
//                result="Balanced";
//                return result;
//            }
//        }
//
//
//
//    }
//}
