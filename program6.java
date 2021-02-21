/*Q6. There is an array with every element repeated twice except one. Find that element. */
package com.company;
import java.util.*;
class Program{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        String str=null;
        char charstr[]=null;
        char find;
        int found=0,present=0;
        System.out.println("Enter String : ");
        str=scanner.nextLine();
        charstr=str.toCharArray();

        for(int i=0;i<charstr.length;i++){
            find=charstr[i];
            for(int j=0;j<charstr.length;j++){
                if(i==j){
                    continue;
                }
                else if(find==charstr[j]){
                    found=1;
                    break;
                }
            }
            if(found!=1){
                System.out.println(find);
                present=1;
                break;
            }
            found=0;
        }
        if(present!=1){
            System.out.println("No data found");
        }
    }
}
