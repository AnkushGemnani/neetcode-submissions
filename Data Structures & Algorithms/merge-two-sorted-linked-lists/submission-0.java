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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify handling the head
        ListNode dummy = new ListNode(-1);

        // Tail always points to the last node of the merged list
        ListNode tail = dummy;

        // Compare both lists until one becomes empty
        while (list1 != null && list2 != null) {

            // Take the smaller node
            if (list1.val <= list2.val) {
                tail.next = list1;   // Attach list1 node
                list1 = list1.next;  // Move list1 forward
            } else {
                tail.next = list2;   // Attach list2 node
                list2 = list2.next;  // Move list2 forward
            }

            // Move tail to the newly added node
            tail = tail.next;
        }

        // If list1 still has nodes, attach them
        if (list1 != null) {
            tail.next = list1;
        }

        // If list2 still has nodes, attach them
        if (list2 != null) {
            tail.next = list2;
        }

        // Return the merged list (skip dummy node)
        return dummy.next;
    }
}