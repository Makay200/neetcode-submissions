class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] schars = t.toCharArray();
        char[] tchars = s.toCharArray();

        Arrays.sort(schars);
        Arrays.sort(tchars);

       return Arrays.equals(schars, tchars);
       }
}
