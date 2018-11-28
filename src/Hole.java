import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Hole extends Thing implements Serializable{
	
	public boolean state;
	ImageIcon hole = new ImageIcon("images/hole.png");
	public ImageIcon fieldimg = new ImageIcon("images/field.png");
	
	public Hole(Fields f)
	{
		this.state = true; //This attribute for hole indicates if the hole is active or not, by default it's active
		this.field = f; //sets the field
		this.field.setFree(false); 
	}
	
	public void Display(JLabel label) {
		if(this.state == true) {
		Image image = hole.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
		}
		else {
		Image image2 = fieldimg.getImage();
		Image newimg2 = image2.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg2));
		}
	}
	
	public void SetHoleState(boolean state){
		this.state = state; //sets the state of the corresponding Hole when the switch is turned ON
	//	System.out.println("SetHoleState set state to " + state);

		if (state==false)
		{	this.field.things[0]=null;
			this.field.things[1]=null;
		}
		else 
		{
			this.field.things[0]=previous;
			this.field.things[1]=previous;
		}
		}
	

	@Override
	public boolean HitByBox(Box b, Direction d) {
		if(this.state==true){ //if the state of the Hole is ON, then it kills the thing
		b.Die(); 	
		}
		return true;
	}

	@Override
	public boolean HitByWorker(Worker w, Direction d) {
		if(this.state==true)
		{ //if the state of the Hole is ON, then it kills the thing
		w.Die();
		}
		else 
		{  
			Fields f0= w.GetField();// this will return the current field
			Fields f1 = f0.GetNeighbor(d); 
			f0.Remove(w);
			f1.Accept(w);
			w.SetField(f1);
			f1.setFree(false);
		//	this.previous = w;
		}
		return true;
	}

	
	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
