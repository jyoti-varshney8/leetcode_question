// 350. Intersection of Two Arrays II

//   Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

class Solution {
    public int[] intersect(int[] num1, int[] num2) {
       Arrays.sort(num1);
       Arrays.sort(num2);
       int i=0,j=0;
       List<Integer> intersection = new ArrayList<>();
       while(i<num1.length && j<num2.length){
        if(num1[i]<num2[j]){
            i++;
        }
        else if(num1[i] > num2[j]){
            j++;
        }
        else{
            intersection.add(num1[i]);
            i++;
            j++;
        }
       }
       int[] result = new int[intersection.size()];
       for(int k=0;k<intersection.size();k++){
        result[k] = intersection.get(k);
       }
       return result;
    }
}
