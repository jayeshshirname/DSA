class Solution {
    public int vowelConsonantScore(String s) {
        int n = s.length();

        int vowels = 0;    //vowels count karne ke liye.
        int consonants = 0;   //consonants count karne ke liye.


        for(int i=0;i<n;i++){
            char ch = s.charAt(i);  //jo string di hai uska 1-1 character alag traver hoga.
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){  //agar vowel hua to vowels++.
                vowels++;
            }
            else if(Character.isLetter(ch)) {
                consonants++;   //otherwise consonants++.
            }
        }

        // if(vowels == 1){
        //     if(consonants == 1){
        //         return 1;
        //     }
        //     else {
        //         return 0;
        //     }
        // }

        // if(consonants == 0){
        //     return vowels;
        // }

        return consonants==0?0:vowels/consonants;  //return karega vowels/consonants.
    }
}