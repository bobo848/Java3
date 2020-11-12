# Java3
# 计192刘利波 2019311290
# 实验四 接口程序实验
## 一、实验目的
1.掌握Java抽象类和抽象方法的定义  
2.掌握Java中接口的定义，熟悉掌握接口的定义形式以及接口的实现方法  
3.了解异常的使用方法，并在程序中根据输入情况做异常处理  
## 二、实验内容
### 某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。  此时，该博士研究生有双重身份：学生和助教教师。  
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  
## 三、实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;  
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5.根据输入情况，要在程序中做异常处理。  
## 四、实验过程
1.首先创建一个package：interfaceApplication。    
2.在包中创建两个接口StudentManagement和TeacherManagement，分别设定博士研究生作为学生和助教的两类行为标准。   
3.并在包中实例化一个类DoctoralCandidate来实现上述两个接口。实例化一个MoneyException异常类来进行对收税金的判断。实例化主类Test_JavaProgram对用户输入进行存储和操作。    
4.StudentManagement类中：**    
*(a)定义常量buzhu    
(b)设计两个方法：缴纳学费和查询学费*  
5.TeacherManagement类中：**  
*(a)定义常量sanxianyijin  
(b)设计两个方法：查询工资和发放工资*  
6.DoctoralCandidate类中：**  
*(a)定义基本信息变量  
(b)实现两个接口四个方法*    
7.Test_JavaProgram类中：**  
*(a)首先定义全局变量和录入数组  
(b)设计三个循环：第一个循环依次录入个人信息，第二个循环判断录入工资和学费是否正确，第三个循环执行方法操作  
(c)设计税收算法方法    
(d)设计异常抛出方法*  
8.MoneyException类中：**  
*(a)创建 MoneyException类为Exception类子类  
(b)创建 warnMess方法用来返回错误提示*  
## 五、核心代码
1.学费查询方法***  
```
public void searchTuition(double tuition) {
		tuition=tuition-buzhu;
		System.out.println("本学期学费："+tuition);
		System.out.println("本学年学费："+2*tuition);
	}
``` 
2.工资查询方法***
```
public void searchSalary(double salary,double revenue) {                       
		System.out.println("工资："+(salary-revenue));
		System.out.println("年实际工资："+12*(salary-revenue));
	}
``` 
3.工资发放方法***
```
public void giveSalary(double salary,double revenue) {
		account=account+(salary-revenue);
		System.out.println("操作成功！");
		System.out.println("账户余额："+account);
	}
```


## 六、实验结果
![实验结果](https://github.com/bobo848/Java3/blob/main/%E5%AE%9E%E9%AA%8C%E5%9B%9B%E7%BB%93%E6%9E%9C.JPG)


## 七、实验感想
通过本次实验，我学会了接口和方法的使用，回顾了数组的声明和使用   
了解了异常和异常处理的方法   
了解了自己得许多不足之处  
在以后的实验中一定会早日完成  






