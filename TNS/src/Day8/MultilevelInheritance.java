package Day8;

public class MultilevelInheritance {
	public static void main(String[] args) {
		
	}
}

class Country{
	private String CountryName;

	public Country(String CountryName) {
		this.CountryName=CountryName;
	}
	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + "]";
	}
}

class State extends Country{

	private String StateName;
	public State(String CountryName, String StateName) {
		super(CountryName);
		this.StateName=StateName;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	
	@Override
	public String toString() {
		return "State [StateName=" + StateName + "]";
	}
}