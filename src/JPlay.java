import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class JPlay extends JFrame {

	private JPanel contentPane;
	Game game;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JLabel lblNewLabel_9;
	JLabel lblNewLabel_10;
	JLabel lblNewLabel_11;
	JLabel lblNewLabel_12;
	JLabel lblNewLabel_13;
	JLabel lblNewLabel_14;
	JLabel lblNewLabel_15;
	JLabel lblNewLabel_16;
	JLabel lblNewLabel_17;
	JLabel lblNewLabel_18;
	JLabel lblNewLabel_19;
	JLabel lblNewLabel_20;
	JLabel lblNewLabel_21;
	JLabel lblNewLabel_22;
	JLabel lblNewLabel_23;
	JLabel lblNewLabel_24;
	JLabel lblNewLabel_25;
	JLabel lblNewLabel_26;
	JLabel lblNewLabel_27;
	JLabel lblNewLabel_28;
	JLabel lblNewLabel_29;
	JLabel lblNewLabel_30;
	JLabel lblNewLabel_31;
	JLabel lblNewLabel_32;
	JLabel lblNewLabel_33;
	JLabel lblNewLabel_34;
	JLabel lblNewLabel_35;
	JLabel lblNewLabel_36;
	JLabel lblNewLabel_37;
	JLabel lblNewLabel_38;
	JLabel lblNewLabel_39;
	JLabel lblNewLabel_40;
	JLabel lblNewLabel_41;
	JLabel lblNewLabel_42;
	JLabel lblNewLabel_43;
	JLabel lblNewLabel_44;
	JLabel lblNewLabel_45;
	JLabel lblNewLabel_46;
	JLabel lblNewLabel_47;
	JLabel lblNewLabel_48;
	JLabel lblNewLabel_49;
	JLabel lblNewLabel_50;
	JLabel lblNewLabel_51;
	JLabel lblNewLabel_52;
	JLabel lblNewLabel_53;
	JLabel lblNewLabel_54;
	JLabel lblNewLabel_55;
	JLabel lblNewLabel_56;
	JLabel lblNewLabel_57;
	JLabel lblNewLabel_58;
	JLabel lblNewLabel_59;
	JLabel lblNewLabel_60;
	JLabel lblNewLabel_61;
	JLabel lblNewLabel_62;
	JLabel lblNewLabel_63;
	JLabel lblNewLabel_64;
	JLabel lblNewLabel_65;
	JLabel lblNewLabel_66;
	JLabel lblNewLabel_67;
	JLabel lblNewLabel_68;
	JLabel lblNewLabel_69;
	JLabel lblNewLabel_70;
	JLabel lblNewLabel_71;
	JLabel lblNewLabel_72;
	JLabel lblNewLabel_73;
	JLabel lblNewLabel_74;
	JLabel lblNewLabel_75;
	JLabel lblNewLabel_76;
	JLabel lblNewLabel_77;
	JLabel lblNewLabel_78;
	JLabel lblNewLabel_79;
	JLabel lblNewLabel_80;
	JLabel lblNewLabel_81;
	JLabel lblNewLabel_82;
	JLabel lblNewLabel_83;
	JLabel lblNewLabel_84;
	JLabel lblNewLabel_85;
	JLabel lblNewLabel_86;
	JLabel lblNewLabel_87;
	JLabel lblNewLabel_88;
	JLabel lblNewLabel_89;
	JLabel lblNewLabel_90;
	JLabel lblNewLabel_91;
	JLabel lblNewLabel_92;
	JLabel lblNewLabel_93;
	JLabel lblNewLabel_94;
	JLabel lblNewLabel_95;
	JLabel lblNewLabel_96;
	JLabel lblNewLabel_97;
	JLabel lblNewLabel_98;
	JLabel lblNewLabel_99;
	JLabel label;
	JLabel label_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//JPlay frame = new JPlay(game);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JPlay(Game game) {
		Player player = game.players.get(0);
		System.out.println(player.id);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 int keyCode = e.getKeyCode();
				    switch( keyCode ) { 
				    
			        case KeyEvent.VK_UP:
			        	if(game.players.get(0)!=null)
			            game.players.get(0).GetWorker().move(Direction.UP);
			            Clear();
			            getThings();
			            if(game.endGame()==true) {
			            	JOptionPane.showMessageDialog(null, "Game Over");
			            	setVisible(false);	
			            }
			            break;
			        case KeyEvent.VK_DOWN:
			        	if(game.players.get(0)!=null)
			        	 game.players.get(0).GetWorker().move(Direction.DOWN);
			        	 Clear();
			        	 getThings();
			        	 if(game.endGame()==true) {
				            	JOptionPane.showMessageDialog(null, "Game Over");
				            	setVisible(false);			            }
			            break;
			        case KeyEvent.VK_LEFT:
			        	if(game.players.get(0)!=null)
			        	 game.players.get(0).GetWorker().move(Direction.LEFT);
			        	 Clear();
			        	 getThings(); 
			        	 if(game.endGame()==true) {
				            	JOptionPane.showMessageDialog(null, "Game Over");
				            	setVisible(false);
				            }
			            break;
			        case KeyEvent.VK_RIGHT:
			        	if(game.players.get(0)!=null)
			        	game.players.get(0).GetWorker().move(Direction.RIGHT);
			        	 Clear();
			        	 getThings(); 
			        	 if(game.endGame()==true) {
				            	JOptionPane.showMessageDialog(null, "Game Over");
				            	setVisible(false);
				            }
			        	 break;
	        case KeyEvent.VK_W:
				        	if(game.players.get(1)!=null)
				            game.players.get(1).GetWorker().move(Direction.UP);
				            Clear();
				            getThings();
				            if(game.endGame()==true) {
				            	JOptionPane.showMessageDialog(null, "Game Over");
				            	setVisible(false);	
				            }
				            break;
				        case KeyEvent.VK_S:
				        	if(game.players.get(1)!=null)
				        	 game.players.get(1).GetWorker().move(Direction.DOWN);
				        	 Clear();
				        	 getThings();
				        	 if(game.endGame()==true) {
					            	JOptionPane.showMessageDialog(null, "Game Over");
					            	setVisible(false);			            }
				            break;
				        case KeyEvent.VK_A:
				        	if(game.players.get(1)!=null)
				        	 game.players.get(1).GetWorker().move(Direction.LEFT);
				        	 Clear();
				        	 getThings(); 
				        	 if(game.endGame()==true) {
					            	JOptionPane.showMessageDialog(null, "Game Over");
					            	setVisible(false);
					            }
				            break;
				        case KeyEvent.VK_D :
				        	if(game.players.get(1)!=null)
				        	game.players.get(1).GetWorker().move(Direction.RIGHT);
				        	 Clear();
				        	 getThings(); 
				        	 if(game.endGame()==true) {
					            	JOptionPane.showMessageDialog(null, "Game Over");
					            	setVisible(false);
					            }
				        	 break;
				     }
			}
		});
		
		this.game = game;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ImageIcon fieldImg = new ImageIcon("images/field.png");
		Image fieldImage = fieldImg.getImage();
		Image newFieldImg = fieldImage.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 67, 574, 566);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 10, 0, 0));
		
		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(newFieldImg));
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		
		panel_1.add(lblNewLabel_1);
