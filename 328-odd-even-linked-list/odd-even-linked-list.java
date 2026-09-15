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

    public int Length(ListNode head) {
        int count = 0;

        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        int n = Length(head);
        int position = 1;

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

        // New Linked List create karna
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // First odd positions
        for(int value : oddList) {
            current.next = new ListNode(value);
            current = current.next;
        }

        // Then even positions
        for(int value : evenList) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}