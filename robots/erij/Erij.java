
package erij;
import java.awt.Color;

import robocode.BulletHitEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.BulletHitEvent;

public class Erij extends Robot{

   public void run(){
       //any code here runs once when the robot is created
       //eg figure out your spawn position, set colors
       setColors(Color.pink, Color.red , Color.pink);

       //this loop repeats forever until you die
       while(true){              
           System.out.println("Here's how you log output");
           ahead(100);
           turnGunRight(180);
           back(100);
           turnGunRight(180);
       }

       
   }

   public void onScannedRobot(ScannedRobotEvent e) {
       //This function gets called every time the scanner sees another robot
       fire(10);
   }

   public void onBulletHit(BulletHitEvent e){
        ahead(200);
        turnLeft(90);
   }
}


