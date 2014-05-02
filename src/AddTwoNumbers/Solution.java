package AddTwoNumbers;

/**
 * Created by sitesh on 3/5/14.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode listNode = new ListNode(sum);
            if (root == null) {
                root = listNode;
                current = root;
            } else {
                current.next = listNode;
                current = current.next;
            }
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return root;
    }
}
