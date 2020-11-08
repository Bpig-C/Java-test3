package interfaceApplication;

public interface TeacherManagement {//作为助教身份的“行为标准”
	int sanxianyijin=1050;//五险一金
	void giveSalary(double salary,double revenue);  //发放薪水
	void searchSalary(double salary,double revenue);//查询薪水
}
