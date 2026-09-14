import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;        //nums array ki length find karo
        ArrayList<Integer> squares = new ArrayList<>();  //aapne ko array ke squares banakar rakhne ke liye new ArrayList;

        for(int i=0;i<n;i++){           //traverse karo
            int absValue = Math.abs(nums[i]);   //array ke ek-ek element ko abs karo
            int squ = (int) Math.pow(nums[i],2);   //array ke element ke square banav
            squares.add(squ);   //usko new arraylist mai add karo
        }

        Collections.sort(squares);   //1.built in function laga kar sort karo

        //without using built in function mai yaha par bubble-sort bhi use kar sakta tha.
        //2.Bubble Sort ka logic lagaya
        // for(int i=0;i<squares.size()-1;i++){
        //     for(int j=0;j<squares.size()-i-1;j++){
        //         if(squares.get(j) > squares.get(j+1)){
        //             int temp = squares.get(j);
        //             squares.set(j, squares.get(j + 1));
        //             squares.set(j + 1, temp);
        //         }
        //     }
        // }
        int[] result = new int[n];  //new result ka array banav kewki return type siddha arraylist mai hoga usko int[] array mai convert karna hoga.

        for(int i=0;i<n;i++){
            result[i] = squares.get(i);   //ek-ek element arraylist ka add karo result mai
        }
        return result;   //last mai int[] array ko return karo
        
    }
}