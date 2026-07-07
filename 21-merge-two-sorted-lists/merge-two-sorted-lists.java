/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a placeholder anchor node
        ListNode dummy = new ListNode(0);
        // Pointer to track the last node of the merged list
        ListNode tail = dummy;
        
        // Loop while there are elements in both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;   // Link list1 node
                list1 = list1.next;  // Advance list1 pointer
            } else {
                tail.next = list2;   // Link list2 node
                list2 = list2.next;  // Advance list2 pointer
            }
            tail = tail.next;        // Move tail forward
        }
        
        // If one of the lists still has remaining nodes, append them directly
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        // The merged list actually starts right after the dummy node
        return dummy.next;
    }
}