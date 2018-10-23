

import java.util.Scanner;

public class Addition {
	
	private int num1;
	private int num2;
	
	
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public static int value(Addition add){
		return add.getNum1() + add.getNum2();
	}
	
	@Override
	public String toString() {
		Addition add = new Addition(num1, num2);
		return "Addition : "+ num1 + " + " + num2 + " = " + value(add);
	}
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first argument : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second argument : ");
		int num2 = scan.nextInt();
		Addition add = new Addition(num1, num2);
		System.out.println(add.toString());
	}
	
	

}
