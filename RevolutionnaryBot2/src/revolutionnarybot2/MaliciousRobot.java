package revolutionnarybot2;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;

public class MaliciousRobot extends Robot implements Runnable{

    private final int time;
    private final Dimension size;
    private final int speed;

    public MaliciousRobot(int time, int speed) throws AWTException {
	super();
	this.time = time;
	this.speed = speed;
	this.size = Toolkit.getDefaultToolkit().getScreenSize();
    }

    @Override
    public void run() {
	Point pos = MouseInfo.getPointerInfo().getLocation();
	int x = pos.x, y = pos.y;
	int xVel = speed, yVel = speed;
	
	for (int i = 0; i < this.time; i++) {
	    this.delay(10);
	    
	    /*
	    To Do --> Right Click
	    */
	    
	    this.mouseMove(
		x = x + (xVel = x <= 0 ? speed : x >= this.size.getWidth() ? -speed : xVel),
		y = y + (yVel = y <= 0 ? speed : y >= this.size.getHeight() ? -speed : yVel)
	    );
	}
    }
}
