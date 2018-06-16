import org.junit.Test;

import model.Duck;
import model.FireDuck;
import model.MallardDuck;
import model.RubberDuck;

public class DuckTest {
    @Test
    public void duckTest(){
    	//MallardDuck
        Duck mallardDuck=new MallardDuck();
        mallardDuck.display();
        System.out.print("飞行方式:");
        mallardDuck.performFly();
        System.out.print("鸣叫方式:");
        mallardDuck.performQuack();
        System.out.println();
        
        //FireDuck
        Duck fireDuck=new FireDuck();
        fireDuck.display();
        System.out.print("飞行方式:");
        fireDuck.performFly();
        System.out.print("鸣叫方式:");
        fireDuck.performQuack();
        System.out.println();
        
        //RubberDuck
        Duck rubberdDuck=new RubberDuck();
        rubberdDuck.display();
        System.out.print("飞行方式:");
        rubberdDuck.performFly();
        System.out.print("鸣叫方式:");
        rubberdDuck.performQuack();
    }
}
