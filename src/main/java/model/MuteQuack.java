package model;

public class MuteQuack implements QuackBehavior {

    //叫的方法MuteQuack
    @Override
    public void quack() {
        System.out.println("不能叫");
    }
}
