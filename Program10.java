/*
Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
*/ 


public class Program{  

    public static int add(int num1 ,int num2){
        return num1+num2;
    }
    public static void add(double num1 ,double num2){
        double d1=num1+num2;
        System.out.println("Addition of two Double number : "+d1);
    }

    public static int mul(int num1 ,int num2){
        return num1*num2;
    }
    public static void mul(float num1 ,float num2){
        float d1=num1*num2;
        System.out.println("Multiply of two Float number : "+d1);
    }

    public static String join(String str1, String str2){
        return (str1+str2);
    }
    public static String join(String str1, String str2 ,String str3){
        return (str1+str2+str3);
    }

    
    public static void main(String[] args) {  
        System.out.println("Addition of two Int number : "+Program.add(10,20));
        Program.add(10.01,20.01);

        System.out.println("Multiply of two Int number : "+Program.mul(10,20));
        Program.mul(10.01f,20.01f);

        System.out.println("concate 2 string : "+Program.join("hello" , " world"));
        System.out.println("Concate 3 String : "+Program.join("hello " , "-" , " world"));
    }  
}  