lblNewLabel_2 = new JLabel();
		
		panel_1.add(lblNewLabel_2);
lblNewLabel_3 = new JLabel();
		
		panel_1.add(lblNewLabel_3);
lblNewLabel_4 = new JLabel();
		
		panel_1.add(lblNewLabel_4);
lblNewLabel_5 = new JLabel();
		
		panel_1.add(lblNewLabel_5);
lblNewLabel_6 = new JLabel();
		
		panel_1.add(lblNewLabel_6);
lblNewLabel_7 = new JLabel();
		
		panel_1.add(lblNewLabel_7);
lblNewLabel_8 = new JLabel();
		
		panel_1.add(lblNewLabel_8);
lblNewLabel_9 = new JLabel();
		
		panel_1.add(lblNewLabel_9);
lblNewLabel_10 = new JLabel();
		
		panel_1.add(lblNewLabel_10);
lblNewLabel_11 = new JLabel();
		
		panel_1.add(lblNewLabel_11);
lblNewLabel_12 = new JLabel();
		
		panel_1.add(lblNewLabel_12);
lblNewLabel_13 = new JLabel();
		
		panel_1.add(lblNewLabel_13);
lblNewLabel_14 = new JLabel();
		
		panel_1.add(lblNewLabel_14);
lblNewLabel_15 = new JLabel();
		
		panel_1.add(lblNewLabel_15);
lblNewLabel_16 = new JLabel();
		
		panel_1.add(lblNewLabel_16);
