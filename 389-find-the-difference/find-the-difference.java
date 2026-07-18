class Solution {
    // 389. Find the Difference
    
    public char findTheDifference(String s, String t) {

        StringBuilder sb = new StringBuilder(t);
        int n1 = s.length();
        int n2 = s.length();

        for(int i=0;i<n1;i++) {
            char ch = s.charAt(i);
            for(int j=0; j<n2;j++) {
                if (ch == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    break;
                }
            }
        }
        return sb.charAt(0);
    }
}