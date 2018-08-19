package _00_IntroToArrays;

import java.util.Random; 

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robot = new Robot[5];
		int x = 50;
		int y = 550;
		//3. use a for loop to initialize the robots.
		for(int i=0; i < robot.length; i++) {
			
			robot[i] = new Robot(x, y);
			robot[i].setSpeed(5);
			x+=150;
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		while(true) {
			for(int i=0; i < robot.length; i++) {
				if(robot[i].getY() < 0) {
					int number = i+1;
					JOptionPane.showMessageDialog(null, "Robot " + number + " is the winner!");
					System.exit(0);
				}
			}
			
		for(int i=0; i < robot.length; i++) {
			Random random = new Random();
			robot[i].move(random.nextInt(51));
		}
		
		
		
		}
		
		
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
	}

	
}
