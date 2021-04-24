package com.yaoy;

import java.util.Scanner;

public class Primary {

	public static void main(String[] args) {
		
		//定义学生对象数组
		Student[] stu=new Student[20];
		Scanner sc=new Scanner(System.in);

		//声明一个学生管理员
		StudentManager sm=new StudentManager();
		int execute=1;   //非0执行，为0退出
		int num=0;       //学生数量
		while(execute!=0){
			//菜单选项
			System.out.println("请选择操作：");
			System.out.println("**************************");
			System.out.println("*        1 插入                                  *");
			System.out.println("*        2 查找                                  *");
			System.out.println("*        3 删除                                  *");
			System.out.println("*        4 输出                                  *");
			System.out.println("*        5 退出                                  *");
			System.out.println("**************************");
			int oper=sc.nextInt();
			if(oper==1){
				sm.Insert(stu,num);
				num++;
			} else if(oper==2){
				sm.Find(stu,num);
			} else if(oper==3){
				sm.Delete(stu,num);
				num--;
			} else if(oper==4){
				sm.OutPut(stu,num);
			} else if(oper==5){
				execute=sm.Exit();
			} else{
				System.out.println("输入错误！");
				continue;
			}
		}
	}

}
