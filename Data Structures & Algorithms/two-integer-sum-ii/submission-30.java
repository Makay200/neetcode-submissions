class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length -1;

        while(left < right) {

            for(int i =0; i < numbers.length; i++) {

                int sum = numbers[left] + numbers[right];

                if(sum ==target) {
                    return new int[] {left +1, right+1};
                }

                if(sum < target) {
                    left ++;
                }
                else {
                    right --;
                }
            }

        }

        return new int[0];   
    }
}
