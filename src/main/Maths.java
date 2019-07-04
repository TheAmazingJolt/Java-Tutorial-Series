package main;

public class Maths {

	private float a;
	private float b;
	private float c;
	
	public Maths(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public float add() {
		c = a + b;
		return c;
	}
	
	public float subtract() {
		c = a - b;
		return c;
	}
	
	public float divide() {
		c = a / b;
		return c;
	}
	
	public float multiply() {
		c = a * b;
		return c;
	}
	
}
