/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // if slow==fast then true
 //if fast =null then false
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;//initialise (need to move 2 step)
        ListNode fast=head; //ini (need to move 2 step)


        while(fast!=null && fast.next!=null){ // to check if fast has a next value case 2 line 14
            slow=slow.next; //since value is there we move it to next point
            fast=fast.next.next;//since value is there we move it to next next point
             if (slow==fast){
                return true; //if at any point slow= fast that mean it's cyclic
             }

        }
        return false;
        
    }
}
