class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        List<String> lines = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && code[i] != null && code[i].matches("[a-zA-Z0-9_]+") && lines.contains(businessLine[i])) {
                idx.add(i);
            }
        }
        idx.sort((a, b) -> {
            if (!businessLine[a].equals(businessLine[b])) {
                return lines.indexOf(businessLine[a]) - lines.indexOf(businessLine[b]);
            }
            return code[a].compareTo(code[b]);
        });
        for (int i : idx) {
            result.add(code[i]);
        }
        return result;
    }
}