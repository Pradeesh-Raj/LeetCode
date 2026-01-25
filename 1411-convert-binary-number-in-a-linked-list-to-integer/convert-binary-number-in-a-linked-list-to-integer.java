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
    private static int lengthOfLL(ListNode head){
        if(head.next == null) return 1;
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public int getDecimalValue(ListNode head) {
        int power = lengthOfLL(head) - 1;
        int decimal = 0;
        ListNode temp = head;
        while(temp != null){
            if(temp.val == 1){
                decimal += Math.pow(2,power);
            }
            power--;
            temp = temp.next;
        }
        return decimal;
    }
}