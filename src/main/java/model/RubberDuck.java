package model;


public class RubberDuck extends Duck {

	    public RubberDuck() {
	        quackBehavior=new MuteQuack();
	        flyBehavior=new FlyNoWay();
	    }

	    @Override
	    public void display() {
	        System.out.println("Œ“ «RubberDuck");
	    }
}
