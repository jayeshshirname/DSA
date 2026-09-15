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
 import java.util.ArrayList;

class Solution {

    public int Length(ListNode head) {   //find a length of a given Linkedlist.
        int count = 0;              //count 0 par set karo

        while(head != null) {     //while loop jab tak chalega tab tab linkedlist null nahi hoti
            count++;    //count++ karte jaav
            head = head.next;       //next element par jav/
        }
        return count;  //count return karo.
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {         //head null hai aur head ka agla element null hai to head ko print kar do.
            return head;
        }
        ArrayList<Integer> oddList = new ArrayList<>();  //odd element ko add karne ke liye arraylist banav.
        ArrayList<Integer> evenList = new ArrayList<>();  //even element ko add karne ke liye alag se arraylist banav.
        int n = Length(head);
        int position = 1;       //position set kar do 1

        // normally traverse karo while loop se aur ek-ek element check karke Array mai dalte jaav
        while(head != null) {
            if(position % 2 == 1) {
                oddList.add(head.val);
            } 
            else {
                evenList.add(head.val);
            }
            position++;
            head = head.next;
        }

        // new linkedlist tyar karo.
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // first odd position ke element add karo new linkedlist mai 
        for(int value : oddList) {
            current.next = new ListNode(value);
            current = current.next;
        }

        //even position ke element add karo new linkedlist mai.
        for(int value : evenList) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;      //last mai puri ki puri linkedlist return kardo.
    }
}