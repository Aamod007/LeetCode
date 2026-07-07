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
    public ListNode mergeTwoLists(ListNode listOne, ListNode listTwo) {
        List<Integer> mergedValues = new ArrayList<>();
        while (listOne != null) {
            mergedValues.add(listOne.val);
            listOne = listOne.next;
        }
        while (listTwo != null) {
            mergedValues.add(listTwo.val);
            listTwo = listTwo.next;
        }
        Collections.sort(mergedValues);
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        for (int value : mergedValues) {
            currentNode.next = new ListNode(value);
            currentNode = currentNode.next;
        }
        return dummyHead.next;
    }
}