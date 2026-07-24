class Solution {
    // 205. Isomorphic Strings


    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = s.length();

        //Create array to store the index of character in both string.
        int[] indexS = new int[200];
        int[] indexT = new int[200];

        if(n1 != n2){
            return false;
        }
        // iterate through each character 
        for(int i=0;i<n1;i++){
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]){
                return false; // If different, strings are not isomorphic
            }

            indexS[s.charAt(i)] = i+1;
            indexT[t.charAt(i)]= i+1;
        }
        return true;

    }
}