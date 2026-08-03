class Solution {
    public boolean isPalindrome(String s) {
        String str1 = "";
        String str2 = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str1 = str1 + c;
                str2 = c + str2;
            }
        }
        return str1.equals(str2);
    }
}