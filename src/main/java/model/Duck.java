package model;

public abstract class Duck {
	
	   FlyBehavior flyBehavior;
	   QuackBehavior quackBehavior;


	    //叫
	    public void performQuack(){
	        quackBehavior.quack();
	    }

	    //飞
	    public void performFly(){
	        flyBehavior.fly();
	    }
	    
	    //游泳

	    public void swim(){
	        System.out.println("All duck float , even decoys!");
	    }

	    /*
	    * 鸭子外观
	    * */
	    public abstract void display();

	    /*
	    * 动态设定行为
	    * */
	    public void setFlyBehavior(FlyBehavior flyBehavior) {
	        this.flyBehavior = flyBehavior;
	    }

	    public void setQuackBehavior(QuackBehavior quackBehavior) {
	        this.quackBehavior = quackBehavior;
	    }
}
