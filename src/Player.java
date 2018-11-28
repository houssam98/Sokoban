import java.io.Serializable;

public class Player implements Serializable{
	
	private int points; //for security reason the visibility of the points should be private
	private Worker worker;
	int id; // I ADDED THIS FOR THE SAKE OF TESTING 
	// THIS IS FOR THE SAKE OF TESTING
	public Player(int i)
	{
		id = i;
	}
	public int getId()
	{
		return id;
	}
	
	//This method replaces the old selectWorker(Worker w)
	//As reading from the console is not the responsability of the Player but of the main 
	//the direction will be passed to this method as parameter
	//In the main asking for the direction will be in a loop
	//the loop will contain this method call after reading a valid direction
	public void moveWorker(Direction d) {

		this.worker.move(d);
	}
	
	public Worker GetWorker() {
		return worker;
	}
	
	public void SetWorker(Worker w) {
		this.worker = w;
	}

	public int getPoints()
	{
		return this.points;
	}

	public void addPoints(int addedPoints)
	{
		this.points = this.points + addedPoints;
	}
	  
	public void subtractPoints(int subtractedPoints)
	{
		this.points = this.points - subtractedPoints;
	}
}
