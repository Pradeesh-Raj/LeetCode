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
class Solution {
    private static int length(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = length(head);
        if(N == n){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        for(int i = 1 ; i <= N-n ; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
        return head;
    }
}