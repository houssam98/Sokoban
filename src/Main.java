import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {


	public static void main(String[] args) throws IOException {
		// test();
	JMenu JMenu = new JMenu();
	JMenu.setVisible(true);
}
	public static void moveFunction(Player player,Game game)
	{ 
		String move = null; ;
		Scanner scanner = new Scanner(System.in);
		move = scanner.nextLine();
		

		switch (move) {

		case "move worker right":

			player.GetWorker().move(Direction.RIGHT);
			
			System.out.println("Move executed (right)");
			if (game.endGame()==true) 
				System.exit(1);
			break;

		case "move worker left":
			player.GetWorker().move(Direction.LEFT);
			if (game.endGame()==true) 
				System.exit(1);
			System.out.println("Move executed (left)");
			break;

		case "move worker down":
			player.GetWorker().move(Direction.DOWN);
			
			System.out.println("Move executed (down)");
			if (game.endGame()==true) 
				System.exit(1);
			break;

		case "move worker up":
			player.GetWorker().move(Direction.UP);
			System.out.println("Move executed (up)");
			if (game.endGame()==true) 
				System.exit(1);
			
			break;

		case "game state":
			GameState(game);
			break;
			
		case "exit":
			test();
			break;

	}
	}
	public static void test() {

		System.out.println("Available scenarios: \n");
		System.out.println(
				" 1- Worker Worker \n 2- Worker Box \n 3- Worker EmptySquare \n 4- Worker Switch \n 5- Worker DesignatedSquare \n 6- Worker Hole \n 7- Worker Wall\n");
		System.out.println(
				" 8- Box Worker \n 9- Box Box \n10- Box EmptySquare \n11- Box Switch \n12- Box DesignatedSquare \n13- Box Hole \n14- Box Wall \n\nComplex Scenarios: \n\n"
						+ "15- Worker Box (Switch+Box) \n16- Worker Box Worker Box Wall \n17- Worker Box Box Worker Box DesignatedSquare \n18- Worker Box Box Worker EmptySquare \n19- Worker Box Worker (Box+DesignatedSquare) EmptySquare");
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		switch (command) {
		case "load scenario 1":
			System.out.println("Scenario 1 loaded");
			String move = null;
			Game game = new Game(10);
			game.addPlayer(new Player(0));
			Worker w = new Worker(game.players.get(0), game.map.fields[1][1]);
			game.map.fields[1][1].addThing(w);
			game.players.get(0).SetWorker(w);
			game.addPlayer(new Player(1));
			Worker w2 = new Worker(game.players.get(1), game.map.fields[1][3]);
			game.map.fields[1][3].addThing(w2);
			game.players.get(1).SetWorker(w2);
			Box b0 = new Box(game.map.fields[1][2]);
			game.map.fields[1][2].addThing(b0);
			Wall w0 = new Wall(game.map.fields[1][9]);
			game.map.fields[1][9].addThing(w0);
			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game = MoveCommand(move, game);
			}
			break;

		case "load scenario 2":
			System.out.println("Scenario 2 loaded");
			Game game2 = new Game(10);
			game2.addPlayer(new Player(0));
			Worker w3 = new Worker(game2.players.get(0), game2.map.fields[1][1]);
			game2.map.fields[1][1].addThing(w3);
			game2.players.get(0).SetWorker(w3);
			Box b = new Box(game2.map.fields[1][2]);
			game2.map.fields[1][2].addThing(b);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game2 = MoveCommand(move, game2);
			}
			break;

		case "load scenario 3":
			System.out.println("Scenario 3 loaded");
			Game game3 = new Game(10);
			game3.addPlayer(new Player(0));
			Worker w4 = new Worker(game3.players.get(0), game3.map.fields[1][1]);
			game3.map.fields[1][1].addThing(w4);
			game3.players.get(0).SetWorker(w4);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game3 = MoveCommand(move, game3);
			}
			break;

		case "load scenario 4":
			System.out.println("Scenario 4 loaded");
			Game game4 = new Game(10);
			game4.addPlayer(new Player(0));
			Worker w5 = new Worker(game4.players.get(0), game4.map.fields[1][1]);
			game4.map.fields[1][1].addThing(w5);
			game4.players.get(0).SetWorker(w5);

			Hole h = new Hole(game4.map.fields[1][3]);
			game4.map.fields[1][3].addThing(h);
			game4.map.fields[1][3].addThing(h);
			Switch s = new Switch(h, game4.map.fields[1][2]);
			game4.map.fields[1][2].addThing(s);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game4 = MoveCommand(move, game4);
			}
			break;

		case "load scenario 5":
			System.out.println("Scenario 5 loaded");
			Game game5 = new Game(10);
			game5.addPlayer(new Player(0));
			Worker w6 = new Worker(game5.players.get(0), game5.map.fields[1][1]);
			game5.map.fields[1][1].addThing(w6);
			game5.players.get(0).SetWorker(w6);
			DesignatedSquare ds = new DesignatedSquare(game5.map.fields[1][2]);
			game5.map.fields[1][2].addThing(ds);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game5 = MoveCommand(move, game5);
			}
			break;

		case "load scenario 6":
			System.out.println("Scenario 6 loaded");
			Game game6 = new Game(10);
			game6.addPlayer(new Player(0));
			Worker w7 = new Worker(game6.players.get(0), game6.map.fields[1][1]);
			game6.map.fields[1][1].addThing(w7);
			game6.players.get(0).SetWorker(w7);
			Hole h2 = new Hole(game6.map.fields[1][2]);
			game6.map.fields[1][2].addThing(h2);
			game6.map.fields[1][2].addThing(h2);
			move = null;
			System.out.println("things[0]"+game6.map.fields[1][2].things[0]);
			System.out.println("things[1]"+game6.map.fields[1][2].things[1]);
		while(move != "exit") {
				move = scanner.nextLine();
				game6 = MoveCommand(move, game6);
			}
			break;
		case "load scenario 7":
			System.out.println("Scenario 7 loaded");
			Game game33 = new Game(10);
			game33.addPlayer(new Player(0));
			Worker w44 = new Worker(game33.players.get(0), game33.map.fields[1][1]);
			game33.map.fields[1][1].addThing(w44);
			game33.players.get(0).SetWorker(w44);

			Wall wa = new Wall(game33.map.fields[1][2]);
			game33.map.fields[1][2].addThing(wa);
			game33.map.fields[1][2].addThing(wa);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game33 = MoveCommand(move, game33);
			}
			break;
			

		case "load scenario 8":
			System.out.println("Scenario 8 loaded");
			Game game7 = new Game(10);

			game7.addPlayer(new Player(0));
			Worker w8 = new Worker(game7.players.get(0), game7.map.fields[1][1]);
			game7.map.fields[1][1].addThing(w8);
			game7.players.get(0).SetWorker(w8);

			Box b2 = new Box(game7.map.fields[1][2]);
			game7.map.fields[1][2].addThing(b2);

			game7.addPlayer(new Player(1));
			Worker w9 = new Worker(game7.players.get(1), game7.map.fields[1][3]);
			game7.map.fields[1][3].addThing(w9);
			game7.players.get(1).SetWorker(w9);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game7 = MoveCommand(move, game7);
			}
			break;

		case "load scenario 9":
			System.out.println("Scenario 9 loaded");
			Game game8 = new Game(10);

			game8.addPlayer(new Player(0));
			Worker w10 = new Worker(game8.players.get(0), game8.map.fields[1][1]);
			game8.map.fields[1][1].addThing(w10);
			game8.players.get(0).SetWorker(w10);

			Box b3 = new Box(game8.map.fields[1][2]);
			game8.map.fields[1][2].addThing(b3);

			Box b4 = new Box(game8.map.fields[1][3]);
			game8.map.fields[1][3].addThing(b4);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game8 = MoveCommand(move, game8);
			}
			break;

		case "load scenario 10":
			System.out.println("Scenario 10 loaded");
			Game game9 = new Game(10);
			game9.addPlayer(new Player(0));
			Worker w11 = new Worker(game9.players.get(0), game9.map.fields[1][1]);
			game9.map.fields[1][1].addThing(w11);
			game9.players.get(0).SetWorker(w11);
			System.out.println("\nWorker created");
			System.out.println("Worker: " + w11.GetField().toString());

			Box b5 = new Box(game9.map.fields[1][2]);
			game9.map.fields[1][2].addThing(b5);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game9 = MoveCommand(move, game9);
			}
			break;

		case "load scenario 11":
			System.out.println("Scenario 11 loaded");
			Game game10 = new Game(10);

			game10.addPlayer(new Player(0));
			Worker w13 = new Worker(game10.players.get(0), game10.map.fields[1][1]);
			game10.map.fields[1][1].addThing(w13);
			game10.players.get(0).SetWorker(w13);

			Box b6 = new Box(game10.map.fields[1][2]);
			game10.map.fields[1][2].addThing(b6);
			
			Box b7 = new Box(game10.map.fields[3][2]);
			game10.map.fields[3][2].addThing(b7);

			Hole h3 = new Hole(game10.map.fields[2][2]);
			game10.map.fields[2][2].addThing(h3);
			game10.map.fields[2][2].addThing(h3);
			Switch s3 = new Switch(h3, game10.map.fields[1][3]);
			game10.map.fields[1][3].addThing(s3);
			move = null;
			System.out.println(game10.map.fields[2][2].things[0]);
			System.out.println(game10.map.fields[2][2].things[1]);
			while (move != "exit") {
				move = scanner.nextLine();
				game10 = MoveCommand(move, game10);
			}
			break;
		case "load scenario 12":
			System.out.println("Scenario 12 loaded");
			Game game13 = new Game(10);
			game13.addPlayer(new Player(0));
			Worker w15 = new Worker(game13.players.get(0), game13.map.fields[1][1]);
			game13.map.fields[1][1].addThing(w15);
			game13.players.get(0).SetWorker(w15);
			Box b13 = new Box(game13.map.fields[1][2]);
			game13.map.fields[1][2].addThing(b13);
			DesignatedSquare ds13 = new DesignatedSquare(game13.map.fields[1][3]);
			game13.map.fields[1][3].addThing(ds13);
			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game13 = MoveCommand(move, game13);

			}
			break;

		case "load scenario 13":
			System.out.println("Scenario 13 loaded");
			Game game12 = new Game(10);
			game12.addPlayer(new Player(0));
			Worker w12 = new Worker(game12.players.get(0), game12.map.fields[1][1]);
			game12.map.fields[1][1].addThing(w12);
			game12.players.get(0).SetWorker(w12);
			Box b12 = new Box(game12.map.fields[1][2]);
			game12.map.fields[1][2].addThing(b12);
			Hole h12 = new Hole(game12.map.fields[1][3]);
			game12.map.fields[1][3].addThing(h12);
			game12.map.fields[1][3].addThing(h12);
			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game12 = MoveCommand(move, game12);
			}
			break;

		case "load scenario 14":
			System.out.println("Scenario 14 loaded");
			Game game334 = new Game(10);
			game334.addPlayer(new Player(0));

			Worker w444 = new Worker(game334.players.get(0), game334.map.fields[1][1]);
			game334.map.fields[1][1].addThing(w444);
			game334.players.get(0).SetWorker(w444);

			Box b122 = new Box(game334.map.fields[1][2]);
			game334.map.fields[1][2].addThing(b122);

			Wall wa2 = new Wall(game334.map.fields[1][3]);
			game334.map.fields[1][3].addThing(wa2);
			game334.map.fields[1][3].addThing(wa2);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game334 = MoveCommand(move, game334);
			}
			break;

		case "load scenario 15":
			System.out.println("Scenario 15 loaded");
			Game game15 = new Game(10);
			game15.addPlayer(new Player(0));
			Worker w151 = new Worker(game15.players.get(0), game15.map.fields[1][1]);
			game15.map.fields[1][1].addThing(w151);
			game15.players.get(0).SetWorker(w151);

			Box b151 = new Box(game15.map.fields[1][2]);
			game15.map.fields[1][2].addThing(b151);

			Hole h151 = new Hole(game15.map.fields[2][2]);
			game15.map.fields[2][2].addThing(h151);
			Switch s151 = new Switch(h151, game15.map.fields[1][3]);
			game15.map.fields[1][3].addThing(s151);

			Box b152 = new Box(game15.map.fields[1][3]);
			game15.map.fields[1][3].addThing(b152);

			s151.setState(true);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game15 = MoveCommand(move, game15);
			}
			break;

		case "load scenario 16":
			System.out.println("Scenario 16 loaded");
			Game game16 = new Game(10);
			// Worker on Field [1][1]
			game16.addPlayer(new Player(0));
			Worker w161 = new Worker(game16.players.get(0), game16.map.fields[1][1]);
			game16.map.fields[1][1].addThing(w161);
			game16.players.get(0).SetWorker(w161);

			Box b15 = new Box(game16.map.fields[1][2]);
			game16.map.fields[1][2].addThing(b15);

			game16.addPlayer(new Player(1));
			Worker w162 = new Worker(game16.players.get(0), game16.map.fields[1][3]);
			game16.map.fields[1][3].addThing(w162);
			game16.players.get(1).SetWorker(w162);

			Box b16 = new Box(game16.map.fields[1][4]);
			game16.map.fields[1][4].addThing(b16);

			Wall wa1 = new Wall(game16.map.fields[1][5]);
			game16.map.fields[1][5].addThing(wa1);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game16 = MoveCommand(move, game16);
			}
			break;

		case "load scenario 17":

			System.out.println("Scenario 17 loaded");
			// Worker Box Box Worker Box DesignatedSquare
			Game game17 = new Game(10);
			// Worker on Field [1][1]
			game17.addPlayer(new Player(0));
			Worker w171 = new Worker(game17.players.get(0), game17.map.fields[1][1]);
			game17.map.fields[1][1].addThing(w171);
			game17.players.get(0).SetWorker(w171);
			// Box on Field [1][2]
			Box b171 = new Box(game17.map.fields[1][2]);
			game17.map.fields[1][2].addThing(b171);
			// Box on Field [1][3]
			Box b172 = new Box(game17.map.fields[1][3]);
			game17.map.fields[1][3].addThing(b172);
			// Worker on Field [1][4]
			game17.addPlayer(new Player(1));
			Worker w172 = new Worker(game17.players.get(0), game17.map.fields[1][4]);
			game17.map.fields[1][4].addThing(w172);
			game17.players.get(1).SetWorker(w172);
			// Box on Field [1][5]
			Box b173 = new Box(game17.map.fields[1][5]);
			game17.map.fields[1][5].addThing(b173);
			// DS on Field [1][6]
			DesignatedSquare ds1 = new DesignatedSquare(game17.map.fields[1][6]);
			game17.map.fields[1][6].addThing(ds1);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game17 = MoveCommand(move, game17);
			}
			break;

		case "load scenario 18":
			System.out.println("Scenario 18 loaded");
			Game game18 = new Game(10);

			game18.addPlayer(new Player(0));
			Worker w18 = new Worker(game18.players.get(0), game18.map.fields[1][1]);
			game18.map.fields[1][1].addThing(w18);
			game18.players.get(0).SetWorker(w18);

			Box b181 = new Box(game18.map.fields[1][2]);
			game18.map.fields[1][2].addThing(b181);

			Box b182 = new Box(game18.map.fields[1][3]);
			game18.map.fields[1][3].addThing(b182);

			game18.addPlayer(new Player(1));
			Worker w182 = new Worker(game18.players.get(1), game18.map.fields[1][4]);
			game18.map.fields[1][4].addThing(w182);
			game18.players.get(1).SetWorker(w182);
			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game18 = MoveCommand(move, game18);
			}
			break;

		case "load scenario 19":
			System.out.println("Scenario 19 loaded");
			Game game19 = new Game(10);

			game19.addPlayer(new Player(0));
			Worker w19 = new Worker(game19.players.get(0), game19.map.fields[1][1]);
			game19.map.fields[1][1].addThing(w19);
			game19.players.get(0).SetWorker(w19);

			Box b19 = new Box(game19.map.fields[1][2]);
			game19.map.fields[1][2].addThing(b19);

			game19.addPlayer(new Player(1));
			Worker w191 = new Worker(game19.players.get(1), game19.map.fields[1][3]);
			game19.map.fields[1][3].addThing(w191);
			game19.players.get(1).SetWorker(w191);

			Box b191 = new Box(game19.map.fields[1][4]);
			game19.map.fields[1][4].addThing(b191);

			DesignatedSquare ds19 = new DesignatedSquare(game19.map.fields[1][4]);
			game19.map.fields[1][4].addThing(ds19);
			ds19.setFree(false);

			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game19 = MoveCommand(move, game19);
			}
			break;

		case "load game":
			Game gameLoad = LoadGame();
			move = null;
			while (move != "exit") {
				move = scanner.nextLine();
				game19 = MoveCommand(move, gameLoad);
			}
			break;
		case "exit":

			break;
		}
	}

	public static void GameState(Game g) {
		Thing[] testers;
		System.out.println("Game size " + g.map.getSize());
		for (int i = 0; i < g.map.getSize(); i++) {
			for (int j = 0; j < g.map.getSize(); j++) {
				testers = g.map.fields[i][j].things;
				for (Thing thing : testers) {
					if (thing != null) {
						if(thing.getClass().toString().equals("class Wall")) {
							
						}
						else
						System.out.println(thing.getClass() + " " + thing.GetField().toString());
					}
				}
			}
		}
		for (int i = 0; i < g.players.size(); i++)
			System.out.println("Player " + i + " points: " + g.players.get(i).getPoints());
		// else System.out.println("empty");
		// we can use it in case we want to show the empty squares when things
		// on our fileds are null
	}

	public static Game MoveCommand(String direction, Game game) {

		switch (direction) {

		case "move worker right":

			game.players.get(0).GetWorker().move(Direction.RIGHT);
			System.out.println("Move executed (right)");
			break;

		case "move worker left":
			game.players.get(0).GetWorker().move(Direction.LEFT);
			System.out.println("Move executed (left)");
			break;

		case "move worker down":
			game.players.get(0).GetWorker().move(Direction.DOWN);
			System.out.println("Move executed (down)");
			break;

		case "move worker up":
			game.players.get(0).GetWorker().move(Direction.UP);
			System.out.println("Move executed (up)");
			break;

		case "move worker1 right":

			game.players.get(1).GetWorker().move(Direction.RIGHT);
			System.out.println("Move executed (right)");
			break;

		case "move worker1 left":
			game.players.get(1).GetWorker().move(Direction.LEFT);
			System.out.println("Move executed (left)");
			break;

		case "move worker1 down":
			game.players.get(1).GetWorker().move(Direction.DOWN);
			System.out.println("Move executed (down)");
			break;

		case "move worker1 up":
			game.players.get(1).GetWorker().move(Direction.UP);
			System.out.println("Move executed (up)");
			break;
			
		case "game state":
			GameState(game);
			break;

		case "save game":
			SaveGame(game);
			System.out.println("Game saved");
			break;

		case "load game":
			game = LoadGame();
			System.out.println("Game loaded");

			break;

		case "exit":
			test();
			break;
		}
		return game;
	}

	public static void SaveGame(Game g) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.ser"));
			oos.writeObject(g);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.print(e);
		}
	}

	// loads a game from the save.ser file in the source directory
	// save.ser is named due to a java convention
	public static Game LoadGame() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.ser"));
			Game game1 = (Game) ois.readObject(); // reading saved object
			ois.close();
			return game1;

		} catch (Exception e) {

			System.out.print(e);
			return null;
		}

	}

	public static void LoadScenarios(String s) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(s));

		try {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			if (in != null) {
				in.close();
			}

		}
	}
	

}
