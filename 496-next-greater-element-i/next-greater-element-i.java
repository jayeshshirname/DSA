import java.util.*;
import java.util.HashMap;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for(int value : nums2){
            while(!stack.isEmpty() && stack.peek() < value){
                map.put(stack.pop(),value);
            }
            stack.push(value);
        }


        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}