import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Checkpoint {

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What's your favorite color?");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color!");
		
		Robot robot = new Robot();
    	robot.penDown();
    	robot.setAngle(30);
    	
    	for (int i = 0; i < 3; i++) {
        	robot.move(200);
        	robot.turn(120);
		}
		

	}

}
