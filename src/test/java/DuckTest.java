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
        System.out.print("���з�ʽ:");
        mallardDuck.performFly();
        System.out.print("���з�ʽ:");
        mallardDuck.performQuack();
        System.out.println();
        
        //FireDuck
        Duck fireDuck=new FireDuck();
        fireDuck.display();
        System.out.print("���з�ʽ:");
        fireDuck.performFly();
        System.out.print("���з�ʽ:");
        fireDuck.performQuack();
        System.out.println();
        
        //RubberDuck
        Duck rubberdDuck=new RubberDuck();
        rubberdDuck.display();
        System.out.print("���з�ʽ:");
        rubberdDuck.performFly();
        System.out.print("���з�ʽ:");
        rubberdDuck.performQuack();
    }
}
