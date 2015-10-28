import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


public class UserComp extends GameDriver{

	int dx = 0, dy = 0, speed = 5;
	Rectangle box = new Rectangle(100,100,75,75);
	Rectangle bg1 = new Rectangle(0,0,800,600);
	boolean wPressed = false, sPressed = false, dPressed = false, aPressed = false;
	public void draw(Graphics2D win) {
		
		win.setColor(Color.WHITE);
		win.fill(bg1);

		if(wPressed&&box.getY()>0){
			dy = -speed;
		//	win.drawImage(bobw, null, (int)box.getX(), (int)box.getY());
		} else if (sPressed&&box.getY()<485) {
			dy = speed;
		//	win.drawImage(bobs, null, (int)box.getX(), (int)box.getY());
		} else {
			dy = 0;
		}
		
		if(aPressed&&box.getX()>0){
			dx = -speed;
		//	win.drawImage(boba, null, (int)box.getX(), (int)box.getY());
		} else if (dPressed&&box.getX()<710) {
			dx = speed;
		//	win.drawImage(bobd, null, (int)box.getX(), (int)box.getY());
		} else {
			dx = 0;
		}
		
		
		box.translate(dx,dy);
		win.setColor(Color.PINK);
		win.fill(box);

	}
	
	public void keyPressed(KeyEvent e){
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = true;
		}else if(e.getKeyCode() == KeyEvent.VK_S){
			sPressed = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = true;
		}else if(e.getKeyCode() == KeyEvent.VK_D){
			dPressed = true;
		}
	}
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_W) {
			wPressed = false;
		}else if(e.getKeyCode() == KeyEvent.VK_S){
			sPressed = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			aPressed = false;
		}else if(e.getKeyCode() == KeyEvent.VK_D){
			dPressed = false;
		}
		
	
	
	
	}
	/*BufferedImage bobw = null;
	BufferedImage boba = null;
	BufferedImage bobs = null;
	BufferedImage bobd = null;

	public UserComp(){
		bobw = addImage("original.jpg");
		boba = addImage("originala.jpg");
		bobs = addImage("originals.jpg");
		bobd = addImage("originald.jpg");
	}*/

}
