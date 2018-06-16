package model;


public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("����RedheadDuck");
    }
}
