package com.ds.java;

public class PrintsubString {
	 public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	private int salary;
	    private String grade;
	static void subString(char str[], int n) { 
        // Pick starting point 
        for (int len = 1; len <= n; len++) { 
            // Pick ending point 
            for (int i = 0; i <= n - len; i++) { 
                //  Print characters from current 
                // starting point to current ending 
                // point.   
                int j = i + len - 1; 
                for (int k = i; k <= j; k++) { 
                    System.out.print(str[k]); 
                } 
  
                System.out.println(); 
            } 
        } 
    } 
  
// Driver program to test above function 
    public static void main(String[] args) { 
        char str[] = {'a', 'b', 'c'}; 
        subString(str, str.length); 
        String s1="bigbasket";
        char ch[]=s1.toCharArray();
       for(int i=0, j=ch.length-1;i<ch.length/2;i++,j--) {
    	   char c=ch[i];
    	   ch[i]=ch[j];
    	   ch[j]=c;
    	   
       }
       for (int k = 0; k <ch.length; k++) { 
           System.out.print(ch[k]); 
       } 
       int arr[]= {1,2,3,4,5,6};
       int sum=0;
       for(int i=arr.length;i>=0;i=i-2) {
    	   sum=sum+arr[i];
       }
       System.out.println(sum);
    } 
}
