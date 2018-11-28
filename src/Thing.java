import java.io.Serializable;

import javax.swing.JLabel;

public abstract class Thing implements Serializable{
	
	protected Fields field;
	public Thing previous;
	
	public abstract boolean HitByBox(Box b, Direction d);
	
	public abstract boolean HitByWorker(Worker w, Direction d);
	
	public Fields GetField() {

		return field;
	}
	
	public void SetField(Fields f) {

		this.field = f;
	}
	
	public abstract void Display(JLabel label);
}
