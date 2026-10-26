/*
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main implements TotalE 
{
    public static void Main (String[] args)
    {
        Main finance = new Main();
        
        //Ask interaction from user before proceed
        Scanner a = new Scanner(System.in);
        System.out.println("PRESS ANY NUMERICAL KEY TO PROCEED.");
        float a2 = a.nextInt();
        
        System.out.println(" ");
        
        //Calculate total fixed expenses
        float totalF = finance.FEmain(a2);
        
        System.out.println(" ");
        
        //Ask interaction from user before proceed
        Scanner b = new Scanner(System.in);
        System.out.println("PRESS ANY NUMERICAL KEY TO PROCEED.");
        float b2 = a.nextInt();
        
        System.out.println(" ");
        
        //Calculate total variable expenses
        float totalV = finance.VEmain(b2);
        
        System.out.println(" ");
        
        //Calculate total expenses
        float report = finance.total(totalF, totalV);
        
        System.out.println(" ");
        
        //Generate monthly expenses report
        finance.generateMonthlyReport(report);
        
        System.out.println(" ");
        
        //Close the system
        System.out.println("SYSTEM CLOSING...");
        System.out.println("HAVE A GREAT DAY!");
    }
    
    //Method to calculate fixed expenses
    public float FEmain(float a)
    {
        FixedExpense money = new FixedExpense();
        
        money.date();
        
        System.out.println("FIXED EXPENSES");
        
        Scanner duit = new Scanner(System.in);
        System.out.println("ENTER RENT: ");
        float sewa = duit.nextFloat();
        money.amount(sewa);
        
        System.out.println("ENTER LOAN: ");
        float pinjaman = duit.nextFloat();
        money.amount(pinjaman);
        
        System.out.println("ENTER BILLS: ");
        float bil = duit.nextFloat();
        money.amount(bil);
        
        float jumlah = money.totalFixed(sewa, pinjaman, bil);
        System.out.println("TOTAL FIXED EXPENSES: " + jumlah);
        
        return jumlah;
    }
    
    //Method to calculate variable expenses
    public float VEmain(float b)
    {
        VariableExpense money = new VariableExpense();
        
        money.date();
        
        System.out.println("VARIABLE EXPENSES");
        
        Scanner duit = new Scanner(System.in);
        System.out.println("ENTER DINING OUT EXPENSES: ");
        float makanLuar = duit.nextFloat();
        money.amount(makanLuar);
        
        System.out.println("ENTER SHOPPING EXPENSES: ");
        float shopping = duit.nextFloat();
        money.amount(shopping);
        
        float jumlah = money.totalVariable(makanLuar, shopping);
        System.out.println("TOTAL VARIABLES EXPENSES: " + jumlah);
        
        return jumlah;
    }
    
    //Method to calculate the total expenses
    public float total(float totalFixed, float totalVariable) 
    { 

        float jumlah = totalFixed + totalVariable; 

        return jumlah; 

    } 

    // Method to generate a monthly expense report 
    public float generateMonthlyReport(float MonthlyExpenses) { 

        float jumlah = MonthlyExpenses; 

        System.out.println("MONTHLY REPORT: OVERALL TOTAL EXPENSES THIS MONTH IS: " + MonthlyExpenses); 

        return 0; 

    } 
} 
