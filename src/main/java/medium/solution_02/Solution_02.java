package medium.solution_02;

public class Solution_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 解析l1为整数
        long n1 = parseNodeToNum(l1);

        // 解析l2为整数
        long n2 = parseNodeToNum(l2);

        // 将l1和l2的和转换为链表
        return parseNumToNode(n1 + n2);
    }

    private long parseNodeToNum(ListNode node) {
        long mul = 1, res = 0;
        do {
            res = res + node.val * mul;
            node = node.next;
            mul *= 10;
        } while (node != null);
        return res;
    }

    public ListNode parseNumToNode(long num) {
        //807
        ListNode node = null, header = null;
        do {
            int l = (int) (num % 10);
            ListNode listNode = new ListNode(l, null);
            if (node != null) {
                node.next = listNode;
            } else {
                header = listNode;
            }
            node = listNode;
            num /= 10;
        } while (num > 0);
        return header;
    }
}
