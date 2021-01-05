package com.cac910;

public class Student {
	String name;
	int eng;
	int math;

	public Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public int average() {
		return (eng + math) / 2;

	}

	public void print() {
	
		int avg = average();
		String grade = "AABCDFFFFF";
		char level= grade.charAt(10 - avg/10);
				
		/*
		switch (avg / 10) {
		case 10:
		case 9:
			level = "A";
			break;
		case 8:
			level = "B";
			break;
		case 7:
			level = "C";
			break;
		case 6:
			level = "D";
			break;
		default:
			level = "F";
			break;
		}*/
		System.out.println(name + "\t" + eng + "\t" + math + "\t" + average() + "\t" + level);
	}
}
	

