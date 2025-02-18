package day8;

public class AccessModifier {
	int valDefault=10;
	public int valPublic=20;
	private int valPrivate=30;
	protected int valProtected=40;
	
	void methodDefault() {
		System.out.println(valDefault);
	}
	
	private void methodPrivate() {
		System.out.println(valPrivate);
	}
	
	protected void methodProtected() {
		System.out.println(valProtected);
	}
	
	public void methodPublic() {
		System.out.println(valPublic);
	}

}
