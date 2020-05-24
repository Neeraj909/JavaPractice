package com.ds.java;

public class findLongestPalindrome {
	public static void main(String[] args) {
		findLongestPalindrome lp = new findLongestPalindrome();
        System.out.println("Longest Palindrome- " + lp.findLongestPalindrom("12321981189"));
        System.out.println("Longest Palindrome- " + lp.findLongestPalindrom("toppot"));
        System.out.println("Longest Palindrome- " + lp.findLongestPalindrom("101312321"));
        System.out.println("Longest Palindrome- " + lp.findLongestPalindrom("101311321"));
    }
    
    public String findLongestPalindrom(String str) {
        // starting point for comparison with other palindromes
        String longestPalindrome = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {  
            // odd length case (center is i)
            String newPalindrome = checkIfEqual(str, i, i);
            if (newPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = newPalindrome;
            }
            // even length case (center is i, i+1)
            newPalindrome = checkIfEqual(str, i, i + 1);
            if (newPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = newPalindrome;
            }
        }
        
        return longestPalindrome;
    }

    
    public String checkIfEqual(String str, int begin, int end) {
        while ((begin >= 0 && end <= str.length() - 1) && (str.charAt(begin) == str.charAt(end))) {
           
            begin--;
            // move right
            end++;
        }
        return str.substring(begin + 1, end); 
    
}
}
