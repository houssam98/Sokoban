import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Box extends Thing implements Serializable {
	
	public boolean reachedDesignated; //we use this attribute to check when to Remove points for a player, whenever this goes to false it means the Box is not on the DS anymore
	//public Thing previous; //stores the previous pusher
	public ImageIcon box = new ImageIcon("images/box2.png");

	public Box(Fields f)
	{
		this.field = f; //sets the field
		this.previous = null; //previous is null by default
		this.field.setFree(false); 
	
	}
	public void Die() {
		this.GetField().setFree(true); //field is set free
		this.GetField().Remove(this); //box removed from the field
		this.box = null;
	}

	public void Display(JLabel label) {
		if(this.box != null) {
		Image image = box.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
		}
	}
	
	@Override
	public boolean HitByBox(Box b, Direction d) {
	
		Fields f0= this.GetField();// this will return the current field
		Fields f1 = f0.GetNeighbor(d); //this will ask the current field for its neighbor along a passed direction
		boolean checkNull = f1.CheckNull();
		this.previous = b;
		if( (checkNull==true)&&(f1.getSizeOfThings()==0)) //don't need further check - 0 things
		{
			
			f0.Remove(this);
			f1.Accept(this);
			
			this.SetField(f1);
			f1.setFree(false);
			this.previous = b;
		
			return true;
		}
		else if( (checkNull==true)&&(f1.getSizeOfThings()==1)) //1 thing
		{
			Thing[] things = f1.GetThing();
			for(Thing t : things)
			{
				
				if(t!=null)
				{
					
					boolean check = t.HitByBox(b, d) ;
				
					if(check == false)
					{
						
					
						return false;
					}
				}
			}
			
			f0.Remove(this);
			f1.Accept(this);
			
			this.SetField(f1);
			f1.setFree(false);
			this.previous = b;

			return true;
		}
		else //more
		{
			
			Thing[] things = f1.GetThing();
			for(Thing t : things)
			{
				
				if(t!=null)
				{
					if(t.HitByBox(b, d) == false)
					{
						
				
						return false;
					}
				}
			}
			//if the thing on the field did not return false
			
			f0.Remove(this);
			f1.Accept(this);
			
			this.SetField(f1);
			f1.setFree(false);
			
		
			return true;
		}	
		
	}

	@Override
	public boolean HitByWorker(Worker w, Direction d) {
		
		boolean HitByTrue = true;// you don't need this
		// This is a flag to indicate if we're able to step on Things of the next field, if there's a Wall it changes to false.
		previous = w;
		Fields f1 = this.GetField();
		Fields f2 = f1.GetNeighbor(d);
		Thing things[] = f2.GetThing();
		//this.previous = w;
		boolean checkNull = f2.CheckNull();
		if(checkNull == false)
		{	
			for(Thing thing : things)
			{		
				if(thing!=null){
				
					
					boolean hitByBox = thing.HitByBox(this, d);
					if( hitByBox == false) {
						
					//	HitByTrue = false;//You don't need the flag, just return false here and finish
					
						return false;
						
					}
				}
				
		//HitByWorker will only return false when there's a Wall, and it will change the flag to false.
				
			}
			//after the for if all the things.HitByBox returned true
		
			f1.Remove(this);
			f2.Accept(this);
			
			this.SetField(f2);
			f1.setFree(false);
			this.previous = w;
		
			return true;
		}
		else if( (checkNull==true)&&(f2.getSizeOfThings()==0)){		
			
		/*		if(f1.getSizeOfThings() == 1) {
					f1.setFree(true);
				}*/
				f1.Remove(this);	
				f2.Accept(this);
				
				this.SetField(f2);	
				f2.setFree(false);
				
			//	this.previous = w;
			
				return true;
			}
		else if( (checkNull==true)&&(f2.getSizeOfThings()==1))
		{
			
			for(Thing t : things)
			{
				
				if(t!=null)
				{
					
					boolean check = t.HitByBox(this, d) ;
				
					if(check == false)
					{
						
					
						return false;
					}
				}
			}
			
			f1.Remove(this);
			f2.Accept(this);
			
			this.SetField(f2);
			f1.setFree(false);
		//	this.previous = w;
		
			return true;
		}
		else
		{
			return false ;
		}

	}}