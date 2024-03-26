public class LongestSubstringWithoutRepeatingChars {
	public static int longestSubstringLength(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		int maxLength = 0;
		int start = 0;
		int[] charIndex = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (charIndex[c] > start) {
				start = charIndex[c];
			}
			charIndex[c] = i + 1;
			maxLength = Math.max(maxLength, i - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {

		// Example input strings
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "agrichain";
		String s4 = "prakash";

		// Print the lengths of the longest substrings without repeating characters for
		// the example strings
		System.out.println("Longest substring length of '" + s1 + "' is: " + longestSubstringLength(s1));
		System.out.println("Longest substring length of '" + s2 + "' is: " + longestSubstringLength(s2));
		System.out.println("Longest substring length of '" + s3 + "' is: " + longestSubstringLength(s3));
		System.out.println("Longest substring length of '" + s4 + "' is: " + longestSubstringLength(s4));
	}
}
