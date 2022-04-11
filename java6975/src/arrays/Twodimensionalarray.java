package arrays;

public class Twodimensionalarray {

	public static void main(String[] args) {
		int marks[][]=new int [2][3];
		marks[0][0]=12;
		marks[0][1]=13;
		marks[0][2]=14;
		marks[1][0]=15;
		marks[1][1]=17;
		marks[1][2]=18;
		
		for (int r=0;r<marks.length;r++) {
			for (int c=0;c<marks[r].length;c++) {
				System.out.print(+marks[r][c]+"\t");
			}
			System.out.println("\n");
		}

	}

}
