import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Wall extends Thing implements Serializable{
	
	public ImageIcon wall = new ImageIcon("images/wall.png");

	public void Display(JLabel label) {
		Image image = wall.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
	}
	
	public Wall(Fields f)
	{
		this.field = f;
		this.field.setFree(false);
	}
	@Override
	public boolean HitByBox(Box b, Direction d) {
		Box b1 = null;
		Worker w2 = null;
		Worker w3 = null;
		try {
			try {
			if(b.previous!=null)
			w2 = (Worker) b.previous;
			if(w2.previous!=null && w2 != null)
			b1 = (Box) w2.previous;
			if(b1.previous!=null && b1!=null)
			w3 = (Worker) b1.previous;
		
		
		if(b.previous == w2) {
			if(w2.previous == b1) {
				w2.Die();
				Fields f0= b1.GetField();// this will return the current field
				Fields f1 = f0.GetNeighbor(d);
				f0.Remove(b1);
				f1.Accept(b1);
				
				b1.SetField(f1);
				f1.setFree(false);
				
				f0 = w3.GetField();// this will return the current field
				f1 = f0.GetNeighbor(d);
				f0.Remove(w3);
				f1.Accept(w3);
				
				w3.SetField(f1);
				f1.setFree(false);
			
				
			}
		}
		}catch(NullPointerException c) {
			
		}
			}catch(ClassCastException e) {
			
		}
		return false;
	}

	@Override
	public boolean HitByWorker(Worker w, Direction d) {
		Box b = null;
		Worker w1 = null;

		try {
			try {
			b = (Box) w.previous;
			w1 = (Worker) b.previous;
		
		
		if(w.previous == b) {
			if(b.previous == w1) {
				w.Die();
				Fields f0= w1.GetField();// this will return the current field
				Fields f1 = f0.GetNeighbor(d);
				f0.Remove(w1);
				f1.Accept(w1);
				
				w1.SetField(f1);
				f1.setFree(false);
				
				f0= b.GetField();// this will return the current field
				f1 = f0.GetNeighbor(d);
				f0.Remove(b);
				f1.Accept(b);
				
				b.SetField(f1);
				f1.setFree(false);
			}
		}
					}catch(NullPointerException e) {
				
			}
		}catch(ClassCastException c) {
			
		}
		return false;
	}
}
