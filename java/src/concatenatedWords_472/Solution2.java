
/* ##FROM THE INTERNET##*/

package concatenatedWords_472;

import java.util.*;

public class Solution2 {
    Set<String> set = new HashSet<>();
    List<String> res = new ArrayList<>();
    public boolean find(String word, String origin) {
		// base case
        if (word.length() == 0) {
            return true;
        }
        boolean res = false; // initialize
        for (int i = 1; i <= word.length(); i++) {
            String sub = word.substring(0, i);
			// exclude the string itself
            if (set.contains(sub) && !sub.equals(origin)) {
				// try out every possible situation
				// the result is true as long as one of them returns true
                res |= find(word.substring(i, word.length()), origin);
            }
        }
        return res;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for (String word : words) {
            set.add(word);
        }
        for (String word : words) {
            if (find(word, word)) {
                res.add(word);
            }
        }
        return res;
    }
}
