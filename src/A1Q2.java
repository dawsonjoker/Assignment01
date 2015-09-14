
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City A1Q2 = new City();
        
        //Make robot for city
        Robot karel = new Robot(A1Q2, 1, 2, Direction.SOUTH);
        
        //Make walls for city
        new Wall(A1Q2, 1, 2, Direction.SOUTH);
       
        new Wall(A1Q2, 1, 2, Direction.EAST);
        
        new Wall(A1Q2, 1, 2, Direction.NORTH);
        new Wall(A1Q2, 1, 1, Direction.NORTH);
        
        new Wall(A1Q2, 1, 1, Direction.WEST);
        new Wall(A1Q2, 2, 1, Direction.WEST);
        
        new Wall(A1Q2, 2, 1, Direction.SOUTH);
        
        //Make newspaper for karel to pickup
        new Thing(A1Q2, 2, 2);
        
        //Move karel to get newspaper
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.pickThing();
        
        //Move karel back to bed
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
       
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
                
    
                
                
                
}
}
