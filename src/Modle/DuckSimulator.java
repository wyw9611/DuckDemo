package Modle;

public class DuckSimulator {
	   public static void main(String[] args) {
		      Duck mallard = new MallardDuck();
		      mallard.performQuack();
		      mallard.setQuackBehavior(new Squeak());
		      mallard.performQuack();
		      mallard.performFly();
		      mallard.setFlyBehavior(new FlyWithRocket());
		      mallard.performFly();
		   }


}