lblNewLabel_17 = new JLabel();
		
		panel_1.add(lblNewLabel_17);
lblNewLabel_18 = new JLabel();
		
		panel_1.add(lblNewLabel_18);
lblNewLabel_19 = new JLabel();
		
		panel_1.add(lblNewLabel_19);
lblNewLabel_20 = new JLabel();
		
		panel_1.add(lblNewLabel_20);
lblNewLabel_21 = new JLabel();
		
		panel_1.add(lblNewLabel_21);
lblNewLabel_22 = new JLabel();
		
		panel_1.add(lblNewLabel_22);
lblNewLabel_23 = new JLabel();
		
		panel_1.add(lblNewLabel_23);
lblNewLabel_24 = new JLabel();
		
		panel_1.add(lblNewLabel_24);
lblNewLabel_25 = new JLabel();
		
		panel_1.add(lblNewLabel_25);
lblNewLabel_26 = new JLabel();
		
		panel_1.add(lblNewLabel_26);
lblNewLabel_27 = new JLabel();
		
		panel_1.add(lblNewLabel_27);
lblNewLabel_28 = new JLabel();
		
		panel_1.add(lblNewLabel_28);
lblNewLabel_29 = new JLabel();
		
		panel_1.add(lblNewLabel_29);
lblNewLabel_30 = new JLabel();
		
		panel_1.add(lblNewLabel_30);
lblNewLabel_31 = new JLabel();
		
		panel_1.add(lblNewLabel_31);
lblNewLabel_32 = new JLabel();
		
		panel_1.add(lblNewLabel_32);
lblNewLabel_33 = new JLabel();
		
		panel_1.add(lblNewLabel_33);
lblNewLabel_34 = new JLabel();
		
		panel_1.add(lblNewLabel_34);
lblNewLabel_35 = new JLabel();
		
		panel_1.add(lblNewLabel_35);
lblNewLabel_36 = new JLabel();
		
		panel_1.add(lblNewLabel_36);
lblNewLabel_37 = new JLabel();
		
		panel_1.add(lblNewLabel_37);
lblNewLabel_38 = new JLabel();
		
		panel_1.add(lblNewLabel_38);
lblNewLabel_39 = new JLabel();
		
		panel_1.add(lblNewLabel_39);
lblNewLabel_40 = new JLabel();
		
		panel_1.add(lblNewLabel_40);
lblNewLabel_41 = new JLabel();
		
		panel_1.add(lblNewLabel_41);
lblNewLabel_42 = new JLabel();
		
		panel_1.add(lblNewLabel_42);
lblNewLabel_43 = new JLabel();
		
		panel_1.add(lblNewLabel_43);
lblNewLabel_44 = new JLabel();
		
		panel_1.add(lblNewLabel_44);
lblNewLabel_45 = new JLabel();
		
		panel_1.add(lblNewLabel_45);
lblNewLabel_46 = new JLabel();
		
		panel_1.add(lblNewLabel_46);
lblNewLabel_47 = new JLabel();
		
		panel_1.add(lblNewLabel_47);
lblNewLabel_48 = new JLabel();
		
		panel_1.add(lblNewLabel_48);
lblNewLabel_49 = new JLabel();
		
		panel_1.add(lblNewLabel_49);
lblNewLabel_50 = new JLabel();
		
		panel_1.add(lblNewLabel_50);
lblNewLabel_51 = new JLabel();
		
		panel_1.add(lblNewLabel_51);
lblNewLabel_52 = new JLabel();
		
		panel_1.add(lblNewLabel_52);
lblNewLabel_53 = new JLabel();
		
		panel_1.add(lblNewLabel_53);
lblNewLabel_54 = new JLabel();
		
		panel_1.add(lblNewLabel_54);
lblNewLabel_55 = new JLabel();
		
		panel_1.add(lblNewLabel_55);
lblNewLabel_56 = new JLabel();
		
		panel_1.add(lblNewLabel_56);
lblNewLabel_57 = new JLabel();
		
		panel_1.add(lblNewLabel_57);
lblNewLabel_58 = new JLabel();
		
		panel_1.add(lblNewLabel_58);
lblNewLabel_59 = new JLabel();
		
		panel_1.add(lblNewLabel_59);
lblNewLabel_60 = new JLabel();
		
		panel_1.add(lblNewLabel_60);
lblNewLabel_61 = new JLabel();
		
		panel_1.add(lblNewLabel_61);
