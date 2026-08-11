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
    public ListNode middleNode(ListNode head) {
        ListNode comp = head;
        int count = 0;
        while(comp != null)
        {
            count++;
            comp = comp.next;
        }
        int midIndex = (count / 2) + 1;
        comp = head;
        count = 1;
        while(comp != null)
        {
            if(count == midIndex)
            {
                head = comp;
                break;
            }
            comp = comp.next;
            count++;
        }
        return head;
    }
}