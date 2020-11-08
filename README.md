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
**1.首先创建一个package：interfaceApplication。  
2.在包中创建两个接口StudentManagement和TeacherManagement，分别设定博士研究生作为学生和助教的两类行为标准。 
3.并在包中实例化一个类DoctoralCandidate来实现上述两个接口。实例化一个MoneyException异常类来进行对收税金的判断。实例化主类Test_JavaProgram对用户输入进行存储和操作。  
4.StudentManagement类中：**  
*（a）定义常量buzhu
（b）设计两个方法：缴纳学费和查询学费  *
**5.TeacherManagement类中：** 
*(a)定义常量sanxianyijin
（b）设计两个方法：查询工资和发放工资  *  
**6.DoctoralCandidate类中：**  
*(a)定义基本信息变量
（b）实现两个接口四个方法*    
**7.Test_JavaProgram类中：**  
*(a)首先定义全局变量和录入数组
(b)设计三个循环：第一个循环依次录入个人信息，第二个循环判断录入工资和学费是否正确，第三个循环执行方法操作。
(c)设计税收算法方法  
(d)设计异常抛出方法  *
**8.MoneyException类中：**  
*(a)创建 MoneyException类为Exception类子类  
(b)创建 warnMess方法用来返回错误提示  *  
**9.在实验类中创建DoctoralCandidate的对象Doctor，创建TeacherManagement的对象tea，创建StudentManagement的对象Stu,通过接口回调**
## 核心方法  
***1.revenue税收计算方法***
```
public final static double giveRevenue(double salary,double tuition) {
		tuition=tuition/6;                                                             //平均每月学费
		revenue=TeacherManagement.sanxianyijin+StudentManagement.buzhu-tuition; //实际税收金额
		if(revenue<=5000.00) {                           //3%
			return revenue*0.03;
		}
		else if(revenue>5000.00 && revenue<=12000.00) {  //10%
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
