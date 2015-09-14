
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make city
        City A1Q1 = new City();
        
        //Make robot for city
        Robot karel = new Robot(A1Q1, 0, 2, Direction.WEST);
        
        //make walls for city
        //South-facing walls
        new Wall(A1Q1, 2, 1, Direction.SOUTH);
        new Wall(A1Q1, 2, 2, Direction.SOUTH);
        
        //West-facing walls
        new Wall(A1Q1, 2, 1, Direction.WEST);
        new Wall(A1Q1, 1, 1, Direction.WEST);
        
        //North-facing walls
        new Wall(A1Q1, 1, 1, Direction.NORTH);
        new Wall(A1Q1, 1, 2, Direction.NORTH);
        
        //East-facing walls
        new Wall(A1Q1, 1, 2, Direction.EAST);
        new Wall(A1Q1, 2, 2, Direction.EAST);
        
        //Make robot move
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();}
}
