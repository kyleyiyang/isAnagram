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
        System.out.println(a);
        System.out.println(b);
        /*for (Map.Entry<Character,Integer> entry:a.entrySet()) {
            char key = entry.getKey();
            if (entry.getValue()!=b.get(key)) {
                System.out.println("key="+key+"; val="+entry.getValue());
                System.out.println("key="+key+"; val="+b.get(key));
                System.out.println(a.get(key)==b.get(key));
                return false;
            }
            //System.out.println(entry.getKey());
        }*/
        for (char cc:a.keySet()) {
            if (a.get(cc)!=b.get(cc)) {
                System.out.println("cc="+cc+" "+(a.get(cc)==b.get(cc)));
                return false;
            }
        }
        return true;
    }
}
