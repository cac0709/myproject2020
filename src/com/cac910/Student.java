package com.cac910;

public class Student {
	String name;
	int eng;
	int math;
	
	public Student (String name,int eng,int math) {
		this.name=name;
		this.eng =eng;
		this.math=math;
	}
	public int average(){
		return (eng+math)/2;
		
	}
	public void print () {
		System.out.println(name+"\t"+eng+"\t"+math+"\t"+average());
	}
	
}

