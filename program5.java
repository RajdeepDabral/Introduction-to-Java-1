/*Q5. Find common elements between two arrays. */
import java.util.*;
class Program{

    public static int[] getArray(){
        int size=0;
        Scanner scanner =new Scanner(System.in); 
        System.out.print("\nEnter Array Size : ");
        size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("\nEnter Array Elements : ");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public static void main(String [] args){
        int arr1[]=Program.getArray();
        int arr2[]=Program.getArray();
        System.out.println("Comman Elements");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}