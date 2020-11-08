package interfaceApplication;

public class MoneyException extends Exception{
	
	String message;
	public MoneyException(int salary,int tuition) {
		message = "工资"+salary+"是负数或少于学费，或学费"+tuition+"是负数，";
	}
	public String warnMess() {
		return message;
	}
}
