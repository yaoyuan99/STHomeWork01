package com.yaoy;

import java.util.Scanner;

public class StudentManager {
	
	//���빦��
	public void Insert(Student stu[],int num){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��ѧ�ţ�");
		int id=sc.nextInt();
		System.out.println("������ѧ��������");
		String name=sc.next();
		System.out.println("������ѧ���������ڣ�");
		String birDate=sc.next();
		System.out.println("������ѧ���Ա�");
		String gender=sc.next();
		//�����µĶ���
//		Student s=new Student(id,name,birDate,gender);
		//����
		stu[num]=new Student(id,name,birDate,gender);
		System.out.println("����ɹ���");
	}
	
	//�������
	public void OutPut(Student stu[],int num){
		if(num==0){
			System.out.println("û��ѧ����");
		}
		System.out.println("��"+num+"��ѧ�����ֱ�Ϊ��");
		for(int i=0;i<num;i++){
			System.out.println("ѧ�ţ�"+stu[i].getId()+",  ������"+stu[i].getName()+",  �������ڣ�"+stu[i].getBirDate()+",  �Ա�"+stu[i].getGender()+"��");
		}
	}
	
	//���ҹ���
	public void Find(Student stu[],int num){
		Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println("��������Ҫ���ҵ�ѧ��������");
		String findName=sc.next();
		for(int i=0;i<num;i++){
			if(findName.equals(stu[i].getName())){
				System.out.println("ѧ�ţ�"+stu[i].getId()+",  ������"+stu[i].getName()+",  �������ڣ�"+stu[i].getBirDate()+",  �Ա�"+stu[i].getGender()+"��");
				k=1;
			}
		}
		if(k==0){
			System.out.println("δ�ҵ�"+findName+"�������Ϣ��");
		}
	}
	
	//ɾ������
	public void Delete(Student stu[],int num){
		Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println("��������Ҫɾ����ѧ��������");
		String findName=sc.next();
		for(int i=0;i<num;i++){
			if(findName.equals(stu[i].getName())){
				System.out.println("ѧ�ţ�"+stu[i].getId()+",  ������"+stu[i].getName()+",  �������ڣ�"+stu[i].getBirDate()+",  �Ա�"+stu[i].getGender()+"��");
				stu[i]=null;
				k=1;
			}
		}
		System.out.println("�ѽ�"+findName+"ɾ����");
	}
	
	//�˳�����
	public int Exit(){
		System.out.println("�˳��ɹ���");
		return 0;
	}
}
