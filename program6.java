/*Q6. There is an array with every element repeated twice except one. Find that element. */
import java.util.*;
class Program{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        String arr=null;
        char chararr[]=null;
        char find;
        int found=0,present=0;
        System.out.println("Enter String : ");
        arr=scanner.nextLine();
        chararr=arr.toCharArray();

        for(int i=0;i<chararr.length;i++){
            find=chararr[i];
            for(int j=0;j<chararr.length;j++){
                if(i==j){
                    continue;
                }
                else if(find==chararr[j]){
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
