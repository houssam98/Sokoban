import java.io.Serializable;

public class Map implements Serializable{
	
	 public Fields [][]fields;
	 public  int size ;
	 
	 public Map(int Size)
	 {
		 this.fields = new Fields[Size][Size];
		 //Fields f = new Fields(this);
		 //System.out.println(f.getFree());
		//fields[1][1] = f;
		 //System.out.println(fields[1][1].getFree());
		 
		 for(int i = 0; i< Size; i++)
		 {
		
			 for(int j = 0; j<Size; j++)
			 {
				 Fields f = new Fields(this);
				 f.setCol(j);
				 f.setRow(i);
				 fields[i][j]=f;

			}
			/* for(Fields f: fields[i])
		 	{	
				 f.setMap(this);
		 	}*/
		 }
		 this.size = Size;
	 }
	 
	/*public void setMapFields(int Size) {
		this.fields = new Fields[Size][Size];
	}*/
	
public void setMapFields(int s) {
		
		this.size=s;
		this.fields =new Fields[s][s];
		for(int i=0;i<s;i++) {
			for(int j=0;j<s;j++) {
			this.fields[i][j].setCol(j);
			this.fields[i][j].setRow(i);
			}
		}
	}
	
	public void addThing(int i, int j,Thing t)
	{
	
		fields[i][j].addThing(t);
	}
	
	///////////////////////////////
	public void setFields(int i,int j,Thing t) {
	//this.fields[i][j]=new Fields();
		this.fields[i][j].things=new Thing[2];
		this.fields[i][j].SetThing(0, t);
	
	}

    public void setSize (int size)
    {
		this.size = size;
	}
    public int getSize()
    {
    	return size;
    }

	
}
