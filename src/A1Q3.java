
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City A1Q3 = new City();
        
        //Make walls (Mountain)
        new Wall(A1Q3 , 3, 2, Direction.WEST);
        new Wall(A1Q3, 3, 2, Direction.NORTH);
        
        new Wall(A1Q3, 2, 3, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.WEST);
        
        new Wall(A1Q3, 1, 3, Direction.NORTH);
        new Wall(A1Q3, 1, 3, Direction.EAST);
        
        new Wall(A1Q3, 2, 4, Direction.NORTH);
        new Wall(A1Q3, 2, 4, Direction.EAST);
        new Wall(A1Q3, 3, 4, Direction.EAST);
        
        //Make robot 
        Robot karel = new Robot(A1Q3, 3, 0, Direction.EAST);
        
        //Make flag for karel to pickup
        new Thing(A1Q3, 3, 1);
        
        //Move karel over the mountain WITH the flag
        karel.move();
        karel.pickThing();
        
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.turnLeft();}
}
