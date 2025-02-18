package day10;

public class RBI {
	public float getRateOfInterest(){
		return 6.2f;
	}
}


class SBI extends RBI{ 
	@Override
	public float getRateOfInterest() {
		return 6.5f;
	}
}

class ICICI extends RBI{
	@Override
	public float getRateOfInterest() {
		return 7f;
	}
}