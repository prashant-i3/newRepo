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
class x2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to start the result list
        ListNode current = dummy;
        int carry = 0; // Initialize carry to 0

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

            int digit = sum % 10;
            carry = sum / 10;

            current.next = new ListNode(digit); // Create a new node with the calculated digit
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // If there is a remaining carry, create a new node
        }

        return dummy.next; // Return the head of the resulting list (excluding the dummy node)
    }

    public static void main(String[] args) {
        // Example usage of the addTwoNumbers function
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    
        // Create an instance of the x2AddTwoNumbers class
        x2AddTwoNumbers adder = new x2AddTwoNumbers();
    
        // Call the addTwoNumbers function and store the result in the 'result' ListNode
        ListNode result = adder.addTwoNumbers(l1, l2);
    
        // Print the result
        printList(result);  
    }

    // Helper method to print the values of a linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
