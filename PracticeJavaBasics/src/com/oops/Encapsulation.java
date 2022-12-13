package com.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A mainA = new A();
		mainA.a = 10;
		mainA.b = 20;
		mainA.add(10, 20);
		
	}

}

class A {
	
	int a;
	int b;
	B bInst = new B();
	public int add(int a , int b) {
		//bInst.display2();
		//bInst.display1();
		return a + b;
	}
	
	private class B {
		A aInt = new A();
		private void display1() {
			System.out.println(aInt.add(10, 11));
			System.out.println("Display 1");
		}
		public void display2() {
			System.out.println("Display 2");
		}
	}
}
