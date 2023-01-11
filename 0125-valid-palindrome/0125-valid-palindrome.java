class Solution {
	public boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		char l_ch, r_ch;

		while (left < right) {
			l_ch = s.charAt(left);
			r_ch = s.charAt(right);


			if (!Character.isLetterOrDigit(l_ch))
				left++;
			else if (!Character.isLetterOrDigit(r_ch))
				right--;
			else if (Character.toLowerCase(l_ch) == Character.toLowerCase(r_ch)) {
				left++;
				right--;
			} else
				return false;
		}

		// isPalindrome
		return true;
	}
}