/*
 * Write a description of class FixedExpenses here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FixedExpense extends Expense
{
    //declare relevant variables
    public float rent;
    public float loan;
    public float bill;
    
    //method to get user's current date and time
    public void date()
    {
        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = date1.format(date2);
        System.out.println("DATE AND TIME OF PAYMENT: " + datePaid);
    }
    
    //method to get total of all fixed expenses
    public float totalFixed(float sewa, float pinjaman, float bil)
    {
        float total = sewa + pinjaman + bil;
        return total;
    }
    
    //method to get input from user on their fixed expenses
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
}