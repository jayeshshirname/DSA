/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class ListNode {
//     int data;
//     ListNode next;

//     ListNode(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

class Solution {

    static int Length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode middleNode(ListNode head) {
        int n = Length(head);
        int mid = n/2;

        if(n==1){
            mid = 0;
        }
        if(n==2){
            mid = 1;
        }

        for(int i = 0; i < mid; i++){   
            head = head.next;
        }
        return head;   
    }
}