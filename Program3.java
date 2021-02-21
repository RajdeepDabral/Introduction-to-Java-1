/*
Q3. Write a program to find the number of occurrences of a character in a string without using loop.
*/
package com.company;
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
        String str=null;
        char find;
        int result=0;
        System.out.println("Enter String : ");
        str=scanner.nextLine();
        for(int i=0;i<str.length();i++){
            find=str.charAt(i);
            result=Program.counter(str,0,str.length(),0,find);
            System.out.println("Total occurance of "+find+" : "+result);
        }
    }
}
