/*
Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
*/ 

public class Program{  
       
    public static void main(String[] args) {  
        StringBuffer sb =new StringBuffer("Rajdeep Dabral");
        System.out.println("Before reverse : "+sb);
        sb.reverse();
        System.out.println("After reverse : "+sb);
        sb.delete(4,10);
        System.out.println("After Delete : "+sb);
    }  
   
}  
