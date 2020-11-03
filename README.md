# Java-test3
# 计192 2019310191 齐睿
# Java 实验
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.掌握Java中抽象类和抽象方法的定义；   
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;  
3.了解异常的使用方法，并在程序中根据输入情况做异常处理;    
## 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  
## 实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;  
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5.根据输入情况，要在程序中做异常处理。   
## 实验过程
**1.首先创建两个package：Information 和 Run。  
2.在包中创建两个接口，分别设定博士研究生作为学生和助教的两类行为标准。
3.在Information 包中实例化四个类：Teacher、Student、Course 和 People，并在Run 包中实例化一个类：Test。  
3.People类中：**  
*(a)作为一个父类，主要为其他三个同包子类提供变量。（最重要两个变量：stuNo、courseNumber,用于计数判断）  
(b)提供默认构造方法和toString方法。*    
**4.Teacher类中：**  
*(a)在Teacher类中创建两个 private属性：teacherName和 teacherId分别表示老师姓名和老师工号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别）的打印。  
(c)在打印授课名称时，运用 super语法调用People类中course变量。*     
**5.Student类中：**  
*(a)在Student类中创建两个 private属性：StudentName和 StudentId分别表示学生姓名和学生学号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用 super语法调用People类中courseNumber变量。  
(d)创建一组方法（课程数加减方法）：addCourses和 reduceCourses，来实现对课程数修改。*      
**6.Course中：**  
*(a)在Course类中创建三个private属性：num、name和 add分别表示编、课程名称和上课地址。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用 super语法调用People类中courseNumber变量。  
(d)创建一组方法（学生数加减方法）：addStuNo和 reduceStuNo，来实现对学生数修改。*    
**7.Test_courseChooseSystem中：**  
*(a)在本类中，调用 Teacher、Student、Course类，以及 java.util.Scanner用来实现控制台输入信息。  
(b)创建三个方法：judgeStu、judgeChoose、courseChoose依次对输入数据进行判断。  
(c)创建两个个方法：addWork、reduceWork根据对变量 stuNo、courseNo的同时判断，来实现对不同同学选择不同的老师计数。  
(d)创建一组打印方法：printAll、printTeacher、printTeacherAll、printStudent、printStudentAll、printCourse、printCourseAll方便主方法进行信息的打印。  
(e)最后在主方法中建立一个循环（保持选课系统持续存在，方便多次选课），接受第一次数据输入，调用judge（）方法开始进行选课。选课完毕，调用 printAll（）方法打印信息.*   
## 流程图  

