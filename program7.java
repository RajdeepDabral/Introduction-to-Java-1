/*Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively */
class Program{
    static String Firstname="Rajdeep";
    static String Lastname="Dabral";
    static int Age=24; 
    
    static{
        System.out.println("Inside Static block");
        System.out.println("FirstName : "+Firstname);
        System.out.println("LastName : "+Lastname);
        System.out.println("Age : "+Age);
    }

    public static void getData(){
        System.out.println("\nInside Static Method");
        System.out.println("FirstName : "+Firstname);
        System.out.println("LastName : "+Lastname);
        System.out.println("Age : "+Age);    
    }

    public static void main(String [] args){
        Program.getData();
        System.out.println("\nInside main Method");
        System.out.println("FirstName : "+Program.Firstname);
        System.out.println("LastName : "+Program.Lastname);
        System.out.println("Age : "+Program.Age);
    }
}
