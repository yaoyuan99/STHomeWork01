package com.yaoy;

public class Student {
	//����Student˽������
	private int id;
	private String name;
	private String birDate;
	private String gender;
	
	//Ϊÿ��˽����������һ�Թ��еķ��ʷ���
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
	
	//�޲ι��캯��
	public Student(){
		super();
	}
	
	//�вι��캯��
	public Student(int id,String name,String birDate,String gender){
		super();
		this.id=id;
		this.name=name;
		this.birDate=birDate;
		this.gender=gender;
	}
}