lblNewLabel_62 = new JLabel();
		
		panel_1.add(lblNewLabel_62);
lblNewLabel_63 = new JLabel();
		
		panel_1.add(lblNewLabel_63);
lblNewLabel_64 = new JLabel();
		
		panel_1.add(lblNewLabel_64);
lblNewLabel_65 = new JLabel();
		
		panel_1.add(lblNewLabel_65);
lblNewLabel_66 = new JLabel();
		
		panel_1.add(lblNewLabel_66);
lblNewLabel_67 = new JLabel();
		
		panel_1.add(lblNewLabel_67);
lblNewLabel_68 = new JLabel();
		
		panel_1.add(lblNewLabel_68);
lblNewLabel_69 = new JLabel();
		
		panel_1.add(lblNewLabel_69);
lblNewLabel_70 = new JLabel();
		
		panel_1.add(lblNewLabel_70);
lblNewLabel_71 = new JLabel();
		
		panel_1.add(lblNewLabel_71);
lblNewLabel_72 = new JLabel();
		
		panel_1.add(lblNewLabel_72);
lblNewLabel_73 = new JLabel();
		
		panel_1.add(lblNewLabel_73);
lblNewLabel_74 = new JLabel();
		
		panel_1.add(lblNewLabel_74);
lblNewLabel_75 = new JLabel();
		
		panel_1.add(lblNewLabel_75);
lblNewLabel_76 = new JLabel();
		
		panel_1.add(lblNewLabel_76);
lblNewLabel_77 = new JLabel();
		
		panel_1.add(lblNewLabel_77);
lblNewLabel_78 = new JLabel();
		
		panel_1.add(lblNewLabel_78);
lblNewLabel_79 = new JLabel();
		
		panel_1.add(lblNewLabel_79);
lblNewLabel_80 = new JLabel();
		
		panel_1.add(lblNewLabel_80);
lblNewLabel_81 = new JLabel();
		
		panel_1.add(lblNewLabel_81);
lblNewLabel_82 = new JLabel();
		
		panel_1.add(lblNewLabel_82);
lblNewLabel_83 = new JLabel();
		
		panel_1.add(lblNewLabel_83);
lblNewLabel_84 = new JLabel();
		
		panel_1.add(lblNewLabel_84);
lblNewLabel_85 = new JLabel();
		
		panel_1.add(lblNewLabel_85);
lblNewLabel_86 = new JLabel();
		
		panel_1.add(lblNewLabel_86);
lblNewLabel_87 = new JLabel();
		
		panel_1.add(lblNewLabel_87);
lblNewLabel_88 = new JLabel();
		
		panel_1.add(lblNewLabel_88);
lblNewLabel_89 = new JLabel();
		
		panel_1.add(lblNewLabel_89);
lblNewLabel_90 = new JLabel();
		
		panel_1.add(lblNewLabel_90);
lblNewLabel_91 = new JLabel();
		
		panel_1.add(lblNewLabel_91);
lblNewLabel_92 = new JLabel();
		
		panel_1.add(lblNewLabel_92);
lblNewLabel_93 = new JLabel();
		
		panel_1.add(lblNewLabel_93);
lblNewLabel_94 = new JLabel();
		
		panel_1.add(lblNewLabel_94);
lblNewLabel_95 = new JLabel();
		
		panel_1.add(lblNewLabel_95);
lblNewLabel_96 = new JLabel();
	
		panel_1.add(lblNewLabel_96);
lblNewLabel_97 = new JLabel();

		panel_1.add(lblNewLabel_97);
lblNewLabel_98 = new JLabel();
	
		panel_1.add(lblNewLabel_98);
