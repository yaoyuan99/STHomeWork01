package com.yaoy;

public class Student {
	//定义Student私有属性
	private int id;
	private String name;
	private String birDate;
	private String gender;
	
	//为每个私有属性设置一对公有的访问方法
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getBirDate(){
		return this.birDate;
	}
	public String getGender(){
		return this.gender;
	}
	
	//无参构造函数
	public Student(){
		super();
	}
	
	//有参构造函数
	public Student(int id,String name,String birDate,String gender){
		super();
		this.id=id;
		this.name=name;
		this.birDate=birDate;
		this.gender=gender;
	}
}
