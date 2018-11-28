import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Switch extends Thing implements Serializable{
	
	private boolean state ;
	private Hole hole1;
	public ImageIcon switchimg = new ImageIcon("images/switch.png");
	

	public Switch(Hole hole, Fields f)
	{
		this.field = f; //sets the field
		this.hole1 = hole; //sets the corresponding Hole
		this.state = false;//switch is OFF by default
	//	this.field.setFree(false);
	}
	
	public void Display(JLabel label) {
		
		Image image = switchimg.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
	}
	
	public Hole GetHole(){
		return hole1;
	}
	
	@Override
	public boolean HitByBox(Box b, Direction d) {
		if (this.state==false)
		{this.setState(true); //the switch is turned ON
		this.hole1.SetHoleState(false); //the corresponding Hole is set to OFF, then it acts as a normal field
		this.hole1.field.sizeOfThing = 0;
		this.field.setFree(false);
		}
		return true;
	}
	@Override
	public boolean HitByWorker(Worker w, Direction d) {
		//when a switch is hit by a worker, nothing happens
		this.state = false;
		this.hole1.SetHoleState(true);
		this.hole1.field.sizeOfThing =2;
	//	this.field.setFree(true);
		return true;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
		if (state==true )
		{this.hole1.SetHoleState(false);}
		else 	
		{this.hole1.SetHoleState(true);
	//	this.hole1.field.things[1]=this.hole1.field.things[0];
		}

	}
}
