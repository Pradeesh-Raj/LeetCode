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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        if(head.next == null || k == 0) return head;
        int N = 0;
        ListNode temp = head;
        while(temp != null){
            N++;
            temp = temp.next;
        }
        k = k % N;
        temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = head;
        temp = head;
        for(int i = 1 ; i < N - k ; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}