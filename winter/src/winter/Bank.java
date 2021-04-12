package winter;

public class Bank {
	double getinterrestRate() {
		return 0.0;
	}
	}

class BadBank extends Bank{
	@Override
	double getinterrestRate() {
		return 10.0;
	}
}
class nomarlBank extends Bank {
	@Override
	double getinterrestRate() {
		return 5.0;
	}
	
}

