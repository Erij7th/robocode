
package erij;
import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;

public class Erij extends Robot{

   public void run(){
       //any code here runs once when the robot is created
       //eg figure out your spawn position, set colors
       setColors(Color.pink, Color.red , Color.pink);
       //this loop repeats forever until you die
       while(true){
            //move forward and back while scanning for robots
            ahead(1000);
            back(1000);
            turnRight(90);
       }
    }
   public void onScannedRobot(ScannedRobotEvent e) {
       //This function gets called every time the scanner sees another robot
       fire(100);
       
   }
   public void onHitWall(HitWallEvent event){
        turnLeft(90);
   }

   public void onHitRobot(HitRobotEvent event){
        fire(100);
   }
   public void onWin(WinEvent event){
    //a little happy turns 
        fireBullet(1.1);
        fireBullet(1.1);
        fireBullet(1.1);
        fireBullet(1.1);
   }
}


