package interfaceApplication;

import java.util.Scanner;

public class Test_JavaProgram {
	static int revenue;
    static String name;     //����
	static String sex;      //�Ա�
	static int age;         //����
	static int tuition;     //ÿѧ��ѧ��
	static int salary;      //ÿ��нˮ
	static DoctoralCandidate[] Doctor = new  DoctoralCandidate[10];
	public static void main(String[] args) {
//**********************************************���ù��캯������***************************************************************
		DoctoralCandidate doc1 = new DoctoralCandidate("����", "��", 25, 4500, 8000);
		//DoctoralCandidate doc2 = new DoctoralCandidate("��һ", "Ů", 22, 5200, 7250);
		StudentManagement stu1 = doc1;
		//StudentManagement stu2 = doc2;
		TeacherManagement tea1 = doc1;
		//TeacherManagement tea2 = doc2;
		System.out.println("�ڶ���");
		try {
			giveSalary(doc1.getSalary(),doc1.getTuition());
			doc1.giveSalary(doc1.getSalary(),giveRevenue(doc1.getSalary(),doc1.getTuition()));
			stu1.searchTuition();
			tea1.searchSalary();	
		}
		catch(MoneyException e) {
			System.out.println("��������ȷѧ�ѣ�");
			System.out.println(e.warnMess());
	    }
//		System.out.println("�ڶ���");
//		try {
//			giveSalary(doc2.getSalary(),doc2.getTuition());
//			doc2.giveSalary(doc2.getSalary(),giveRevenue(doc2.getSalary(),doc2.getTuition()));
//			stu2.searchTuition();
//			tea2.searchSalary();	
//		}
//		catch(MoneyException e) {
//			System.out.println("��������ȷѧ�ѣ�");
//			System.out.println(e.warnMess());
//	    }
		
//**********************************************ʹ�����鷽��***************************************************************
		System.out.println("������¼��������");
		Scanner reader0 = new Scanner(System.in);
		int x =reader0.nextInt();
		
		
		for(int i=0;i<x;) {
			Scanner reader = new Scanner(System.in);
			System.out.println("�����������������Ա����䡢ѧ��ѧ�ѡ��¹��ʣ�");
			Doctor[i] = new DoctoralCandidate();
			name = reader.nextLine();
			Doctor[i].name=name;
			sex = reader.nextLine();
			Doctor[i].sex=sex;
			age = reader.nextInt();
			Doctor[i].age=age;
			tuition = reader.nextInt();
			Doctor[i].tuition=tuition;
			salary = reader.nextInt();
			Doctor[i].salary=salary;
			System.out.println(Doctor[i].name+" "+Doctor[i].sex+" "+Doctor[i].age+" "+Doctor[i].tuition+" "+Doctor[i].salary);
			i++;
			
		}
		
		for(int i=0;i<x;) {
		System.out.println("��"+i+"��");
		 
		try {
			giveSalary(Doctor[i].getSalary(),Doctor[i].getTuition());
			Doctor[i].giveSalary(Doctor[0].getSalary(),giveRevenue(Doctor[0].getSalary(),Doctor[0].getTuition()));
			Doctor[i].searchTuition();
			Doctor[i].searchSalary();
			
	}
		catch(MoneyException e) {
			System.out.println("��������ȷѧ�ѣ�");
			System.out.println(e.warnMess());
	    }
		i++;
		}
		

} 
	public static void giveSalary(int salary,int tuition) throws MoneyException{
		if(salary<0||tuition<0||salary<tuition) {
			throw new MoneyException(salary,tuition);
		}
	}
	public final static double giveRevenue(int salary,int tuition) {
		revenue=salary-TeacherManagement.sanxianyijin+StudentManagement.buzhu-tuition;//ʵ��˰��
		if(revenue<=5000.00) {                          //3%
			return revenue*0.03;
		}
		else if(revenue>5000.00 && revenue<=12000.00) { //10%
			return (revenue-5000)*0.1+1500;
		}
		else if(revenue>12000.00 && revenue<=25000.00) { //20%
			return (revenue-12000)*0.2+2200;
		}
		else if(revenue>25000.00 && revenue<=35000.00) { //25%
			return (revenue-25000)*0.25+4800;
		}
		else if(revenue>35000.00 && revenue<=55000.00) { //30%
			return (revenue-35000)*0.3+7300;
		}
		else if(revenue>55000.00 && revenue<=80000.00) { //35%
			return (revenue-55000)*0.35+13300;
		}
		else if(revenue>80000.00) {                      //45%
			return (revenue-80000)*0.45+22050;
		}
		return 0;
	}
}