class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;          // Stores the length of the current (and eventually last) word
        boolean counting = false; // Flag to check if we are currently inside a word

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {

            if (c != ' ') { // If the character is not a space
                if (!counting) {
                    // Starting a new word — reset counting and start length count
                    counting = true;
                    length = 1;
                } else {
                    // Still in the same word — increment length
                    length++;
                }
            } else {
                // Space encountered — stop counting until next non-space character
                counting = false;
            }
        }

        // After the loop, 'length' will hold the length of the last word
        return length;
    }
}