lblNewLabel_99 = new JLabel();
		panel_1.add(lblNewLabel_99);
		
		lblNewLabel.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_1.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_2.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_3.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_4.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_5.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_6.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_7.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_8.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_9.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_10.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_11.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_12.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_13.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_14.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_15.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_16.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_17.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_18.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_19.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_20.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_21.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_22.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_23.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_24.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_25.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_26.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_27.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_28.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_29.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_30.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_31.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_32.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_33.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_34.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_35.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_36.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_37.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_38.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_39.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_40.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_41.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_42.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_43.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_44.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_45.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_46.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_47.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_48.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_49.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_50.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_51.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_52.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_53.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_54.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_55.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_56.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_57.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_58.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_59.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_60.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_61.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_62.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_63.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_64.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_65.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_66.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_67.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_68.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_69.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_70.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_71.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_72.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_73.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_74.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_75.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_76.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_77.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_78.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_79.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_80.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_81.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_82.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_83.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_84.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_85.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_86.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_87.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_88.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_89.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_90.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_91.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_92.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_93.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_94.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_95.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_96.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_97.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_98.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_99.setIcon(new ImageIcon(newFieldImg));
		
		label = new JLabel("Player 1: " + game.players.get(0).getPoints() + " points");
		label.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		label.setBounds(78, 11, 164, 37);
		contentPane.add(label);
		
		if(game.players.size()==2) {
		label_1 = new JLabel("Player 2: "+ game.players.get(1).getPoints() + " points");
		label_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		label_1.setBounds(437, 24, 164, 37);
		contentPane.add(label_1);
		}
		
		
		getThings();
	}
	
	public void getThings() {
		label.setText("Player 1: " + game.players.get(0).getPoints() + " points");
		if(game.players.size()==2)
		label_1.setText("Player 2: "+ game.players.get(1).getPoints() + " points");
		for(int i=0; i<game.map.fields.length; i++) {
			for(int j=0; j<game.map.fields.length; j++) {
				Thing things[] = game.map.fields[i][j].GetThing();
				for(Thing thing : things) {
					if(thing!=null) {
						
						//label_1 = new JLabel("Player 2: "+ game.players.get(1).getPoints() + " points");
if(thing.field.getRow() == 0 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel);
if(thing.field.getRow() == 0 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_1);
if(thing.field.getRow() == 0 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_2);
if(thing.field.getRow() == 0 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_3);
if(thing.field.getRow() == 0 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_4);
if(thing.field.getRow() == 0 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_5);
if(thing.field.getRow() == 0 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_6);
if(thing.field.getRow() == 0 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_7);
if(thing.field.getRow() == 0 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_8);
if(thing.field.getRow() == 0 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_9);
if(thing.field.getRow() == 1 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_10);
if(thing.field.getRow() == 1 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_11);
if(thing.field.getRow() == 1 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_12);
if(thing.field.getRow() == 1 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_13);
if(thing.field.getRow() == 1 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_14);
if(thing.field.getRow() == 1 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_15);
if(thing.field.getRow() == 1 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_16);
if(thing.field.getRow() == 1 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_17);
if(thing.field.getRow() == 1 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_18);
if(thing.field.getRow() == 1 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_19);
if(thing.field.getRow() == 2 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_20);
if(thing.field.getRow() == 2 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_21);
if(thing.field.getRow() == 2 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_22);
if(thing.field.getRow() == 2 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_23);
if(thing.field.getRow() == 2 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_24);
if(thing.field.getRow() == 2 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_25);
if(thing.field.getRow() == 2 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_26);
if(thing.field.getRow() == 2 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_27);
if(thing.field.getRow() == 2 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_28);
if(thing.field.getRow() == 2 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_29);
if(thing.field.getRow() == 3 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_30);
if(thing.field.getRow() == 3 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_31);
if(thing.field.getRow() == 3 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_32);
if(thing.field.getRow() == 3 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_33);
if(thing.field.getRow() == 3 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_34);
if(thing.field.getRow() == 3 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_35);
if(thing.field.getRow() == 3 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_36);
if(thing.field.getRow() == 3 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_37);
if(thing.field.getRow() == 3 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_38);
if(thing.field.getRow() == 3 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_39);
if(thing.field.getRow() == 4 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_40);
if(thing.field.getRow() == 4 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_41);
if(thing.field.getRow() == 4 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_42);
if(thing.field.getRow() == 4 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_43);
if(thing.field.getRow() == 4 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_44);
if(thing.field.getRow() == 4 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_45);
if(thing.field.getRow() == 4 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_46);
if(thing.field.getRow() == 4 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_47);
if(thing.field.getRow() == 4 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_48);
if(thing.field.getRow() == 4 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_49);
if(thing.field.getRow() == 5 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_50);
if(thing.field.getRow() == 5 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_51);
if(thing.field.getRow() == 5 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_52);
if(thing.field.getRow() == 5 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_53);
if(thing.field.getRow() == 5 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_54);
if(thing.field.getRow() == 5 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_55);
if(thing.field.getRow() == 5 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_56);
if(thing.field.getRow() == 5 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_57);
if(thing.field.getRow() == 5 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_58);
if(thing.field.getRow() == 5 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_59);
if(thing.field.getRow() == 6 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_60);
if(thing.field.getRow() == 6 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_61);
if(thing.field.getRow() == 6 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_62);
if(thing.field.getRow() == 6 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_63);
if(thing.field.getRow() == 6 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_64);
if(thing.field.getRow() == 6 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_65);
if(thing.field.getRow() == 6 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_66);
if(thing.field.getRow() == 6 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_67);
if(thing.field.getRow() == 6 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_68);
if(thing.field.getRow() == 6 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_69);
if(thing.field.getRow() == 7 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_70);
if(thing.field.getRow() == 7 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_71);
if(thing.field.getRow() == 7 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_72);
if(thing.field.getRow() == 7 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_73);
if(thing.field.getRow() == 7 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_74);
if(thing.field.getRow() == 7 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_75);
if(thing.field.getRow() == 7 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_76);
if(thing.field.getRow() == 7 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_77);
if(thing.field.getRow() == 7 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_78);
if(thing.field.getRow() == 7 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_79);
if(thing.field.getRow() == 8 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_80);
if(thing.field.getRow() == 8 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_81);
if(thing.field.getRow() == 8 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_82);
if(thing.field.getRow() == 8 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_83);
if(thing.field.getRow() == 8 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_84);
if(thing.field.getRow() == 8 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_85);
if(thing.field.getRow() == 8 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_86);
if(thing.field.getRow() == 8 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_87);
if(thing.field.getRow() == 8 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_88);
if(thing.field.getRow() == 8 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_89);
if(thing.field.getRow() == 9 && thing.field.getCol() == 0)
							thing.Display(lblNewLabel_90);
if(thing.field.getRow() == 9 && thing.field.getCol() == 1)
							thing.Display(lblNewLabel_91);
if(thing.field.getRow() == 9 && thing.field.getCol() == 2)
							thing.Display(lblNewLabel_92);
if(thing.field.getRow() == 9 && thing.field.getCol() == 3)
							thing.Display(lblNewLabel_93);
if(thing.field.getRow() == 9 && thing.field.getCol() == 4)
							thing.Display(lblNewLabel_94);
if(thing.field.getRow() == 9 && thing.field.getCol() == 5)
							thing.Display(lblNewLabel_95);
if(thing.field.getRow() == 9 && thing.field.getCol() == 6)
							thing.Display(lblNewLabel_96);
if(thing.field.getRow() == 9 && thing.field.getCol() == 7)
							thing.Display(lblNewLabel_97);
if(thing.field.getRow() == 9 && thing.field.getCol() == 8)
							thing.Display(lblNewLabel_98);
if(thing.field.getRow() == 9 && thing.field.getCol() == 9)
							thing.Display(lblNewLabel_99);


					}
				}
			}
		}
		
	}
		
	
	public void Clear() {
		ImageIcon fieldImg = new ImageIcon("images/field.png");
		Image fieldImage = fieldImg.getImage();
		Image newFieldImg = fieldImage.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
		label.setText("Player 1: " + game.players.get(0).getPoints() + " points");
		if(game.players.size()==2)
		label_1.setText("Player 2: "+ game.players.get(1).getPoints() + " points");
		lblNewLabel.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_1.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_2.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_3.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_4.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_5.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_6.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_7.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_8.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_9.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_10.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_11.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_12.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_13.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_14.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_15.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_16.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_17.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_18.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_19.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_20.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_21.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_22.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_23.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_24.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_25.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_26.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_27.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_28.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_29.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_30.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_31.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_32.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_33.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_34.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_35.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_36.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_37.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_38.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_39.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_40.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_41.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_42.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_43.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_44.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_45.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_46.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_47.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_48.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_49.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_50.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_51.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_52.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_53.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_54.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_55.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_56.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_57.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_58.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_59.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_60.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_61.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_62.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_63.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_64.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_65.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_66.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_67.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_68.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_69.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_70.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_71.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_72.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_73.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_74.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_75.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_76.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_77.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_78.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_79.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_80.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_81.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_82.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_83.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_84.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_85.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_86.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_87.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_88.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_89.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_90.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_91.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_92.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_93.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_94.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_95.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_96.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_97.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_98.setIcon(new ImageIcon(newFieldImg));
		lblNewLabel_99.setIcon(new ImageIcon(newFieldImg));
	}
}
