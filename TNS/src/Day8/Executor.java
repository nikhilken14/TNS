package Day8;

public class Executor {
	public static void main(String[] args) {
		AccessModifier a=new AccessModifier();
		
		a.methodPublic();
		a.methodDefault();
		a.methodProtected();
		//a.methodPrivate();
		
		a.valDefault=11;
		a.valPublic=22;
		a.valProtected=41;
		a.methodDefault();
		a.methodPublic();
		a.methodProtected();
		
	}
}
