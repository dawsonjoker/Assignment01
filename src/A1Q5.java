
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //Make City 
        City A1Q5 = new City();
        
        //Make Walls
        new Wall(A1Q5, 3, 3, Direction.SOUTH);
        new Wall(A1Q5, 3, 3, Direction.EAST);
        
        new Wall(A1Q5, 2, 3, Direction.EAST);
        new Wall(A1Q5, 2, 3, Direction.NORTH);
        new Wall(A1Q5, 2, 3, Direction.WEST);
        
        //Make Robots
        Robot karel = new Robot(A1Q5, 3, 3, Direction.EAST);
        Robot maria = new Robot(A1Q5, 0, 1, Direction.WEST);
        
        //Label Robots
        karel.setLabel("K");
        maria.setLabel("M");
        
        //Make Things
        new Thing(A1Q5, 0, 0);
        new Thing(A1Q5, 1, 0);
        new Thing(A1Q5, 1, 1);
        new Thing(A1Q5, 1, 2);
        new Thing (A1Q5, 2, 2);
        
        //Move Robots to pick up things
        maria.move();
        maria.pickThing();
        
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        karel.move();
        karel.pickThing();
        karel.turnLeft();
    }
}
