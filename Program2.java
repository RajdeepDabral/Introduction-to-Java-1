/*Q2.Write a program to find the number of occurrences of the duplicate words in a string and print them */
import java.util.*;
class Program{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        String arr=null;
        String strarr[]=null;
        String find="";
        int counter=0,present=0;
        System.out.println("Enter String : ");
        arr=scanner.nextLine();
        strarr=arr.split(" ");

        for(int i=0;i<strarr.length;i++){
            find=strarr[i];
            for(int j=0;j<i;j++){
                if(find.equals(strarr[j])){
                    present=1;
                    break;
                }
            }
            if(present==0){
                for(int j=i;j<strarr.length;j++){
                    if(find.equals(strarr[j])){
                        counter++;
                    }

                }
                if(counter>1){
                    System.out.println(find+" : "+counter);
                }
            }
            present=0;counter=0;
        }
    }
}
