class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left = 0;

        if(s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int [26];
        int[] count2 = new int[26];

        for(int right =0; right < s1.length(); right++) {
            count1[s1.charAt(right) - 'a'] ++;
        } 

        for(int right =0; right < s2.length(); right++) {
            count2[s2.charAt(right) - 'a'] ++;

            if((right - left+1) > s1.length()) {
                 count2[s2.charAt(left) - 'a'] --;
                 left ++;
            }

            if(Arrays.equals(count1, count2)) {
                return true;
            }
        }
            
      return false;
        
    }
}
