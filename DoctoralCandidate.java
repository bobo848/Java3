package interfaceApplication;

public class DoctoralCandidate implements StudentManagement,TeacherManagement {
	
	String name;     //姓名
	String sex;      //性别
	int age;         //年龄
	int tuition;     //每学期学费
	int salary;      //每月薪水
	double revenue;  //实际税收 
    
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
		System.out.println("工资："+salary);
	}

	public void payTuition() {
		
		tuition=tuition-buzhu;
	}

	public void searchTuition() {
		
	}
    public void searchTuition(int tuition) {
		
		System.out.println("学费："+tuition);
		System.out.println("本学年学费："+2*tuition);
	}
	
	public void giveSalary(int salary,double revenue) {//重写接口中方法
		System.out.println("缴纳税收："+revenue);
		System.out.println("实际工资："+(salary-revenue));
		System.out.println("年实际工资："+12*(salary-revenue));
	}
	
	
	public void giveSalary() {
		
	}

}
