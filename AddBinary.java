// // 67. Add Binary

// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder(); 
       int carry = 0;
       int i = a.length() - 1;
       int j = b.length() - 1;

       // iterate over the loop until the both condition become false
        while(i >= 0 || j >= 0){ 
            int sum = carry; // intialise our sum with carry;
            
            // Now, we subtract by '0' to convert the numbers from a char type into an int, so we can perform operations on the numbers
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            // taking carry;
            carry = sum > 1 ? 1 : 0; // getting carry depend on the quotient we get by dividing sum / 2 that will be our carry. Carry could be either 1 or 0 
			// if sum is 0 res is 1 & then carry would be 0;
            // if sum is 1 res is 1 & carry would be 0
            // if sum is 2 res is 0 & carry would be 1
            // if sum is 3 res is 1 & carry would be 1
            res.append(sum % 2); // just moduling the sum so, we can get remainder and add it into our result
        }
       if(carry != 0) sb.append(carry); 
       // we gonna add it into res until carry becomes 0;
        return sb.reverse().toString(); 
        // revese the answer we get & convt to string and return by the help of result;
    }
}
