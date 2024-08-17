//Given a string s, find the length of the longest substring
//without repeating characters.
//
// Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            String resultString = "";
            for (int j = i; j < s.length(); j++) {
                char Char = s.charAt(j);
                //Basic logic is to take the current element and check is it exist in the resultString and if yes then break the loop and if not then store the element in resultString
                if (resultString.indexOf(Char) == -1) { //if the char is not in resultString it will return -1
                    resultString += Char;
                } else {
                    break;
                }
            }
            //Getting the length of teh resultString
            if (resultString.length() > maxLen) {
                maxLen = resultString.length();
            }
        }

        System.out.println("Answer is: " + maxLen);
    }
}
