// creating the compound interest calculator in java
// this code is under the creative License of Parthiv gajjar you can use it

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double principle;
        double rate;
        int compound;
        int years;
        double amount;


        System.out.print("Enter the principle amount: ");
        principle= scanner.nextDouble();
        System.out.print("Enter the interest rate :");
        rate= scanner.nextDouble()  /100 ;   // we do /100 because of the percentage will be 0.03
        System.out.print("Enter the compound in years :");
        compound=scanner.nextInt();
        System.out.print("Enter the amount of time period in years :");
        years=scanner.nextInt();



// applying the formula of compound interest
        // amount = principle * Math.pow( base, power )
        // where base= 1+rate/compound
        // where power = compound * time


        amount = principle* Math.pow(1+rate/compound,compound*years);
        System.out.println("==========================================================================");
        System.out.println("The amount of yours with the interest is :$" +amount);
        System.out.println("==========================================================================");
        scanner.close();

    }
}