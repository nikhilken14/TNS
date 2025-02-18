package day5;

public class LoopsStatement {
	public static void main(String[] args) {
		
		// for loop
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		
		// while
		int k=10;
		while(k<=15) {
			System.out.println(k);
			k++;
		}
		
		
		// do-while
		int j=10;
		do {
			System.out.println(j);
			j++;
		}while(j<12);
		
		
		// for-each
		int []a= {10,20,30};
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
