package interfaceApplication;

public class MoneyException extends Exception{
	
	String message;
	public MoneyException(int salary,int tuition) {
		message = "����"+salary+"�Ǹ���������ѧ�ѣ���ѧ��"+tuition+"�Ǹ�����";
	}
	public String warnMess() {
		return message;
	}
}
