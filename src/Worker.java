import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Worker extends Thing implements Serializable{
	
	//public Thing previous; I did put this in the Thing class, it also should be removed from the Box class
	private Player player; // this was named worker, to eliminate ambiguity I changed it to player because
	//it does not make sense to name the player as a worker
	public ImageIcon worker = new ImageIcon("images/mario2.png");

	
	public void setPlayer(Player player) {
		
		this.player = player;
	
	}
	
	public void Display(JLabel label) {
		if(this.worker != null) {
		Image image = worker.getImage();
		Image newimg = image.getScaledInstance(53, 50, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newimg));
		}
	}

	// I NEED THIS CONSTRUCTOR FOR THE SAKE OF TESTING
	public Worker(Player p1, Fields f)
	{	
	
			this.player = p1;
		    this.previous = null;
		    this.field = f;
		    this.field.setFree(false);
	}
	
	public void move(Direction d) {
		
		previous = null;  //it has to be set to null at each call of new 
		//this will be used to trace back who was the first pusher
		Fields f0= this.GetField();// this will return the current field
		
		Fields f1 = f0.GetNeighbor(d); //this will ask the current field for its neighbor along a passed direction
		
		//check if the neighboring field is empty, if so the movement will be automatic 
		//else we have to getThing of the neighboring fields
		
		boolean checkNull = f1.CheckNull();
		if(checkNull == true)
		{
			f0.Remove(this);
			f1.Accept(this);
			f1.setFree(false);
			f0.setFree(true);
			this.SetField(f1);
			
			
		}
		else
		{
			Thing [] thingsArray = f1.GetThing();
			int sizeOfThing = f1.getSizeOfThings();
			int flag = 0; //this flag will determine if the move will be made or not
			if( sizeOfThing !=0)
			{
				
				for(Thing thing : thingsArray)
				{
					
					if(thing != null)
					{
						
					boolean HitByWorker = thing.HitByWorker(this, d);
					if(HitByWorker== false)
						
					{
						
						flag=1; //we set the flag to 1
						break;
					}
					}
				}
			}
			if((flag == 0)&(f1.getSizeOfThings()!=2)) //the move can be made
			{
				
				f0.Remove(this);
				f1.Accept(this);
				
				f1.setFree(false);
				f0.setFree(true);
				this.SetField(f1);
			}
			//else we don't change anything 
			
			
		}
	}
	
	public void Die()  {
		
		Fields f0= this.GetField();
		f0.Remove(this);
		f0.setFree(true);
		this.worker = null;
		this.player.SetWorker(null);
	}
	
	public Player GetPlayer() {
	
		return player;
	}

	@Override
	public boolean HitByBox(Box b, Direction d) {
	
		Fields f0= this.GetField();// this will return the current field
		Fields f1 = f0.GetNeighbor(d); //this will ask the current field for its neighbor along a passed direction
		previous = b;
		//check if the neighboring field is empty, if so the movement will be automatic 
		//else we have to getThing of the neighboring fields
		
		boolean checkNull = f1.CheckNull();
		if(checkNull == true)
		{
			
			f0.Remove(this);
			f1.Accept(this);
			
			f1.setFree(false);
			this.SetField(f1);
			//this.previous = b; //we set the previous attribute of the worker to b because it got pushed by it
			return true;
		}
		else
		{
			
			Thing [] thingsArray = f1.GetThing();
			int sizeOfThing = f1.getSizeOfThings();
			if( sizeOfThing !=0)
			{
				for(Thing thing : thingsArray)
				
					if(thing!=null)
					{if(thing.HitByWorker(this, d) == false)
					
						
						return false; 
					}}
				}
			
			
			  //the move can be made
			
				f0.Remove(this);
				f1.Accept(this);
				
				f1.setFree(false);
				this.SetField(f1);
				
				return true;
			//else we don't change anything 
			
			
		}
			
	

	@Override
	public boolean HitByWorker(Worker w, Direction d) {
		return false;
	}
}