## 核心方法  
***1.Teacher构造方法***
```
public Teacher(int number,String name,String id,String course){
	setNo(number);
	setTeacherName(name);
	setTeacherId(id);
	setTeaCourse(course);
}
``` 
***2.Teacher内打印编号方法（与姓名、工号、性别、课程类似）***
```
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
``` 
***3.Teacher toString方法***
```
public String toString() {
	return num+name+sex+id+course;
}
``` 
***4.Student构造方法***  
```
public Student(int number,String name,String sex,String id,int course){
	setNo(number);
	setStudentName(name);
	setStudentId(id);
	setCourses(course);
	}
``` 
***5.Student内打印编号方法（与姓名、学号、性别、课程数方法类似）***
```
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
``` 
***6.课程数增减方法***
```
public void addCourses(int courseNumber) {
	this.courseNumber = courseNumber+1;
}
public void reduceCourses(int courseNumber) {
	this.courseNumber = courseNumber-1;
}
}
```
***7.Course构造方法***
``` 
public Course(int number,String name,String add,int stuNo){
	setNo(number);
	setName(name);
	setAdd(add);
	setStuNo(stuNo);
	}
```
***8.学生数增减方法***
``` 
public void addStuNo(int stuNo) {
	super.stuNo = stuNo+1;
}
public void reduceStuNo(int stuNo) {
	super.stuNo = stuNo-1;
}
```
***9.Test主方法***
``` 
public static void main(String[] args) {
		
		for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);
			int x =reader.nextInt();
			stuNo=x;//记录学生编号
			judgeStu(x);//选择学生
			printAll();
		}
	
		
	}
```
***10.学生选择方法（根据主类中获得数据选择学生）***
``` 
public static void judgeStu(int No) {
		Scanner reader = new Scanner(System.in);
		printStudent(stuNo);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
		if(No==2)
			judgeChoose(y);
		if(No==3)
			judgeChoose(y);
		if(No==4)
			judgeChoose(y);
	}
```
***11.选退课判断方法***
``` 
public static void judgeChoose(int No) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNo=z;//记录课程编号
		if(No==1){//选课
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		if(No==2){//退课
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    }
	}
```
***12.课程选择方法***
``` 
public static void courseChoose(int No) {//选择课程并打印老师
		Scanner reader = new Scanner(System.in);
		if(No==1) {
			printTeacher(1);
		    }
		if(No==2) {
			printTeacher(2);
			}
		//else System.out.println("没有该课程信息，请输入1~2");
		
	}
```
***13.增加操作方法***
``` 
public static void addWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNo==1 && courseNo==2) {
		cou1.addStuNo(cou1.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNo==2 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu1.addCourses(stu1.getCourses());
		}
		else if (stuNo==2 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu1.addCourses(stu1.getCourses());
			}
		else if (stuNo==3 && courseNo==1) {
			cou0.addStuNo(cou0.getStuNo());
			stu2.addCourses(stu2.getCourses());
			}
		else if (stuNo==3 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu2.addCourses(stu2.getCourses());
			}
		else if (stuNo==4 && courseNo==1) {
			cou0.addStuNo(cou0.getStuNo());
			stu3.addCourses(stu3.getCourses());
			}
		else if (stuNo==4 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu3.addCourses(stu3.getCourses());
			}
	}
```
***14.删减操作方法***
``` 
public static void reduceWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
			cou0.reduceStuNo(cou0.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNo==1 && courseNo==2) {
			cou1.reduceStuNo(cou1.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNo==2 && courseNo==1) {
			cou0.reduceStuNo(cou0.getStuNo());
			stu1.reduceCourses(stu1.getCourses());
			}
		else if (stuNo==2 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu1.reduceCourses(stu1.getCourses());
				}
		else if (stuNo==3 && courseNo==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu2.reduceCourses(stu2.getCourses());
				}
		else if (stuNo==3 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu2.reduceCourses(stu2.getCourses());
				}
		else if (stuNo==4 && courseNo==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu3.reduceCourses(stu3.getCourses());
				}
		else if (stuNo==4 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu3.reduceCourses(stu3.getCourses());
				}
		
	}
```
***15.打印信息方法（打印教师、学生、课程信息与本方法类似）***
```
public static void printAll() {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNo()+"  "+stu1.getStudentName()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("  "+stu2.getNo()+"  "+stu2.getStudentName()+" "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("  "+stu3.getNo()+"  "+stu3.getStudentName()+" "+stu3.getStudentId()+"   "+stu3.getCourses());
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		System.out.println("  "+tea0.getNo()+"  "+tea0.getTeacherName()+" "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println("  "+cou1.getNo()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNo());
	}
```
## 系统运行截图  
***Picture1.choose coures：***
   
  
  
***Picture2.exit course：***
  
## 实验感想  
**通过本次实验，我学会并熟悉了前半学期的课程内容：  
*第二章：基本数据类型、输入输出数据  
第三章：运算符与表达式、if条件分支语句  
第四章：类、构造方法和对象的创建、参数传值  
第五章：子类与父类、super关键字  
以及静态变量和静态方法的应用。*  
充分练习并使用不同类之间的方法的调用，父类与子类的继承性以及通过super.在子类中使用父类已被重写的变量和方法。通过if的判断语句来实现系统的选择和计数功能，for和break来实现系统刷新和退出功能。  
本次实验不足：  
1.未能实现数组来储存数据，对于构造方法不懂如何获取字符并存入数组中。  
2.toString方法运用的不够充分，其实可以做到将输出全部由toString实现。**
