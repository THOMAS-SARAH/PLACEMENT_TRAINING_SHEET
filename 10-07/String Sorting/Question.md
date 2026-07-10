Q3)Mike came up with a new way of sorting a string. What he does is he takes all the unique alphabets from the string and sorts it in that order. Let say there is a string "apple", now it contains a p l e as distinct alphabets.
He sorts the string apple based on his own keys let say eapl. So, first all "e" will be picked from the string "apple", and then all "a", and so on till "T". Hence the final sorted word becomes "eappl".
Input Format
The candidate has to write the code to accept 2 input(s)
•First Input - Accept value for input string.
•second Input - Accept value for input key.
Constraints
0
Input key should contain all the alphabets of inputstrings
No duplicates in input keys.
Output Format
The output should be a sorted string based on the input key given by the user as mentioned in the above criteria.
Sample Input 0
welcome
lowmec
Sample Output 0
lowmeec
Sample Input 1
apple
eapl
Sample Output 1
eappl
ALGORITHM:
Read the input string S and the key string K.
Create an empty string (or result).
Traverse each character ch in the key string K.
For every character ch, scan the input string S.
If the current character in S is equal to ch, append it to the result.
After processing all characters of the key, print the result.
