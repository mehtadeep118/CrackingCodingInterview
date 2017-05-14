/**
 * Created by Deep Mehta  on 5/9/17.
 */
public class longestCommonPrefix {

    public static void main(String[] args){
        String[] test={"geeks","gee","geek"};
        System.out.println(longestCommonPrefix(test));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)

                prefix = prefix.substring(0, prefix.length() - 1);


        return prefix;
    }

}
