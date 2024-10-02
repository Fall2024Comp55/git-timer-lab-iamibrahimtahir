import acm.graphics.*;
import acm.program.*;
import javax.swing.*;

public class MyFirstTimer extends GraphicsProgram {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
		
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		
		Timer someTimerVar = new Timer(1000, objectToBeWokenUp);
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}