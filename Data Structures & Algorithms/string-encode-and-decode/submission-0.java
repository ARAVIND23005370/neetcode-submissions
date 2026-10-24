
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter
            while (str.charAt(j) != '#') {
                j++;
            }

            // Read the length
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String word = str.substring(j + 1, j + 1 + len);
            res.add(word);

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return res;
    }
}
