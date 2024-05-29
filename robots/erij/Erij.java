
package erij;
import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.BulletHitEvent;
import robocode.HitWallEvent;

public class Erij extends Robot{

   public void run(){
       //any code here runs once when the robot is created
       //eg figure out your spawn position, set colors
       setColors(Color.pink, Color.red , Color.pink);
       //this loop repeats forever until you die
       while(true){
            System.out.println("Here's how you log output");
            ahead(100);
            turnLeft(90);
            back(100);
            turnRight(90);
       }


   }

   public void onScannedRobot(ScannedRobotEvent e) {
       //This function gets called every time the scanner sees another robot
       fire(100);
       ahead(30);
   }

   public void onBulletHit(BulletHitEvent e){
        ahead(200);
        turnLeft(90);
        scan();
   }

   public void onHitWall(HitWallEvent event){
    turnLeft(90);
    ahead(100);
    scan();
   }

   public void onWin(WinEvent event){
    //a little happy turns 
        fireBullet(1.1);
        fireBullet(1.1);
        fireBullet(1.1);
        fireBullet(1.1);
   }
}


