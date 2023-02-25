package com.backstreetbrogrammer.part2_other.Q1_AddTwoNumbers;

import com.backstreetbrogrammer.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode dummy = new ListNode();
        ListNode current = dummy;

        int carry = 0;
        while ((l1 != null) || (l2 != null) || (carry != 0)) {
            int val1 = 0, val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }

            int val = val1 + val2 + carry;
            carry = val / 10;
            val %= 10;
            current.next = new ListNode(val);

            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

}
