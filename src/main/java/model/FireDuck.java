package model;

public class FireDuck extends Duck{


    public FireDuck() {
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Œ“ «FireDuck");
    }

}
