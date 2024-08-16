//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

public class AddTwoNumber {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4, 4};
        int len_l1 = l1.length;
        int len_l2 = l2.length;
        int max_len = Math.max(len_l1, len_l2);
        int carry = 0;

        int[] l3 = new int[max_len + 1];

        for (int i = 0; i < max_len; i++) {
            //it will add number if there according to maxlength and if no integer to add then put 0 instead
            int digit1 = (i < len_l1) ? l1[i] : 0; // check i to len_l1 and if true print l1[i] else 0
            int digit2 = (i < len_l2) ? l2[i] : 0; // check j to len_l2 and if true print l2[j] else 0
            //System.out.println(digit1);
            //System.out.println(digit2);

            //Reversing string
            int sum = digit1 + digit2 + carry;
            l3[i] = sum % 10;
            carry = sum / 10;
            //Basic logic is to take the remainder and place it as first index for new array and continue so on.
        }
        if (carry > 0) {
            l3[max_len] = carry;
        }


        System.out.println("The Reversed string is:");
        for (int i = max_len; i >= 0; i--) {
                System.out.print(l3[i] + ",");
        }
    }
}
