package com.cac910;

public class Scoring {
	
	public static void main(String[] args) {
		Student stu1 = new Student("Jack",70,50);
		int avg = stu1.average();
		if (avg <60) {
			System.out.println("Sorry");
		}else {
			System.out.println("Congradulation!!");
		}
		stu1.print();
	}

}
