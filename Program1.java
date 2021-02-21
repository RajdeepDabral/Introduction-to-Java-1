/*
Q1. Write a program to replace a substring inside a string with other string ?
*/
class Program{
    static String str="Rajdeep Dabral";
    public static void main(String [] args){
        str=str.replace("a","A");
        str=str.replace("A","a");
        System.out.println(str);
    }
}
