package com.cac910;

public class Scoring {
	
	public static void main(String[] args) {
		Student stu1 = new Student("Jack",70,70);
		int avg1 = stu1.average();
		if (avg1 <60) {
			System.out.println("Sorry");
		}else {
			System.out.println("Congradulation!!");
		}
		stu1.print();
	}

}
