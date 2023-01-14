class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
       int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < s1.length(); i++) {
            int p1 = find(parent, s1.charAt(i) - 'a');
            int p2 = find(parent, s2.charAt(i) - 'a');
            parent[p1] = Math.min(p1, p2);
            parent[p2] = Math.min(p1, p2);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            sb.append((char) ('a' + find(parent, c - 'a')));
        }
        return sb.toString();
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}