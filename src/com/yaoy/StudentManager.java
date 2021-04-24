package com.yaoy;

import java.util.Scanner;

public class StudentManager {
	
	//插入功能
	public void Insert(Student stu[],int num){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生学号：");
		int id=sc.nextInt();
		System.out.println("请输入学生姓名：");
		String name=sc.next();
		System.out.println("请输入学生出生日期：");
		String birDate=sc.next();
		System.out.println("请输入学生性别：");
		String gender=sc.next();
		//构造新的对象
//		Student s=new Student(id,name,birDate,gender);
		//插入
		stu[num]=new Student(id,name,birDate,gender);
		System.out.println("插入成功！");
	}
	
	//输出功能
	public void OutPut(Student stu[],int num){
		if(num==0){
			System.out.println("没有学生。");
		}
		System.out.println("共"+num+"个学生，分别为：");
		for(int i=0;i<num;i++){
			System.out.println("学号："+stu[i].getId()+",  姓名："+stu[i].getName()+",  出生日期："+stu[i].getBirDate()+",  性别："+stu[i].getGender()+"。");
		}
	}
	
	//查找功能
	public void Find(Student stu[],int num){
		Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println("请输入你要查找的学生姓名：");
		String findName=sc.next();
		for(int i=0;i<num;i++){
			if(findName.equals(stu[i].getName())){
				System.out.println("学号："+stu[i].getId()+",  姓名："+stu[i].getName()+",  出生日期："+stu[i].getBirDate()+",  性别："+stu[i].getGender()+"。");
				k=1;
			}
		}
		if(k==0){
			System.out.println("未找到"+findName+"的相关信息。");
		}
	}
	
	//删除功能
	public void Delete(Student stu[],int num){
		Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println("请输入你要删除的学生姓名：");
		String findName=sc.next();
		for(int i=0;i<num;i++){
			if(findName.equals(stu[i].getName())){
				System.out.println("学号："+stu[i].getId()+",  姓名："+stu[i].getName()+",  出生日期："+stu[i].getBirDate()+",  性别："+stu[i].getGender()+"。");
				stu[i]=null;
				k=1;
			}
		}
		System.out.println("已将"+findName+"删除。");
	}
	
	//退出功能
	public int Exit(){
		System.out.println("退出成功！");
		return 0;
	}
}
