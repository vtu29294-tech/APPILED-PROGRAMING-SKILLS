class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);

            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }

        for (List<String> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }
}