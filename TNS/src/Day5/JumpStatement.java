package Day5;

public class JumpStatement {
	public static void main(String[] args) {
		
		// break
		for(int i=1;i<6;i++) {
			if(i==2)
				break;
			System.out.println(i);
		}
		
		
		// continue
		for(int i=1;i<=5;i++) {
			if(i==3)
				continue;
			System.out.println(i);
		}
		
		// switch statement
		int a=2;
		switch(a) {
		case 1: System.out.println("odd");
				break;
		case 2: System.out.println("even");
				break;
		default:
			System.exit(a);
		}
	}
}
