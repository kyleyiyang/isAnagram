class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        Map<Character,Integer> a = new HashMap<>();
        Map<Character,Integer> b = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for (int i=0;i<s.length();i++) {
            char c=t.charAt(i);
            b.put(c,b.getOrDefault(c,0)+1);
        }
        for (char cc:a.keySet()) {
            int va=a.get(cc);
            if (b.containsKey(cc)) {
                int vb=b.get(cc);
                if (va!=vb) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
