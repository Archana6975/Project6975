package thread;

class BookMyShow
{
 static int total_tickets=10;
 synchronized public void bookTickets(int requestticket)
 {
 if(total_tickets>=requestticket)
 {
 total_tickets = total_tickets-requestticket;
 System.out.println(Thread.currentThread().getName()+" has booked" +requestticket+" tickets and the remaining tickets are "+total_tickets); 
 }
 else
 {
 System.out.println("sorry there is only "+total_tickets+" are available ");
 }
 }
 
}
public class SyncThread extends Thread
{
 static BookMyShow book;
 int t;
 public void run()
 {
 book.bookTickets(t);
 }
public static void main(String[] args)
{
book = new BookMyShow();
SyncThread A = new SyncThread();
A.t=7;
A.start();
SyncThread ab = new SyncThread();
ab.t=8;
ab.start();
 }
}
