/*
Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
*/ 
enum House {
    house1(100),house2(200),house3(300),house4(400),house5(500);
    private int price;
    House(int p) {
       price = p;
    }
    public int getPrice() {
       return price;
    } 
}

public class Program{  
    public static void main(String[] args) {  
        System.out.println("All House prices:");
        for (House h : House.values()){
            System.out.println(h + " price : " + h.getPrice() + " Rupees Only!!");
        }
    }  
}  


