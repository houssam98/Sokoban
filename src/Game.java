
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

	Map map;

	int checksum ;//to check the game ending 
	//reflects the points remaining till game end 
	//=(5*(number of DS)-5*(number of DS and Box on the field in the beginning))
	
	ArrayList<Player> players; // array to store Players
	ArrayList<DesignatedSquare> DsArray;
	ArrayList<Wall> WArray;
	ArrayList<Box>  BoxArray;
	
	public void addPlayer(Player p) {
		players.add(p);
	}

	public Game(int size) {
		this.map = new Map(size);
		DsArray=new ArrayList<DesignatedSquare>();
		players = new ArrayList<Player>();
		WArray =new ArrayList<Wall>();
		BoxArray=new ArrayList<Box>();
		
	}

	public Map getMap() {
		return map;
	}

	public void startGame() {
		JPlay JPlay = new JPlay(this);
}

	public boolean endGame()//endgame returned true if the game is supposed to end 
	{ 
		
	
		//checking if there is only one player left
		int sum=0;
		int max=0;
		
			try {
				Worker w = this.players.get(0).GetWorker();
			}catch(NullPointerException e) {
				return true;
			}
			
		for (Player p:players)
			{
		sum=sum+p.getPoints();
			}
		//getting some parameters such as which player has the max points 
		
		
		//checking if all the ds are filled with boxes because it will add points to the players
		//and if they are on top of each other in the beginning the checksum already has that part
		
		 //this is one of the end game scenarios 
		
			if (sum==this.checksum)
				{
			
System.out.println("checksum end game");
			//return here
			return true;
				}
		

		//checking for every ds if they are free or not
		//khoulouds code in a compact way 
	/*	int dsNum = DsArray.size();
		int dsBox = 0;
		for(DesignatedSquare ds: DsArray) {
		if(ds.free == false) {
			
			dsBox ++;
			
		}
		if(dsBox == dsNum) {
			
			return true;
		}
		}*/
		
		/*	try {
			System.out.println(BoxArray.size());
			}catch(NullPointerException e) {
				System.out.println("wrong");
			}
			*/
			
//Positional checking for the wall because they cannot move inside the game i will store and use their positions
//and if a box is near 2 of them like has them in 2 adjacent positions then the game will end because it is stuck
//in this case the game will end will message that none could put the boxes on the DS
//i need also the array of boxes to check if 2 adjacent positions like up right up left down right and down left are wall positions if they are the game ends
			
			
			for(Box box: BoxArray) {
				Fields right=box.GetField().GetNeighbor(Direction.RIGHT);
				Fields left=box.GetField().GetNeighbor(Direction.LEFT);
				Fields up=box.GetField().GetNeighbor(Direction.UP);
				Fields down=box.GetField().GetNeighbor(Direction.DOWN);
			
				
				
				//checking  right and up cases 
			for(Wall w :WArray) {
				if(right.getCol()==w.GetField().getCol()&&right.getRow()==w.GetField().getRow()) {
					for(Wall w1 :WArray) {
						if(up.getCol()==w1.GetField().getCol()&&up.getRow()==w1.GetField().getRow()) {
							System.out.println("game is Stuck");
							
							//return here
							return true;
						}
					}
				}}
			for(Wall w :WArray) {
				if(up.getCol()==w.GetField().getCol()&&up.getRow()==w.GetField().getRow()) {
					for(Wall w1 :WArray) {
							if(right.getCol()==w1.GetField().getCol()&&right.getRow()==w1.GetField().getRow()) {
							System.out.println("game is Stuck");
							
							//return here
							return true;
						}
					}
				}}
				//checking  left and up cases 
				
				for(Wall w :WArray) {
					if(left.getCol()==w.GetField().getCol()&&left.getRow()==w.GetField().getRow()) {
						for(Wall w1 :WArray) {
							if(up.getCol()==w1.GetField().getCol()&&up.getRow()==w1.GetField().getRow()) {
								System.out.println("game is Stuck");
								
								//return here
								return true;
							}
						}
					}}
				for(Wall w :WArray) {
					if(up.getCol()==w.GetField().getCol()&&up.getRow()==w.GetField().getRow()) {
						for(Wall w1 :WArray) {
							
								if(left.getCol()==w1.GetField().getCol()&&left.getRow()==w1.GetField().getRow()) {
								System.out.println("game is Stuck");
								
								//return here
								return true;
							}
						}
					}}
					//checking  down and right cases 
					
					for(Wall w :WArray) {
						if(right.getCol()==w.GetField().getCol()&&right.getRow()==w.GetField().getRow()) {
							for(Wall w1 :WArray) {
								if(down.getCol()==w1.GetField().getCol()&&down.getRow()==w1.GetField().getRow()) {
									
									System.out.println("game is Stuck");
									
									
									//return here
									return true;
								}
							}
						}
				
				}

					for(Wall w :WArray) {
						if(down.getCol()==w.GetField().getCol()&&down.getRow()==w.GetField().getRow()) {
					
							for(Wall w1 :WArray) {
								if(right.getCol()==w1.GetField().getCol()&&right.getRow()==w1.GetField().getRow()) {
									
									System.out.println("game is Stuck");
									
									
									//return here
									return true;
								}
							}
						}
				
				}
					//checking  down and left cases 
					for(Wall w :WArray) {
						if(left.getCol()==w.GetField().getCol()&&left.getRow()==w.GetField().getRow()) {
							for(Wall w1 :WArray) {
								if(down.getCol()==w1.GetField().getCol()&&down.getRow()==w1.GetField().getRow()) {
									System.out.println("game is Stuck");
									
									//return here
									return true;
								}
								
							}
						}
				
				}
					for(Wall w :WArray) {
						if(down.getCol()==w.GetField().getCol()&&down.getRow()==w.GetField().getRow()) {
							for(Wall w1 :WArray) {
								if(left.getCol()==w1.GetField().getCol()&&left.getRow()==w1.GetField().getRow()) {
								
									System.out.println("game is Stuck");
									
									//return here
									return true;
								}
								
							}
						}
				
				}//final checking for loop
					} 
			
			//ds loop  end here 
			return false;
	}//end game loop bracket
				
					

		
}
