import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DesignatedSquare extends Thing implements Serializable {
	
	boolean free; // this will indicate if the designatedsquare has a box on it or not
	public ImageIcon ds = new ImageIcon("images/designatedsquare.png");
	
	public DesignatedSquare(Fields f)
	{
		this.field = f;
		this.free = true; //initially all the designatedsquares are free
	}
	
	public void Display(JLabel label) {
		Image image = ds.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
	}
	
	public boolean getFree()
	{
		return free;
	}
	
	public void setFree(boolean free)
	{
		this.free = free;
	}
	
	public void AddPoints(Player p) {
		p.addPoints(5); //this number should be agreed on, hence will be changed later

	}
	
	//this method will return false if there is already a box on it
	//and true otherwise
	
	/*
	WE DON'T NEED THIS FUNCTION ANYLONGER; THE GETFREE() REPLACES IT 
	public boolean CheckBox(Box b) {
		
		
	}*/
	
	public void RemovePoints(Player p) {
			
			p.subtractPoints(5); //this number should be agreed on, hence will be changed later

	}
	
	
	
	
	public Box GetPusher(Box b) {
		
		Thing t = b;
		
		while(t.previous!=null)
		{
			
			t = t.previous;
		}
		
		
		Box w = (Box)t;
		
		return w;
		
	}
	
	public Box GetPusher(Worker w) {
		
		Thing t = w;
		
		while(t.previous!=null)
		{
			
			t = t.previous;
		}
		
		Box b = (Box)t;
		
		return b;
		
	}
	@Override
	public boolean HitByBox(Box b, Direction d) {
		
		if(this.free == true)
		{	
			this.free = false;
			
		try {
			Box bo = this.GetPusher(b);
			
			Worker w = (Worker)bo.previous;
			w.GetPlayer().addPoints(5);
		}catch(ClassCastException e) {
			Worker w = (Worker) b.previous;
			w.GetPlayer().addPoints(5);
		}
			this.field.setFree(false);

			return true;
		}
		// ELSE NOTHING HAPPENS; NEITHER ADDITION NOR SUBTRACTION IS DONE; THE POINTS REMAIN THE SAME
	
		return true;
	}

	@Override
	public boolean HitByWorker(Worker w, Direction d) {
	
		if(free == false)// there was a box on it 
		{
	
			free = true;// we free the designated square
			if(w.previous!=null) {
				try {
			Box bo = this.GetPusher(w);
			if(bo!=null) {
			Worker wo = (Worker)bo.previous;
			
			wo.GetPlayer().subtractPoints(5);
			}
				}catch(ClassCastException e) {
				w.GetPlayer().subtractPoints(5);
				}
			}else {
				w.GetPlayer().subtractPoints(5);
			//	System.out.println(w.previous.toString());
			}
			
			return true;
			//HERE SUBTRACTION OF POINTS SHOULD BE MADE
		}
		//w.GetPlayer().subtractPoints(5);
		//else nothing happens and we turn true because it can be stepped on by a Worker
	
		return true;
	}
}
