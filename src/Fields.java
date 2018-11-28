import java.io.Serializable;

public class Fields implements Serializable{
	
	private Map map;
	private int col,row;
	private boolean free; //this free will indicate if I can put a box or a worker on the field
	//because we should handle the case when the user puts a worker and a box on the same field
	 Thing things[];
	int sizeOfThing;// how many things are there on the field
	
	public int getSizeOfThings()
	{
		return this.sizeOfThing;
	}
	public Fields(Map map)
	{
		this.map = map;
		this.things = new Thing[2];
		this.sizeOfThing = 0;
		free = true;
	
	}
	
	public void setMap(Map map)
	{
		this.map = map;
	}
	
	public boolean getFree()
	{
		return free;
	}
	
	public void setFree(boolean free)
	{
		this.free = free;
	}
	
	public void addThing(Thing t)
	{

		if(things[0]==null)
		{
			things[0]= t;
			this.sizeOfThing ++;
			t.SetField(this);
			
		}
		else
		{
			things[1]=t;
			this.sizeOfThing ++;
			t.SetField(this);
			this.free = false; //the field can not accept further Things on it
			
		}
	
	}
	
	/////////////////////////////////////////
	public void Accept(Thing t) {
		
		if(things[0]==null)
		{
			things[0]= t;
			sizeOfThing++;
		}
		else
		{
			things[1]= t;
			sizeOfThing++;
		}
		
		
	}
	
	public boolean CheckNull() {
	//field checks if it is completely empty
		return free;
	}
	
	public void Remove(Thing t) {
		//field removes thing t from its things array
		/*for(Thing a:things) {
			if(a==t) {
				a=null;
				sizeOfThing--;
			}
		}*/
		
		if(things[0]==t)
		{
			things[0]=null;
			sizeOfThing--;
		}
		else if (things[1]==t)
		{
			things[1]=null;
			sizeOfThing--;
		}
		
		
	}
	
	public void SetNeighbor(Direction d, Fields f) {
	//sets the neighbor in a given direction 
		if(d==Direction.UP) {
			 this.map.fields[row-1][col]=f;
		}else if (d==Direction.DOWN) {
			 	this.map.fields[row+1][col]=f;
		}else if (d==Direction.RIGHT) {
			 	this.map.fields[row][col+1]=f;
		}else {
			 	this.map.fields[row][col-1]=f;
		}
	//if the direction given results in an unknown index ex:[-1][1] an exception will be thrown which can be handled
	}
	
	public Fields GetNeighbor(Direction d) {
		//gets neighbor in a given direction 
		if(d==Direction.UP) {
			return this.map.fields[row-1][col];
		}else if (d==Direction.DOWN) {
			return 	this.map.fields[row+1][col];
		}else if (d==Direction.RIGHT) {;
			return 	this.map.fields[row][col+1];
		}
		else if (d==Direction.LEFT)
		{
			return this.map.fields[row][col-1];
		}
		else {
			return 	this.map.fields[1][0];
		}
		
	}
	
	public Thing[] GetThing() {
		return this.things;
	}
	
	public void SetThing(int i, Thing t) {
		this.things[i]=t;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	
	@Override
	public String toString(){
		
		return  "["+this.getRow()+ "]" + "["+this.getCol()+"]";
		
	}
}