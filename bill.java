import java.util.*;
class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id,name;
        int units,charge;
        double amount;
        units=sc.nextInt();
        id=sc.nextLine();
        name=sc.nextLine();
        if(units<=199)
        {
            amount=(float)units*(1.20);
        }
        else if((units==200)&&(units<400))
        {
            amount=(float)units*(1.50);
        }
        else if((units==400)&&(units<600))
        {
            amount=(float)units*(1.50);
        }
        else 
        {
            amount=(float)units*(2.00);
        }
        System.out.println(id);
        System.out.println(name);
        System.out.println(amount);
    }
}