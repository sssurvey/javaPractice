public class BlancedBrackets{

    public static boolean isBalanced(String expression) {
        String temp = expression;
        int str_len = expression.length();
        String front_half = temp.substring(0, str_len / 2);
        StringBuilder sb = new StringBuilder();

        sb.append(front_half);

        for (int i = front_half.length()-1; i >=0; i--) {
            if (front_half.charAt(i) == '{') {
                sb.append('}');
            } else if (front_half.charAt(i) == '[') {
                sb.append(']');
            } else if (front_half.charAt(i) == '(') {
                sb.append(')');
            }
        }
        String compare = sb.toString();

        return compare.equals(expression);
    }


    public static void main(String[] args){
        String s = "{{[[(())]]}}";
        System.out.println(isBalanced(s));

    }
}