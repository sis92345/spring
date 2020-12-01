package com.example;

public class Hello {
	//Member: Property
	private String name;
	private Printer printer;
	
	//Constructor
	public Hello(String name, Printer printer) {
		this.name = name;
		this.printer = printer;
	}
	//Setter
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}
	//Method
	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}