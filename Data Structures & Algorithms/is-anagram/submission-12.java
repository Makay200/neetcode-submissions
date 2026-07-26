class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char [] tchar = t.toCharArray();
        char [] schar = s.toCharArray();

        Arrays.sort(tchar);
        Arrays.sort(schar);
        return Arrays.equals(tchar, schar);
    }
}