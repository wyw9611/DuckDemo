package Modle;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		quackBehavior = new Quack();
	    flyBehavior = new FlyWithWings();

	}

	public void display(){
		System.out.println("ºìÍ·Ñ¼");
	}
	public void swim(){
		System.out.println("ºìÍ·Ñ¼");
	}
}
