package interfaceApplication;

public class DoctoralCandidate implements StudentManagement,TeacherManagement {
	
	String name;     //����
	String sex;      //�Ա�
	int age;         //����
	int tuition;     //ÿѧ��ѧ��
	int salary;      //ÿ��нˮ
	double revenue;  //ʵ��˰�� 
    
	public DoctoralCandidate(String name,String sex,int age,int tuition,int salary)
	{	
	setName(name);
	setSex(sex); 
	setAge(age);
	setTuition(tuition);
	setSalary(salary);
}   
	public DoctoralCandidate()
	{	
	
}
	void setName(String name) {
		this.name=name;	
	}
	public String getName(){
		return name;	
	}
		void setSex(String sex) {
	    this.sex=sex;	
	}
	public String getSex(){
		return sex;	
	}
	public void setAge(int age){
		this.age=age;	
	}
	public int getAge(int age) {
		return age;
	}
	void setTuition(int tuition) {
		this.tuition = tuition;	
	}
	int getTuition() {
		return tuition;	
	}
	void setSalary(int salary) {
		this.salary =salary;	
	}
	int getSalary() {
		return salary;	
	}
	
	
	

	
	public void searchSalary() {
		System.out.println("���ʣ�"+salary);
	}

	public void payTuition() {
		
		tuition=tuition-buzhu;
	}

	public void searchTuition() {
		
	}
    public void searchTuition(int tuition) {
		
		System.out.println("ѧ�ѣ�"+tuition);
		System.out.println("��ѧ��ѧ�ѣ�"+2*tuition);
	}
	
	public void giveSalary(int salary,double revenue) {//��д�ӿ��з���
		System.out.println("����˰�գ�"+revenue);
		System.out.println("ʵ�ʹ��ʣ�"+(salary-revenue));
		System.out.println("��ʵ�ʹ��ʣ�"+12*(salary-revenue));
	}
	
	
	public void giveSalary() {
		
	}

}
