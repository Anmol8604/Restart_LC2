/*
21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */
public class LeetCode21 {
    class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode ans;
        if(list1.val < list2.val) {
            ans = list1;
            list1 = list1.next;
        }
        else{
            ans = list2;
            list2 = list2.next;
        }
        ListNode res = ans;

        while((list1 != null && list2 != null)){
            if(list1.val < list2.val) {
                ans.next = list1;
                ans = list1;
                list1 = list1.next;
            }
            else{
                ans.next = list2;
                ans = list2;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            ans.next = list1;
            ans = list1;
            list1 = list1.next;
        }
        while(list2 != null){
            ans.next = list2;
            ans = list2;
            list2 = list2.next;
        }
        return res;
    }
}
