package nonsolved;

import java.util.HashMap;
import java.util.Map;

public class SumofPrefixScoresofStrings {
    private class TrieNode {
        TrieNode[] children = new TrieNode[26]; // Array to hold child nodes for each letter
        int prefixCount = 0;

        boolean containsKey(char ch) {
            return children[ch - 'a'] != null;
        }

        TrieNode get(char ch) {
            return children[ch - 'a'];
        }

        void put(char ch, TrieNode newNode) {
            children[ch - 'a'] = newNode;
        }

        void inc(char ch) {
            children[ch - 'a'].prefixCount++;
        }

        int getCount(char ch) {
            return children[ch - 'a'].prefixCount;
        }
    }

    private TrieNode root;

    public SumofPrefixScoresofStrings() {
        root = new TrieNode();
    }

    // Method to insert a word into the Trie and update prefix counts
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
            current.prefixCount++; // Increment the count for this prefix
        }
    }

    // Method to get the count of words with a given prefix
    public int countPrefixes(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return 0; // Prefix not found
            }
            current = current.children[index];
        }
        return current.prefixCount;
    }

    public int[] sumPrefixScores(String[] words) {
        int[] res = new int[words.length];

        for (String word : words) {
            insert(word);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;
            StringBuilder prefix = new StringBuilder();

            for (char ch : word.toCharArray()) {
                prefix.append(ch);
                count += countPrefixes(prefix.toString());
            }
            res[i] = count;
        }

        return res;
    }

    public int[] sumPrefixScores2(String[] words) {
        Map<String, Integer> prefixes = new HashMap<>();
        int[] res = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;
            StringBuilder prefix = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                prefix.append(word.charAt(j));
                String prefixStr = prefix.toString();

                prefixes.merge(prefixStr, 1, Integer::sum);

                count += prefixes.get(prefixStr);
            }

            res[i] = count;
        }

        System.out.println(prefixes);
        return res;

        //TLE
    }
}
