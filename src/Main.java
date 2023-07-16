public class Main {

//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"

    // time complexity - O(n) + space complexity O(1)
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    // // time complexity - O(n) + space complexity O(m) [m == the length of the common prefix]
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }

            prefix.append(c);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] text = new String[]{"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(text));
        System.out.println(longestCommonPrefix2(text));
    }
}