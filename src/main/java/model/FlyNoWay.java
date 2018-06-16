package model;


public class FlyNoWay implements FlyBehavior {

    //飞行方法FlyNoWay
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
