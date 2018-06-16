package model;

public abstract class Duck {
	
	   FlyBehavior flyBehavior;
	   QuackBehavior quackBehavior;


	    //��
	    public void performQuack(){
	        quackBehavior.quack();
	    }

	    //��
	    public void performFly(){
	        flyBehavior.fly();
	    }
	    
	    //��Ӿ

	    public void swim(){
	        System.out.println("All duck float , even decoys!");
	    }

	    /*
	    * Ѽ�����
	    * */
	    public abstract void display();

	    /*
	    * ��̬�趨��Ϊ
	    * */
	    public void setFlyBehavior(FlyBehavior flyBehavior) {
	        this.flyBehavior = flyBehavior;
	    }

	    public void setQuackBehavior(QuackBehavior quackBehavior) {
	        this.quackBehavior = quackBehavior;
	    }
}
