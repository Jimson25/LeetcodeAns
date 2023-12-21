package medium.solution_02;

import java.util.List;

public class MainSolution02 {
    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        Solution_02 s = new Solution_02();

//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

//        ListNode l1 = constructNode(1);
//        ListNode l2 = constructNode(1999999999);
//        ListNode listNode = s.addTwoNumbers(l1, l2);

        ListNode node1 = s.parseNumToNode(9);
        ListNode node2 = s.parseNumToNode(9999999991L);
        ListNode node = s.addTwoNumbers(node1, node2);


        System.out.println("MainSolution02.main");
    }

}
