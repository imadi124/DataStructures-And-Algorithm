class Solution {
    private boolean isPalindromeHelper(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (!Character.isLetterOrDigit(s.charAt(i))) {
            return isPalindromeHelper(s, i + 1);
        }
        if (!Character.isLetterOrDigit(s.charAt(s.length() - i - 1))) {
            return isPalindromeHelper(s, i + 1);
        }
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length() - i - 1))) {
            return false;
        }
        return isPalindromeHelper(s, i + 1);
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(s, 0);
    }
}
