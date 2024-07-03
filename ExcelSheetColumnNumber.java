// Excel Sheet Column Number

//   Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...


class Solution {
    public int titleToNumber(String s) {
       if (s == null ) return -1;

       int sum = 0;
       for(char c: s.toUpperCase().toCharArray()){
        sum *= 26;
        sum += c -'A' + 1;
       }
       return sum;
    }
}
