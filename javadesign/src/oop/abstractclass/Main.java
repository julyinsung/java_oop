package oop.abstractclass;

public class Main {

	public static void main(String[] args) {
		
		ValidationIF v = new FileValidation();
		System.out.println(v.isStatus());
		v.valid();
		System.out.println(v.map());
		System.out.println(v.isStatus());
	}
}
