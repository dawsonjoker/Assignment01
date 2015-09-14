
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City A1Q4 = new City();
        
        //Make walls for city
        new Wall(A1Q4, 0, 1, Direction.WEST);
        new Wall(A1Q4, 1, 1, Direction.WEST);
        new Wall(A1Q4, 1, 1, Direction.SOUTH);
        
        //Make robots
        Robot karel = new Robot(A1Q4, 0, 0, Direction.SOUTH);
        Robot ostrich = new Robot(A1Q4, 0, 1, Direction.SOUTH);
        
        //Move robots to collision
        karel.move();
        ostrich.move();
        ostrich.turnLeft();
        
        karel.move();
        ostrich.move();
        
        ostrich.turnLeft();
        ostrich.turnLeft();
        ostrich.turnLeft();
        ostrich.move();
        
        ostrich.turnLeft();
        ostrich.turnLeft();
        ostrich.turnLeft();
        karel.turnLeft();
        
        karel.move();
        ostrich.move();
        
        
        
        
        
        
        
      
        
         
                
                
        
        
       
    
    
    
    }
}
