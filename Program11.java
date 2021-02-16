/*Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks*/
import java.util.*;

class Bank{
    public double rateofinterest;
    public String bname;
    
    public Bank(){
        rateofinterest=0;
        bname="Bank";
    }

    public void getDetails(){
        System.out.println("BankName : "+bname+" : rate of Interest : "+this.rateofinterest);
    }
}

class SBI extends Bank{

    public SBI(){
        rateofinterest=7;
        bname="SBI";
    }
    @Override
    public void getDetails(){
       System.out.println("BankName : "+bname+" : rate of Interest : "+rateofinterest);
    }
}

class BOI extends Bank{

    public BOI(){
        rateofinterest=8.5;
        bname="BOI";
    }
    @Override
    public void getDetails(){
        System.out.println("BankName : "+bname+" : rate of Interest : "+rateofinterest);
    }
}

class ICICI extends Bank{
    public ICICI(){
        rateofinterest=9;
        bname="ICICI";
    }
    @Override
    public void getDetails(){
        System.out.println("BankName : "+bname+" : rate of Interest : "+rateofinterest);
    }
}





class Program{
    public static void main(String [] args){
        Bank b =new Bank();
        b.getDetails();

        b=new SBI();
        b.getDetails();

        b=new BOI();
        b.getDetails();

        b=new ICICI();
        b.getDetails();
        
    }
}