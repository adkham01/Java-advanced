package com.multiThreading;
class RegisterCourse extends Thread {
	Object courseName;
	Object trainerName;
	public RegisterCourse(Object courseName, Object trainerName) {
		this.courseName = courseName;
		this.trainerName = trainerName;
	}
	@Override
	public void run() {
		synchronized (courseName) {
			System.out.println("RegisterCourse Thread holds CourseName Resource and waiting for TrainerName");
			synchronized (trainerName) {
				System.out.println("Register Course is Succes!");
			}
		}
	}
}
class CancelCourse extends Thread {
	Object courseName;
	Object trainerName;
	public CancelCourse(Object courseName, Object trainerName) {
		this.courseName = courseName;
		this.trainerName = trainerName;
	}
	@Override
	public void run() {
		synchronized (trainerName) {
			System.out.println("CancelCourse Thread holds TrainerName Resource and waiting for CourseName");
			synchronized (courseName) {
				System.out.println("Cancel Course is Succes!");
				
			}
		}
	}
}
public class MultiThreading_22 {

	public static void main(String[] args) {
		Object courseName = new Object();
		Object trainerName = new Object();
		
		RegisterCourse rc = new RegisterCourse(courseName, trainerName);
		CancelCourse cc = new CancelCourse(courseName, trainerName);
		
		rc.start();
		cc.start();

	}

}
