package day10;

public class InterfaceDemo extends Customer implements Bank{
	private int accNo;
	private float balance;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public InterfaceDemo(String name, String id,int accNo,float balance) {
		super(name, id);
		this.accNo=accNo;
		this.balance=balance;
	}

	@Override
	public void deposit(float amount) {
		if(amount <0 || amount >DepositLimit) {
			System.out.println("invalid ");
		}
		else {
			balance+=amount;
			System.out.println("Rs : "+balance);
		}
	}

	@Override
	public void withdraw(float amount) {
		if(amount <=balance-MinBal) {
			balance-=amount;
			System.out.println(amount+" withdrawed.");
		}
		else {
			System.out.println("can not withdraw.");
		}
	}

	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo("asd","1234",896233,24000.0f);
		i.deposit(20000.0f);
		
		i.withdraw(14000.0f);
		i.deposit(2);

	}
}


interface Bank{
	final static float MinBal=5000;
	final static float DepositLimit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
}

class Customer {
	private String name;
	private String id;
	
	public Customer(String name, String id) {
		super();
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}