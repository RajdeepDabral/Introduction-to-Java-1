/*
Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
*/ 
public class Program{  
   
    public static void charPercentage(String input) {  
        int totalChar = input.length();  
        int upperCase = 0;  
        int lowerCase = 0;  
        int digits = 0;  
        int others = 0;  
        for (int i = 0; i < input.length(); i++) {  
            char ch = input.charAt(i);  
            if (Character.isUpperCase(ch)) {  
                upperCase++;  
            }  
            else if (Character.isLowerCase(ch)) {  
                lowerCase++;  
            }  
            else if (Character.isDigit(ch)) {  
                digits++;  
            }  
            else {  
                others++;  
            }  
        }  
        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;  
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;  
        double digitsPercentage = (digits * 100) / totalChar;  
        double otherCharPercentage = (others * 100) / totalChar;  
   
        System.out.println("Uppercase letters are " + upperCaseLetterPercentage + "% ");  
        System.out.println("Lowercase letters are " + lowerCaseLetterPercentage + "%");  
        System.out.println("Digits Are " + digitsPercentage + "%");  
        System.out.println("Other Characters Are " + otherCharPercentage + "%");  
   
    }  
    public static void main(String[] args) {  
        Program.charPercentage("IndiA Is my Country 100%");  
    }  
   
}  