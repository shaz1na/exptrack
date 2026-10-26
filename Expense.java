/*
 * Write a description of class Expenses here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//class to represent an individual expense
public class Expense
{
    //for expenses
    public float amount(float jumlah)
    {
        float x = jumlah;
        return x;
    }
    
    public void date()
    {
        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = date1.format(date2);
    }
    
    public float generateMonthlyReport(float MonthlyExpenses)
    {
        float jumlah = MonthlyExpenses;
        System.out.println("MONTHLY REPORT: OVERALL TOTAL EXPENSES THIS MONTH IS: " + MonthlyExpenses);
        return 0;
    }
}