package collection_assignment;
import java.util.*;

public class PrintEvenNumbers {
	
	private ArrayList<Integer> A1 = new ArrayList<Integer>();
	public ArrayList<Integer> saveEvenNumbers(int N){
		
		A1 = new ArrayList <Integer>();
		
		for(int i=2;i<=N;i++) {
			if(i %2==0) {
				A1.add(i);
				
			}
			
		}
		return A1;
		
	}
	
		public ArrayList<Integer> printEvenNumbers(){
			
			ArrayList<Integer> A2 = new ArrayList<Integer>();
			
			for(int item : A1)
			{
				A2.add(item*2);
				System.out.println(item*2);
				
			}
			return A2;
		}
	
	public static void main(String[] args) {
		
		PrintEvenNumbers obj = new PrintEvenNumbers();
		obj.saveEvenNumbers(10);
		
		
		obj.printEvenNumbers();
		
	}

}
