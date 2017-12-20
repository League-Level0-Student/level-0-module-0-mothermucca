import org.jointheleague.graphical.robot.Robot;


public class RobotGraffiti {
	public static void main(String[] args) {

    	Robot robot = new Robot();
    	robot.setSpeed(500);
    	robot.moveTo(200, 500);
    	robot.penDown();
    	
    	robot.setAngle(20);
    	robot.move(450);
    	robot.setAngle(160);
    	robot.move(450);
    	
    	robot.moveTo(255, 350);
    	robot.setAngle(90);
    	robot.move(196);
    	
    	robot.moveTo(700, 500);
    	robot.setAngle(0);
	}
}
