// Majority Element

//   Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i] , 1);
            }
            else if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        int n = nums.length / 2;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }
        return 0;
    }
}



   Arrays.sort(nums);
        int len = nums.length;
        return nums[len/2];
