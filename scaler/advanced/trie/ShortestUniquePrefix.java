package datastructures.src.com.scaler.advanced.trie;

import java.util.Arrays;

public class ShortestUniquePrefix {
	static final int ALPHABET_SIZE = 26;

	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];

		// isEndOfWord is true if the node represents
		// end of a word
		boolean isEndOfWord;
		// count of words this letter can make
		int count;

		TrieNode() {
			isEndOfWord = false;
			count = 0;
			for (int i = 0; i < ALPHABET_SIZE; i++)
				children[i] = null;

		}
	};

	static TrieNode root;

	// If not present, inserts key into trie
	// If the key is prefix of trie node,
	// just marks leaf node
	static void insert(String key) {
		int level;
		int length = key.length();
		int index;

		TrieNode pCrawl = root;

		for (level = 0; level < length; level++) {
			index = key.charAt(level) - 'a';

			if (pCrawl.children[index] == null) {
				pCrawl.children[index] = new TrieNode();
			}

			pCrawl = pCrawl.children[index];
			pCrawl.count++;
		}
		// mark last node as leaf
		pCrawl.isEndOfWord = true;
	}

	// Returns true if key presents in trie, else false
	static String getPrefix(String key) {
		int level;
		int length = key.length();
		int index;
		TrieNode pCrawl = root;
		String ans = "";

		for (level = 0; level < length; level++) {
			index = key.charAt(level) - 'a';
			if (pCrawl.count == 1) {
				return ans;
			} else {
				ans = ans + key.charAt(level) + "";
				pCrawl = pCrawl.children[index];
			}
		}
		return (ans);
	}

	public static String[] prefix(String[] A) {

		String pref[] = new String[A.length];
		root = new TrieNode();

		for (int i = 0; i < A.length; i++)
			insert(A[i]);

		for (int i = 0; i < A.length; i++) {

			pref[i] = getPrefix(A[i]);
		}
		return pref;
	}

	public static void main(String[] args) {
		String[] A = { "zebra", "dog", "duck", "dove" };
		System.out.println(Arrays.toString(prefix(A)));
	}

}
