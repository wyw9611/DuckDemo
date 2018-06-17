package Modle;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
	    flyBehavior = new FlyWithWings();

	}

	public void display(){
		System.out.println("ÂÌÍ·Ñ¼");
	}
	public void swim(){
		System.out.println("ÂÌÍ·Ñ¼");
	}
}
