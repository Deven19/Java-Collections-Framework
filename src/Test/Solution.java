package Test;

class Solution {
    public int countSubstrings(String s) {
        int strlen = s.length();
        if (strlen == 1) return 1;
        int count = 0;
        for (int i = 0; i < strlen; i++) {
            count += expandFromCenter(s, i, i);
            count += expandFromCenter(s, i, i + 1);
        }
        return count;
    }

    private int expandFromCenter(String s, int begin, int end) {
        int c = 0;
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
            c++;
        }
        return c;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.countSubstrings("str"));

        for (int i = 0; i < "str".length(); i++) {
            for (int j = i+1; j <= "str".length(); j++) {
                System.out.println("str".substring(i,j));

            }
        }
    }
}