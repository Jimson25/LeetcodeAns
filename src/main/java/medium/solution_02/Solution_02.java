package medium.solution_02;

public class Solution_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, node = null;
        // 进位标志，如果发生进位这里值为1
        int cFlag = 0;

        while (l1 != null || l2 != null) {

            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + cFlag;

            int nodeVal = sum % 10;
            // 判断是否进位
            cFlag = sum / 10;

            ListNode n = new ListNode(nodeVal);

            if (head == null) {
                head = n;
            }

            if (node != null) {
                node.next = n;
            }
            node = n;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (cFlag != 0) {
            node.next = new ListNode(cFlag);
        }
        return head;
    }


}
