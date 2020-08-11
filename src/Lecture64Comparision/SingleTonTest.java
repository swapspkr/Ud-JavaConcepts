package Lecture64Comparision;

public class SingleTonTest {

	
/*	The singleton design pattern is used to restrict the instantiation of a class 
	and ensures that only one instance of the class exists in the JVM. In other words, 
	a singleton class is a class that can have only one object (an instance of the class)
	at a time per JVM instance*/
	
//	1. to restrict instance of class by making constructor private 
//	2. if we want to get access to class create var as private static ClassName instance = new ClassName();
//	 create public static method which will return the var ;
	
	private static SingleTonTest instance = new SingleTonTest();
	
	private SingleTonTest(){
		System.out.println("Creating obj");
	}
	
	public static SingleTonTest getInstance(){
		return instance;
	}
	
}
