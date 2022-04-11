package java8package;

import java.time.*;

class Localdtdemo
{
public static void main(String[] args)
{
LocalDate date = LocalDate.now();
System.out.println(date);
int day = date.getDayOfMonth();
int month = date.getMonthValue();
int year = date.getYear();
System.out.println(day+"..."+month+"..."+year);
System.out.printf("\n%d-%d-%d",day,month,year);
}
}
