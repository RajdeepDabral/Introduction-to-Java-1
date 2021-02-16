/*Q3. Write a program to find the number of occurrences of a character in a string without using loop */
import java.util.*;
class Program{
    public static int counter(String str , int start ,int end , int total,int find){
        if(start==end){
            return total;
        }else if(find==str.charAt(start)){
            total++;
            start++;
            return counter(str,start,end,total,find);
        }else{
            start++;
            return counter(str,start,end,total,find);
        }
    }
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        String arr=null;
        char find;
        int result=0;
        System.out.println("Enter String : ");
        arr=scanner.nextLine();
        System.out.println("Enter Char to Find : ");
        find=scanner.next().charAt(0);  
        result=Program.counter(arr,0,arr.length(),0,find);
        System.out.println("Total occurance of "+find+" : "+result);
    }
}
