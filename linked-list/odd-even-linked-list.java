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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyOdd = new ListNode(0);
        ListNode dummyEven = new ListNode(0);
        ListNode current = head, even = dummyEven, odd = dummyOdd;
        int count = 1;
        while(current != null){
            if((count & 1) == 0){
                even.next = current;
                even = even.next;
            }
            else{
                odd.next = current;
                odd = odd.next;
            }
            count++;
            current = current.next;
        }
        even.next = null;
        odd.next = dummyEven.next;
        return dummyOdd.next;
    }
}