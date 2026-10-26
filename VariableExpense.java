/*
 * Write a description of class VariableExpenses here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VariableExpense extends Expense
{
    public float diningOut;
    public float shopping;
    
    public void date()
    {
        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = date1.format(date2);
        System.out.println("DATE AND TIME OF PAYMENT: " + datePaid);
    }
    
    public float totalVariable(float makanLuar, float shopping)
    {
        float total = makanLuar + shopping;
        return total;
    }
    
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
}