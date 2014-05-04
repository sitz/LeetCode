package MergeTwoSortedLists;

/**
 * Created by sitesh on 4/5/14.
 */

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode root = null;
        ListNode current = null;

        while (l1 != null && l2 != null) {
            int currentMin = Math.min(l1.val, l2.val);

            if (l1.val <= l2.val) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }

            ListNode listNode = new ListNode(currentMin);
            if (root == null) {
                root = listNode;
                current = root;
            } else {
                current.next = listNode;
                current = current.next;
            }
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return root;
    }
}
