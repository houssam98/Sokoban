import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JBuilder extends JFrame {

	private JPanel contentPane;

	JButton previousButton = null;
	int playerIndex = 0;
	ArrayList<Hole> holes = new ArrayList<Hole>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBuilder frame = new JBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JBuilder() {
		
		setBackground(new Color(0, 128, 128));
	
		
		Game game = new Game(10);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 584, 61);
		panel.add(toolBar);
		
		JButton btnAddWorker = new JButton("Add Worker");
		btnAddWorker.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddWorker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddWorker;
			}
		});
		toolBar.add(btnAddWorker);
		
		JButton btnAddBox = new JButton("Add Box");
		btnAddBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddBox;
			}
		});
		toolBar.add(btnAddBox);
		
		JButton btnAddWall = new JButton("Add Wall");
		btnAddWall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddWall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddWall;
			}
		});
		toolBar.add(btnAddWall);
		
		JButton btnAddHole = new JButton("Add Hole");
		btnAddHole.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddHole.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddHole;
			}
		});
		toolBar.add(btnAddHole);
		
		JButton btnAddDesignatedsquare = new JButton("Add DesignatedSquare");
		btnAddDesignatedsquare.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddDesignatedsquare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddDesignatedsquare;
			}
		});
		toolBar.add(btnAddDesignatedsquare);
		
		JButton btnAddSwitch = new JButton("Add Switch");
		btnAddSwitch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddSwitch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				previousButton = btnAddSwitch;
			}
		});
		toolBar.add(btnAddSwitch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(0, 62, 584, 509);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 10, 0, 0));
		
		JLabel lblNewLabel = new JLabel();
		ImageIcon img = new ImageIcon("images/field.png");
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		img = new ImageIcon("images/field.png");
	    Image image = img.getImage();
		Image newimg = image.getScaledInstance(55, 47, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setIcon(new ImageIcon(newimg));
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel();
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel();
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel();
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel();
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel();
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel();
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel();
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel();
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel();
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel();
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel();
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel();
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel();
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel();
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel();
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel();
		panel_1.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel();
		panel_1.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel();
		panel_1.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel();
		panel_1.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel();
		panel_1.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel();
		panel_1.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel();
		panel_1.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel();
		panel_1.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel();
		panel_1.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel();
		panel_1.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel();
		panel_1.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel();
		panel_1.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel();
		panel_1.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel();
		panel_1.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel();
		panel_1.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel();
		panel_1.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel();
		panel_1.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel();
		panel_1.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel();
		panel_1.add(lblNewLabel_42);
		
		JLabel lblNewLabel_43 = new JLabel();
		panel_1.add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel();
		panel_1.add(lblNewLabel_44);
		
		JLabel lblNewLabel_45 = new JLabel();
		panel_1.add(lblNewLabel_45);
		
		JLabel lblNewLabel_46 = new JLabel();
		panel_1.add(lblNewLabel_46);
		
		JLabel lblNewLabel_47 = new JLabel();
		panel_1.add(lblNewLabel_47);
		
		JLabel lblNewLabel_48 = new JLabel();
		panel_1.add(lblNewLabel_48);
		
		JLabel lblNewLabel_49 = new JLabel();
		panel_1.add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel();
		panel_1.add(lblNewLabel_50);
		
		JLabel lblNewLabel_51 = new JLabel();
		panel_1.add(lblNewLabel_51);
		
		JLabel lblNewLabel_52 = new JLabel();
		panel_1.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel();
		panel_1.add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel();
		panel_1.add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel();
		panel_1.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel();
		panel_1.add(lblNewLabel_56);
		
		JLabel lblNewLabel_57 = new JLabel();
		panel_1.add(lblNewLabel_57);
		
		JLabel lblNewLabel_58 = new JLabel();
		panel_1.add(lblNewLabel_58);
		
		JLabel lblNewLabel_59 = new JLabel();
		panel_1.add(lblNewLabel_59);
		
		JLabel lblNewLabel_60 = new JLabel();
		panel_1.add(lblNewLabel_60);
		
		JLabel lblNewLabel_61 = new JLabel();
		panel_1.add(lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel();
		panel_1.add(lblNewLabel_62);
		
		JLabel lblNewLabel_63 = new JLabel();
		panel_1.add(lblNewLabel_63);
		
		JLabel lblNewLabel_64 = new JLabel();
		panel_1.add(lblNewLabel_64);
		
		JLabel lblNewLabel_65 = new JLabel();
		panel_1.add(lblNewLabel_65);
		
		JLabel lblNewLabel_66 = new JLabel();
		panel_1.add(lblNewLabel_66);
		
		JLabel lblNewLabel_67 = new JLabel();
		panel_1.add(lblNewLabel_67);
		
		JLabel lblNewLabel_68 = new JLabel();
		panel_1.add(lblNewLabel_68);
		
		JLabel lblNewLabel_69 = new JLabel();
		panel_1.add(lblNewLabel_69);
		
		JLabel lblNewLabel_70 = new JLabel();
		panel_1.add(lblNewLabel_70);
		
		JLabel lblNewLabel_71 = new JLabel();
		panel_1.add(lblNewLabel_71);
		
		JLabel lblNewLabel_72 = new JLabel();
		panel_1.add(lblNewLabel_72);
		
		JLabel lblNewLabel_73 = new JLabel();
		panel_1.add(lblNewLabel_73);
		
		JLabel lblNewLabel_74 = new JLabel();
		panel_1.add(lblNewLabel_74);
		
		JLabel lblNewLabel_75 = new JLabel();
		panel_1.add(lblNewLabel_75);
		
		JLabel lblNewLabel_76 = new JLabel();
		panel_1.add(lblNewLabel_76);
		
		JLabel lblNewLabel_77 = new JLabel();
		panel_1.add(lblNewLabel_77);
		
		JLabel lblNewLabel_78 = new JLabel();
		panel_1.add(lblNewLabel_78);
		
		JLabel lblNewLabel_79 = new JLabel();
		panel_1.add(lblNewLabel_79);
		
		
		JLabel lblNewLabel_80 = new JLabel();
		panel_1.add(lblNewLabel_80);
		
		JLabel lblNewLabel_81 = new JLabel();
		panel_1.add(lblNewLabel_81);
		
		JLabel lblNewLabel_82 = new JLabel();
		panel_1.add(lblNewLabel_82);
		
		JLabel lblNewLabel_83 = new JLabel();
		panel_1.add(lblNewLabel_83);
		
		JLabel lblNewLabel_84 = new JLabel();
		panel_1.add(lblNewLabel_84);
		
		JLabel lblNewLabel_85 = new JLabel();
		panel_1.add(lblNewLabel_85);
		
		JLabel lblNewLabel_86 = new JLabel();
		panel_1.add(lblNewLabel_86);
		
		JLabel lblNewLabel_87 = new JLabel();
		panel_1.add(lblNewLabel_87);
		
		JLabel lblNewLabel_88 = new JLabel();
		panel_1.add(lblNewLabel_88);
		
		JLabel lblNewLabel_89 = new JLabel();
		panel_1.add(lblNewLabel_89);
		
		JLabel lblNewLabel_90 = new JLabel();
		panel_1.add(lblNewLabel_90);
		
		JLabel lblNewLabel_91 = new JLabel();
		panel_1.add(lblNewLabel_91);
		
		JLabel lblNewLabel_92 = new JLabel();
		panel_1.add(lblNewLabel_92);
		
		JLabel lblNewLabel_93 = new JLabel();
		panel_1.add(lblNewLabel_93);
		
		JLabel lblNewLabel_94 = new JLabel();
		panel_1.add(lblNewLabel_94);
		
		JLabel lblNewLabel_95 = new JLabel();
		panel_1.add(lblNewLabel_95);
		
		JLabel lblNewLabel_96 = new JLabel();
		panel_1.add(lblNewLabel_96);
		
		JLabel lblNewLabel_97 = new JLabel();
		panel_1.add(lblNewLabel_97);
		
		JLabel lblNewLabel_98 = new JLabel();
		panel_1.add(lblNewLabel_98);
		
		JLabel lblNewLabel_99 = new JLabel();
		panel_1.add(lblNewLabel_99);
		
		lblNewLabel.setIcon(new ImageIcon(newimg));
		lblNewLabel_7.setIcon(new ImageIcon(newimg));
		lblNewLabel_8.setIcon(new ImageIcon(newimg));
		lblNewLabel_9.setIcon(new ImageIcon(newimg));
		lblNewLabel_10.setIcon(new ImageIcon(newimg));
		lblNewLabel_11.setIcon(new ImageIcon(newimg));
		lblNewLabel_12.setIcon(new ImageIcon(newimg));
		lblNewLabel_13.setIcon(new ImageIcon(newimg));
		lblNewLabel_14.setIcon(new ImageIcon(newimg));
		lblNewLabel_15.setIcon(new ImageIcon(newimg));
		lblNewLabel_16.setIcon(new ImageIcon(newimg));
		lblNewLabel_17.setIcon(new ImageIcon(newimg));
		lblNewLabel_18.setIcon(new ImageIcon(newimg));
		lblNewLabel_19.setIcon(new ImageIcon(newimg));
		lblNewLabel_20.setIcon(new ImageIcon(newimg));
		lblNewLabel_21.setIcon(new ImageIcon(newimg));
		lblNewLabel_22.setIcon(new ImageIcon(newimg));
		lblNewLabel_23.setIcon(new ImageIcon(newimg));
		lblNewLabel_24.setIcon(new ImageIcon(newimg));
		lblNewLabel_25.setIcon(new ImageIcon(newimg));
		lblNewLabel_26.setIcon(new ImageIcon(newimg));
		lblNewLabel_27.setIcon(new ImageIcon(newimg));
		lblNewLabel_28.setIcon(new ImageIcon(newimg));
		lblNewLabel_29.setIcon(new ImageIcon(newimg));
		lblNewLabel_30.setIcon(new ImageIcon(newimg));
		lblNewLabel_31.setIcon(new ImageIcon(newimg));
		lblNewLabel_32.setIcon(new ImageIcon(newimg));
		lblNewLabel_33.setIcon(new ImageIcon(newimg));
		lblNewLabel_34.setIcon(new ImageIcon(newimg));
		lblNewLabel_35.setIcon(new ImageIcon(newimg));
		lblNewLabel_36.setIcon(new ImageIcon(newimg));
		lblNewLabel_37.setIcon(new ImageIcon(newimg));
		lblNewLabel_38.setIcon(new ImageIcon(newimg));
		lblNewLabel_39.setIcon(new ImageIcon(newimg));
		lblNewLabel_40.setIcon(new ImageIcon(newimg));
		lblNewLabel_41.setIcon(new ImageIcon(newimg));
		lblNewLabel_42.setIcon(new ImageIcon(newimg));
		lblNewLabel_43.setIcon(new ImageIcon(newimg));
		lblNewLabel_44.setIcon(new ImageIcon(newimg));
		lblNewLabel_45.setIcon(new ImageIcon(newimg));
		lblNewLabel_46.setIcon(new ImageIcon(newimg));
		lblNewLabel_47.setIcon(new ImageIcon(newimg));
		lblNewLabel_48.setIcon(new ImageIcon(newimg));
		lblNewLabel_49.setIcon(new ImageIcon(newimg));
		lblNewLabel_50.setIcon(new ImageIcon(newimg));
		lblNewLabel_51.setIcon(new ImageIcon(newimg));
		lblNewLabel_52.setIcon(new ImageIcon(newimg));
		lblNewLabel_53.setIcon(new ImageIcon(newimg));
		lblNewLabel_54.setIcon(new ImageIcon(newimg));
		lblNewLabel_55.setIcon(new ImageIcon(newimg));
		lblNewLabel_56.setIcon(new ImageIcon(newimg));
		lblNewLabel_57.setIcon(new ImageIcon(newimg));
		lblNewLabel_58.setIcon(new ImageIcon(newimg));
		lblNewLabel_59.setIcon(new ImageIcon(newimg));
		lblNewLabel_60.setIcon(new ImageIcon(newimg));
		lblNewLabel_61.setIcon(new ImageIcon(newimg));
		lblNewLabel_62.setIcon(new ImageIcon(newimg));
		lblNewLabel_63.setIcon(new ImageIcon(newimg));
		lblNewLabel_64.setIcon(new ImageIcon(newimg));
		lblNewLabel_65.setIcon(new ImageIcon(newimg));
		lblNewLabel_66.setIcon(new ImageIcon(newimg));
		lblNewLabel_67.setIcon(new ImageIcon(newimg));
		lblNewLabel_68.setIcon(new ImageIcon(newimg));
		lblNewLabel_69.setIcon(new ImageIcon(newimg));
		lblNewLabel_70.setIcon(new ImageIcon(newimg));
		lblNewLabel_71.setIcon(new ImageIcon(newimg));
		lblNewLabel_72.setIcon(new ImageIcon(newimg));
		lblNewLabel_73.setIcon(new ImageIcon(newimg));
		lblNewLabel_74.setIcon(new ImageIcon(newimg));
		lblNewLabel_75.setIcon(new ImageIcon(newimg));
		lblNewLabel_76.setIcon(new ImageIcon(newimg));
		lblNewLabel_77.setIcon(new ImageIcon(newimg));
		lblNewLabel_78.setIcon(new ImageIcon(newimg));
		lblNewLabel_79.setIcon(new ImageIcon(newimg));
		lblNewLabel_80.setIcon(new ImageIcon(newimg));
		lblNewLabel_81.setIcon(new ImageIcon(newimg));
		lblNewLabel_82.setIcon(new ImageIcon(newimg));
		lblNewLabel_83.setIcon(new ImageIcon(newimg));
		lblNewLabel_84.setIcon(new ImageIcon(newimg));
		lblNewLabel_85.setIcon(new ImageIcon(newimg));
		lblNewLabel_86.setIcon(new ImageIcon(newimg));
		lblNewLabel_87.setIcon(new ImageIcon(newimg));
		lblNewLabel_88.setIcon(new ImageIcon(newimg));
		lblNewLabel_89.setIcon(new ImageIcon(newimg));
		lblNewLabel_90.setIcon(new ImageIcon(newimg));
		lblNewLabel_91.setIcon(new ImageIcon(newimg));
		lblNewLabel_92.setIcon(new ImageIcon(newimg));
		lblNewLabel_93.setIcon(new ImageIcon(newimg));
		lblNewLabel_94.setIcon(new ImageIcon(newimg));
		lblNewLabel_95.setIcon(new ImageIcon(newimg));
		lblNewLabel_96.setIcon(new ImageIcon(newimg));
		lblNewLabel_97.setIcon(new ImageIcon(newimg));
		lblNewLabel_98.setIcon(new ImageIcon(newimg));
		lblNewLabel_99.setIcon(new ImageIcon(newimg));
		
		
		Wall wall0 = new Wall(game.map.fields[0][0]);
		Wall wall1 = new Wall(game.map.fields[0][1]);
		Wall wall2 = new Wall(game.map.fields[0][2]);
		Wall wall3 = new Wall(game.map.fields[0][3]);
		Wall wall4 = new Wall(game.map.fields[0][4]);
		Wall wall5 = new Wall(game.map.fields[0][5]);
		Wall wall6 = new Wall(game.map.fields[0][6]);
		Wall wall7 = new Wall(game.map.fields[0][7]);
		Wall wall8 = new Wall(game.map.fields[0][8]);
		Wall wall9 = new Wall(game.map.fields[0][9]);
		Wall wall10 = new Wall(game.map.fields[1][0]);
		Wall wall11 = new Wall(game.map.fields[2][0]);
		Wall wall12 = new Wall(game.map.fields[3][0]);
		Wall wall13 = new Wall(game.map.fields[4][0]);
		Wall wall14 = new Wall(game.map.fields[5][0]);
		Wall wall15 = new Wall(game.map.fields[6][0]);
		Wall wall16 = new Wall(game.map.fields[7][0]);
		Wall wall17 = new Wall(game.map.fields[8][0]);
		Wall wall18 = new Wall(game.map.fields[9][0]);
		Wall wall21 = new Wall(game.map.fields[1][9]);
		Wall wall22 = new Wall(game.map.fields[2][9]);
		Wall wall23 = new Wall(game.map.fields[3][9]);
		Wall wall24 = new Wall(game.map.fields[4][9]);
		Wall wall25 = new Wall(game.map.fields[5][9]);
		Wall wall26 = new Wall(game.map.fields[6][9]);
		Wall wall27 = new Wall(game.map.fields[7][9]);
		Wall wall28 = new Wall(game.map.fields[8][9]);
		Wall wall29 = new Wall(game.map.fields[9][9]);
		Wall wall31 = new Wall(game.map.fields[9][1]);
		Wall wall32 = new Wall(game.map.fields[9][2]);
		Wall wall33 = new Wall(game.map.fields[9][3]);
		Wall wall34 = new Wall(game.map.fields[9][4]);
		Wall wall35 = new Wall(game.map.fields[9][5]);
		Wall wall36 = new Wall(game.map.fields[9][6]);
		Wall wall37 = new Wall(game.map.fields[9][7]);
		Wall wall38 = new Wall(game.map.fields[9][8]);
		game.WArray.add(wall0);
		game.WArray.add(wall1);
		game.WArray.add(wall2);
		game.WArray.add(wall3);
		game.WArray.add(wall4);
		game.WArray.add(wall5);
		game.WArray.add(wall6);
		game.WArray.add(wall7);
		game.WArray.add(wall8);
		game.WArray.add(wall9);
		game.WArray.add(wall10);
		game.WArray.add(wall11);
		game.WArray.add(wall12);
		game.WArray.add(wall13);
		game.WArray.add(wall14);
		game.WArray.add(wall15);
		game.WArray.add(wall16);
		game.WArray.add(wall17);
		game.WArray.add(wall18);
		game.WArray.add(wall21);
		game.WArray.add(wall22);
		game.WArray.add(wall23);
		game.WArray.add(wall24);
		game.WArray.add(wall25);
		game.WArray.add(wall26);
		game.WArray.add(wall27);
		game.WArray.add(wall28);
		game.WArray.add(wall29);
		game.WArray.add(wall31);
		game.WArray.add(wall32);
		game.WArray.add(wall33);
		game.WArray.add(wall34);
		game.WArray.add(wall35);
		game.WArray.add(wall36);
		game.WArray.add(wall37);
		game.WArray.add(wall38);
		
		
		game.map.fields[0][0].addThing(wall0);
		game.map.fields[0][1].addThing(wall1);
		game.map.fields[0][2].addThing(wall2);
		game.map.fields[0][3].addThing(wall3);
		game.map.fields[0][4].addThing(wall4);
		game.map.fields[0][5].addThing(wall5);
		game.map.fields[0][6].addThing(wall6);
		game.map.fields[0][7].addThing(wall7);
		game.map.fields[0][8].addThing(wall8);
		game.map.fields[0][9].addThing(wall9);
		game.map.fields[1][0].addThing(wall10);
		game.map.fields[2][0].addThing(wall11);
		game.map.fields[3][0].addThing(wall12);
		game.map.fields[4][0].addThing(wall13);
		game.map.fields[5][0].addThing(wall14);
		game.map.fields[6][0].addThing(wall15);
		game.map.fields[7][0].addThing(wall16);
		game.map.fields[8][0].addThing(wall17);
		game.map.fields[9][0].addThing(wall18);
		game.map.fields[1][9].addThing(wall21);
		game.map.fields[2][9].addThing(wall22);
		game.map.fields[3][9].addThing(wall23);
		game.map.fields[4][9].addThing(wall24);
		game.map.fields[5][9].addThing(wall25);
		game.map.fields[6][9].addThing(wall26);
		game.map.fields[7][9].addThing(wall27);
		game.map.fields[8][9].addThing(wall28);
		game.map.fields[9][9].addThing(wall29);
		game.map.fields[9][1].addThing(wall31);
		game.map.fields[9][2].addThing(wall32);
		game.map.fields[9][3].addThing(wall33);
		game.map.fields[9][4].addThing(wall34);
		game.map.fields[9][5].addThing(wall35);
		game.map.fields[9][6].addThing(wall36);
		game.map.fields[9][7].addThing(wall37);
		game.map.fields[9][8].addThing(wall38);
		
		wall0.Display(lblNewLabel);
		wall1.Display(lblNewLabel_1);
		wall2.Display(lblNewLabel_2);
		wall3.Display(lblNewLabel_3);
		wall4.Display(lblNewLabel_4);
		wall5.Display(lblNewLabel_5);
		wall6.Display(lblNewLabel_6);
		wall7.Display(lblNewLabel_7);
		wall8.Display(lblNewLabel_8);
		wall9.Display(lblNewLabel_9);
		wall10.Display(lblNewLabel_10);
		wall11.Display(lblNewLabel_20);
		wall12.Display(lblNewLabel_30);
		wall13.Display(lblNewLabel_40);
		wall14.Display(lblNewLabel_50);
		wall15.Display(lblNewLabel_60);
		wall16.Display(lblNewLabel_70);
		wall17.Display(lblNewLabel_80);
		wall18.Display(lblNewLabel_90);
		wall21.Display(lblNewLabel_91);
		wall22.Display(lblNewLabel_92);
		wall23.Display(lblNewLabel_93);
		wall24.Display(lblNewLabel_94);
		wall25.Display(lblNewLabel_95);
		wall26.Display(lblNewLabel_96);
		wall27.Display(lblNewLabel_97);
		wall28.Display(lblNewLabel_98);
		wall29.Display(lblNewLabel_99);
		wall31.Display(lblNewLabel_19);
		wall32.Display(lblNewLabel_29);
		wall33.Display(lblNewLabel_39);
		wall34.Display(lblNewLabel_49);
		wall35.Display(lblNewLabel_59);
		wall36.Display(lblNewLabel_69);
		wall37.Display(lblNewLabel_79);
		wall38.Display(lblNewLabel_89);


		
		
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveGame(game);
				JOptionPane.showMessageDialog(null, "Your map has been saved!");
				setVisible(false);		
			}
		});
		btnNewButton.setBounds(0, 575, 584, 61);
		contentPane.add(btnNewButton);
	
		

		lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][0]);
							box.Display(lblNewLabel);
							game.map.fields[0][0].addThing(box);game.BoxArray.add(box);
							game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][0]);
							 wall.Display(lblNewLabel);
							 game.map.fields[0][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][0]);
							 worker.Display(lblNewLabel);
							 game.map.fields[0][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][0]);
							ds.Display(lblNewLabel);
							game.map.fields[0][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							
							Hole hole = new Hole(game.map.fields[0][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel);
							game.map.fields[0][0].addThing(hole);
							game.map.fields[0][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][0]);
							switchh.Display(lblNewLabel);
							game.map.fields[0][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][1]);
							box.Display(lblNewLabel_1);
							game.map.fields[0][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][1]);
							 wall.Display(lblNewLabel_1);
							 game.map.fields[0][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][1]);
							 worker.Display(lblNewLabel_1);
							 game.map.fields[0][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][1]);
							ds.Display(lblNewLabel_1);
							game.map.fields[0][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_1);
							game.map.fields[0][1].addThing(hole);
							game.map.fields[0][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][1]);
							switchh.Display(lblNewLabel_1);
							game.map.fields[0][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][2]);
							box.Display(lblNewLabel_2);
							game.map.fields[0][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][2]);
							 wall.Display(lblNewLabel_2);
							 game.map.fields[0][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][2]);
							 worker.Display(lblNewLabel_2);
							 game.map.fields[0][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][2]);
							ds.Display(lblNewLabel_2);
							game.map.fields[0][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_2);
							game.map.fields[0][2].addThing(hole);
							game.map.fields[0][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][2]);
							switchh.Display(lblNewLabel_2);
							game.map.fields[0][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][3]);
							box.Display(lblNewLabel_3);
							game.map.fields[0][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][3]);
							 wall.Display(lblNewLabel_3);
							 game.map.fields[0][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][3]);
							 worker.Display(lblNewLabel_3);
							 game.map.fields[0][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][3]);
							ds.Display(lblNewLabel_3);
							game.map.fields[0][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_3);
							game.map.fields[0][3].addThing(hole);
							game.map.fields[0][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][3]);
							switchh.Display(lblNewLabel_3);
							game.map.fields[0][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][4]);
							box.Display(lblNewLabel_4);
							game.map.fields[0][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][4]);
							 wall.Display(lblNewLabel_4);
							 game.map.fields[0][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][4]);
							 worker.Display(lblNewLabel_4);
							 game.map.fields[0][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][4]);
							ds.Display(lblNewLabel_4);
							game.map.fields[0][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_4);
							game.map.fields[0][4].addThing(hole);
							game.map.fields[0][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][4]);
							switchh.Display(lblNewLabel_4);
							game.map.fields[0][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][5]);
							box.Display(lblNewLabel_5);
							game.map.fields[0][5].addThing(box);
							game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][5]);
							 wall.Display(lblNewLabel_5);
							 game.map.fields[0][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][5]);
							 worker.Display(lblNewLabel_5);
							 game.map.fields[0][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][5]);
							ds.Display(lblNewLabel_5);
							game.map.fields[0][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_5);
							game.map.fields[0][5].addThing(hole);
							game.map.fields[0][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][5]);
							switchh.Display(lblNewLabel_5);
							game.map.fields[0][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][6]);
							box.Display(lblNewLabel_6);
							game.map.fields[0][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][6]);
							 wall.Display(lblNewLabel_6);
							 game.map.fields[0][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][6]);
							 worker.Display(lblNewLabel_6);
							 game.map.fields[0][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][6]);
							ds.Display(lblNewLabel_6);
							game.map.fields[0][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_6);
							game.map.fields[0][6].addThing(hole);
							game.map.fields[0][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][6]);
							switchh.Display(lblNewLabel_6);
							game.map.fields[0][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][7]);
							box.Display(lblNewLabel_7);
							game.map.fields[0][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][7]);
							 wall.Display(lblNewLabel_7);
							 game.map.fields[0][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][7]);
							 worker.Display(lblNewLabel_7);
							 game.map.fields[0][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][7]);
							ds.Display(lblNewLabel_7);
							game.map.fields[0][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_7);
							game.map.fields[0][7].addThing(hole);
							game.map.fields[0][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][7]);
							switchh.Display(lblNewLabel_7);
							game.map.fields[0][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][8]);
							box.Display(lblNewLabel_8);
							game.map.fields[0][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][8]);
							 wall.Display(lblNewLabel_8);
							 game.map.fields[0][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][8]);
							 worker.Display(lblNewLabel_8);
							 game.map.fields[0][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][8]);
							ds.Display(lblNewLabel_8);
							game.map.fields[0][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_8);
							game.map.fields[0][8].addThing(hole);
							game.map.fields[0][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][8]);
							switchh.Display(lblNewLabel_8);
							game.map.fields[0][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[0][9]);
							box.Display(lblNewLabel_9);
							game.map.fields[0][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[0][9]);
							 wall.Display(lblNewLabel_9);
							 game.map.fields[0][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[0][9]);
							 worker.Display(lblNewLabel_9);
							 game.map.fields[0][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[0][9]);
							ds.Display(lblNewLabel_9);
							game.map.fields[0][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[0][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_9);
							game.map.fields[0][9].addThing(hole);
							game.map.fields[0][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[0][9]);
							switchh.Display(lblNewLabel_9);
							game.map.fields[0][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][0]);
							box.Display(lblNewLabel_10);
							game.map.fields[1][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][0]);
							 wall.Display(lblNewLabel_10);
							 game.map.fields[1][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][0]);
							 worker.Display(lblNewLabel_10);
							 game.map.fields[1][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][0]);
							ds.Display(lblNewLabel_10);
							game.map.fields[1][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_10);
							game.map.fields[1][0].addThing(hole);
							game.map.fields[1][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][0]);
							switchh.Display(lblNewLabel_10);
							game.map.fields[1][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][1]);
							box.Display(lblNewLabel_11);
							game.map.fields[1][1].addThing(box);
							game.BoxArray.add(box);
							System.out.println(game.BoxArray.size()+  "** "+ box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][1]);
							 wall.Display(lblNewLabel_11);
							 game.map.fields[1][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][1]);
							 worker.Display(lblNewLabel_11);
							 game.map.fields[1][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][1]);
							ds.Display(lblNewLabel_11);
							game.map.fields[1][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_11);
							game.map.fields[1][1].addThing(hole);
							game.map.fields[1][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][1]);
							switchh.Display(lblNewLabel_11);
							game.map.fields[1][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][2]);
							box.Display(lblNewLabel_12);
							game.map.fields[1][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][2]);
							 wall.Display(lblNewLabel_12);
							 game.map.fields[1][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][2]);
							 worker.Display(lblNewLabel_12);
							 game.map.fields[1][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][2]);
							ds.Display(lblNewLabel_12);
							game.map.fields[1][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_12);
							game.map.fields[1][2].addThing(hole);
							game.map.fields[1][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][2]);
							switchh.Display(lblNewLabel_12);
							game.map.fields[1][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][3]);
							box.Display(lblNewLabel_13);
							game.map.fields[1][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][3]);
							 wall.Display(lblNewLabel_13);
							 game.map.fields[1][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][3]);
							 worker.Display(lblNewLabel_13);
							 game.map.fields[1][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][3]);
							ds.Display(lblNewLabel_13);
							game.map.fields[1][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_13);
							game.map.fields[1][3].addThing(hole);
							game.map.fields[1][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][3]);
							switchh.Display(lblNewLabel_13);
							game.map.fields[1][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][4]);
							box.Display(lblNewLabel_14);
							game.map.fields[1][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][4]);
							 wall.Display(lblNewLabel_14);
							 game.map.fields[1][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][4]);
							 worker.Display(lblNewLabel_14);
							 game.map.fields[1][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][4]);
							ds.Display(lblNewLabel_14);
							game.map.fields[1][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_14);
							game.map.fields[1][4].addThing(hole);
							game.map.fields[1][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][4]);
							switchh.Display(lblNewLabel_14);
							game.map.fields[1][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][5]);
							box.Display(lblNewLabel_15);
							game.map.fields[1][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][5]);
							 wall.Display(lblNewLabel_15);
							 game.map.fields[1][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][5]);
							 worker.Display(lblNewLabel_15);
							 game.map.fields[1][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][5]);
							ds.Display(lblNewLabel_15);
							game.map.fields[1][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_15);
							game.map.fields[1][5].addThing(hole);
							game.map.fields[1][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][5]);
							switchh.Display(lblNewLabel_15);
							game.map.fields[1][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][6]);
							box.Display(lblNewLabel_16);
							game.map.fields[1][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][6]);
							 wall.Display(lblNewLabel_16);
							 game.map.fields[1][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][6]);
							 worker.Display(lblNewLabel_16);
							 game.map.fields[1][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][6]);
							ds.Display(lblNewLabel_16);
							game.map.fields[1][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_16);
							game.map.fields[1][6].addThing(hole);
							game.map.fields[1][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][6]);
							switchh.Display(lblNewLabel_16);
							game.map.fields[1][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][7]);
							box.Display(lblNewLabel_17);
							game.map.fields[1][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][7]);
							 wall.Display(lblNewLabel_17);
							 game.map.fields[1][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][7]);
							 worker.Display(lblNewLabel_17);
							 game.map.fields[1][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][7]);
							ds.Display(lblNewLabel_17);
							game.map.fields[1][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_17);
							game.map.fields[1][7].addThing(hole);
							game.map.fields[1][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][7]);
							switchh.Display(lblNewLabel_17);
							game.map.fields[1][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_18.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][8]);
							box.Display(lblNewLabel_18);
							game.map.fields[1][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][8]);
							 wall.Display(lblNewLabel_18);
							 game.map.fields[1][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][8]);
							 worker.Display(lblNewLabel_18);
							 game.map.fields[1][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][8]);
							ds.Display(lblNewLabel_18);
							game.map.fields[1][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_18);
							game.map.fields[1][8].addThing(hole);
							game.map.fields[1][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][8]);
							switchh.Display(lblNewLabel_18);
							game.map.fields[1][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[1][9]);
							box.Display(lblNewLabel_19);
							game.map.fields[1][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[1][9]);
							 wall.Display(lblNewLabel_19);
							 game.map.fields[1][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[1][9]);
							 worker.Display(lblNewLabel_19);
							 game.map.fields[1][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[1][9]);
							ds.Display(lblNewLabel_19);
							game.map.fields[1][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[1][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_19);
							game.map.fields[1][9].addThing(hole);
							game.map.fields[1][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[1][9]);
							switchh.Display(lblNewLabel_19);
							game.map.fields[1][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][0]);
							box.Display(lblNewLabel_20);
							game.map.fields[2][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][0]);
							 wall.Display(lblNewLabel_20);
							 game.map.fields[2][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][0]);
							 worker.Display(lblNewLabel_20);
							 game.map.fields[2][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][0]);
							ds.Display(lblNewLabel_20);
							game.map.fields[2][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_20);
							game.map.fields[2][0].addThing(hole);
							game.map.fields[2][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][0]);
							switchh.Display(lblNewLabel_20);
							game.map.fields[2][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_21.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][1]);
							box.Display(lblNewLabel_21);
							game.map.fields[2][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][1]);
							 wall.Display(lblNewLabel_21);
							 game.map.fields[2][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][1]);
							 worker.Display(lblNewLabel_21);
							 game.map.fields[2][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][1]);
							ds.Display(lblNewLabel_21);
							game.map.fields[2][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_21);
							game.map.fields[2][1].addThing(hole);
							game.map.fields[2][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][1]);
							switchh.Display(lblNewLabel_21);
							game.map.fields[2][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_22.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][2]);
							box.Display(lblNewLabel_22);
							game.map.fields[2][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][2]);
							 wall.Display(lblNewLabel_22);
							 game.map.fields[2][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][2]);
							 worker.Display(lblNewLabel_22);
							 game.map.fields[2][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][2]);
							ds.Display(lblNewLabel_22);
							game.map.fields[2][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_22);
							game.map.fields[2][2].addThing(hole);
							game.map.fields[2][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][2]);
							switchh.Display(lblNewLabel_22);
							game.map.fields[2][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_23.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][3]);
							box.Display(lblNewLabel_23);
							game.map.fields[2][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][3]);
							 wall.Display(lblNewLabel_23);
							 game.map.fields[2][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][3]);
							 worker.Display(lblNewLabel_23);
							 game.map.fields[2][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][3]);
							ds.Display(lblNewLabel_23);
							game.map.fields[2][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_23);
							game.map.fields[2][3].addThing(hole);
							game.map.fields[2][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][3]);
							switchh.Display(lblNewLabel_23);
							game.map.fields[2][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_24.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][4]);
							box.Display(lblNewLabel_24);
							game.map.fields[2][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][4]);
							 wall.Display(lblNewLabel_24);
							 game.map.fields[2][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][4]);
							 worker.Display(lblNewLabel_24);
							 game.map.fields[2][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][4]);
							ds.Display(lblNewLabel_24);
							game.map.fields[2][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_24);
							game.map.fields[2][4].addThing(hole);
							game.map.fields[2][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][4]);
							switchh.Display(lblNewLabel_24);
							game.map.fields[2][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_25.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][5]);
							box.Display(lblNewLabel_25);
							game.map.fields[2][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][5]);
							 wall.Display(lblNewLabel_25);
							 game.map.fields[2][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][5]);
							 worker.Display(lblNewLabel_25);
							 game.map.fields[2][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][5]);
							ds.Display(lblNewLabel_25);
							game.map.fields[2][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_25);
							game.map.fields[2][5].addThing(hole);
							game.map.fields[2][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][5]);
							switchh.Display(lblNewLabel_25);
							game.map.fields[2][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_26.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][6]);
							box.Display(lblNewLabel_26);
							game.map.fields[2][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][6]);
							 wall.Display(lblNewLabel_26);
							 game.map.fields[2][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][6]);
							 worker.Display(lblNewLabel_26);
							 game.map.fields[2][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][6]);
							ds.Display(lblNewLabel_26);
							game.map.fields[2][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_26);
							game.map.fields[2][6].addThing(hole);
							game.map.fields[2][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][6]);
							switchh.Display(lblNewLabel_26);
							game.map.fields[2][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_27.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][7]);
							box.Display(lblNewLabel_27);
							game.map.fields[2][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][7]);
							 wall.Display(lblNewLabel_27);
							 game.map.fields[2][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][7]);
							 worker.Display(lblNewLabel_27);
							 game.map.fields[2][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][7]);
							ds.Display(lblNewLabel_27);
							game.map.fields[2][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_27);
							game.map.fields[2][7].addThing(hole);
							game.map.fields[2][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][7]);
							switchh.Display(lblNewLabel_27);
							game.map.fields[2][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_28.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][8]);
							box.Display(lblNewLabel_28);
							game.map.fields[2][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][8]);
							 wall.Display(lblNewLabel_28);
							 game.map.fields[2][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][8]);
							 worker.Display(lblNewLabel_28);
							 game.map.fields[2][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][8]);
							ds.Display(lblNewLabel_28);
							game.map.fields[2][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_28);
							game.map.fields[2][8].addThing(hole);
							game.map.fields[2][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][8]);
							switchh.Display(lblNewLabel_28);
							game.map.fields[2][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_29.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[2][9]);
							box.Display(lblNewLabel_29);
							game.map.fields[2][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[2][9]);
							 wall.Display(lblNewLabel_29);
							 game.map.fields[2][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[2][9]);
							 worker.Display(lblNewLabel_29);
							 game.map.fields[2][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[2][9]);
							ds.Display(lblNewLabel_29);
							game.map.fields[2][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[2][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_29);
							game.map.fields[2][9].addThing(hole);
							game.map.fields[2][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[2][9]);
							switchh.Display(lblNewLabel_29);
							game.map.fields[2][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_30.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][0]);
							box.Display(lblNewLabel_30);
							game.map.fields[3][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][0]);
							 wall.Display(lblNewLabel_30);
							 game.map.fields[3][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][0]);
							 worker.Display(lblNewLabel_30);
							 game.map.fields[3][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][0]);
							ds.Display(lblNewLabel_30);
							game.map.fields[3][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_30);
							game.map.fields[3][0].addThing(hole);
							game.map.fields[3][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][0]);
							switchh.Display(lblNewLabel_30);
							game.map.fields[3][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_31.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][1]);
							box.Display(lblNewLabel_31);
							game.map.fields[3][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][1]);
							 wall.Display(lblNewLabel_31);
							 game.map.fields[3][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][1]);
							 worker.Display(lblNewLabel_31);
							 game.map.fields[3][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][1]);
							ds.Display(lblNewLabel_31);
							game.map.fields[3][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_31);
							game.map.fields[3][1].addThing(hole);
							game.map.fields[3][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][1]);
							switchh.Display(lblNewLabel_31);
							game.map.fields[3][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_32.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][2]);
							box.Display(lblNewLabel_32);
							game.map.fields[3][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][2]);
							 wall.Display(lblNewLabel_32);
							 game.map.fields[3][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][2]);
							 worker.Display(lblNewLabel_32);
							 game.map.fields[3][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][2]);
							ds.Display(lblNewLabel_32);
							game.map.fields[3][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_32);
							game.map.fields[3][2].addThing(hole);
							game.map.fields[3][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][2]);
							switchh.Display(lblNewLabel_32);
							game.map.fields[3][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_33.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][3]);
							box.Display(lblNewLabel_33);
							game.map.fields[3][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][3]);
							 wall.Display(lblNewLabel_33);
							 game.map.fields[3][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][3]);
							 worker.Display(lblNewLabel_33);
							 game.map.fields[3][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][3]);
							ds.Display(lblNewLabel_33);
							game.map.fields[3][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_33);
							game.map.fields[3][3].addThing(hole);
							game.map.fields[3][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][3]);
							switchh.Display(lblNewLabel_33);
							game.map.fields[3][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_34.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][4]);
							box.Display(lblNewLabel_34);
							game.map.fields[3][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][4]);
							 wall.Display(lblNewLabel_34);
							 game.map.fields[3][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][4]);
							 worker.Display(lblNewLabel_34);
							 game.map.fields[3][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][4]);
							ds.Display(lblNewLabel_34);
							game.map.fields[3][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_34);
							game.map.fields[3][4].addThing(hole);
							game.map.fields[3][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][4]);
							switchh.Display(lblNewLabel_34);
							game.map.fields[3][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_35.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][5]);
							box.Display(lblNewLabel_35);
							game.map.fields[3][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][5]);
							 wall.Display(lblNewLabel_35);
							 game.map.fields[3][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][5]);
							 worker.Display(lblNewLabel_35);
							 game.map.fields[3][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][5]);
							ds.Display(lblNewLabel_35);
							game.map.fields[3][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_35);
							game.map.fields[3][5].addThing(hole);
							game.map.fields[3][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][5]);
							switchh.Display(lblNewLabel_35);
							game.map.fields[3][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_36.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][6]);
							box.Display(lblNewLabel_36);
							game.map.fields[3][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][6]);
							 wall.Display(lblNewLabel_36);
							 game.map.fields[3][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][6]);
							 worker.Display(lblNewLabel_36);
							 game.map.fields[3][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][6]);
							ds.Display(lblNewLabel_36);
							game.map.fields[3][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_36);
							game.map.fields[3][6].addThing(hole);
							game.map.fields[3][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][6]);
							switchh.Display(lblNewLabel_36);
							game.map.fields[3][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_37.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][7]);
							box.Display(lblNewLabel_37);
							game.map.fields[3][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][7]);
							 wall.Display(lblNewLabel_37);
							 game.map.fields[3][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][7]);
							 worker.Display(lblNewLabel_37);
							 game.map.fields[3][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][7]);
							ds.Display(lblNewLabel_37);
							game.map.fields[3][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_37);
							game.map.fields[3][7].addThing(hole);
							game.map.fields[3][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][7]);
							switchh.Display(lblNewLabel_37);
							game.map.fields[3][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_38.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][8]);
							box.Display(lblNewLabel_38);
							game.map.fields[3][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][8]);
							 wall.Display(lblNewLabel_38);
							 game.map.fields[3][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][8]);
							 worker.Display(lblNewLabel_38);
							 game.map.fields[3][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][8]);
							ds.Display(lblNewLabel_38);
							game.map.fields[3][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_38);
							game.map.fields[3][8].addThing(hole);
							game.map.fields[3][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][8]);
							switchh.Display(lblNewLabel_38);
							game.map.fields[3][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_39.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[3][9]);
							box.Display(lblNewLabel_39);
							game.map.fields[3][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[3][9]);
							 wall.Display(lblNewLabel_39);
							 game.map.fields[3][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[3][9]);
							 worker.Display(lblNewLabel_39);
							 game.map.fields[3][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[3][9]);
							ds.Display(lblNewLabel_39);
							game.map.fields[3][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[3][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_39);
							game.map.fields[3][9].addThing(hole);
							game.map.fields[3][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[3][9]);
							switchh.Display(lblNewLabel_39);
							game.map.fields[3][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_40.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][0]);
							box.Display(lblNewLabel_40);
							game.map.fields[4][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][0]);
							 wall.Display(lblNewLabel_40);
							 game.map.fields[4][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][0]);
							 worker.Display(lblNewLabel_40);
							 game.map.fields[4][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][0]);
							ds.Display(lblNewLabel_40);
							game.map.fields[4][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_40);
							game.map.fields[4][0].addThing(hole);
							game.map.fields[4][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][0]);
							switchh.Display(lblNewLabel_40);
							game.map.fields[4][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_41.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][1]);
							box.Display(lblNewLabel_41);
							game.map.fields[4][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][1]);
							 wall.Display(lblNewLabel_41);
							 game.map.fields[4][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][1]);
							 worker.Display(lblNewLabel_41);
							 game.map.fields[4][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][1]);
							ds.Display(lblNewLabel_41);
							game.map.fields[4][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_41);
							game.map.fields[4][1].addThing(hole);
							game.map.fields[4][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][1]);
							switchh.Display(lblNewLabel_41);
							game.map.fields[4][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_42.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][2]);
							box.Display(lblNewLabel_42);
							game.map.fields[4][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][2]);
							 wall.Display(lblNewLabel_42);
							 game.map.fields[4][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][2]);
							 worker.Display(lblNewLabel_42);
							 game.map.fields[4][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][2]);
							ds.Display(lblNewLabel_42);
							game.map.fields[4][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_42);
							game.map.fields[4][2].addThing(hole);
							game.map.fields[4][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][2]);
							switchh.Display(lblNewLabel_42);
							game.map.fields[4][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_43.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][3]);
							box.Display(lblNewLabel_43);
							game.map.fields[4][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][3]);
							 wall.Display(lblNewLabel_43);
							 game.map.fields[4][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][3]);
							 worker.Display(lblNewLabel_43);
							 game.map.fields[4][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][3]);
							ds.Display(lblNewLabel_43);
							game.map.fields[4][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_43);
							game.map.fields[4][3].addThing(hole);
							game.map.fields[4][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][3]);
							switchh.Display(lblNewLabel_43);
							game.map.fields[4][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_44.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][4]);
							box.Display(lblNewLabel_44);
							game.map.fields[4][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][4]);
							 wall.Display(lblNewLabel_44);
							 game.map.fields[4][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][4]);
							 worker.Display(lblNewLabel_44);
							 game.map.fields[4][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][4]);
							ds.Display(lblNewLabel_44);
							game.map.fields[4][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_44);
							game.map.fields[4][4].addThing(hole);
							game.map.fields[4][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][4]);
							switchh.Display(lblNewLabel_44);
							game.map.fields[4][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_45.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][5]);
							box.Display(lblNewLabel_45);
							game.map.fields[4][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][5]);
							 wall.Display(lblNewLabel_45);
							 game.map.fields[4][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][5]);
							 worker.Display(lblNewLabel_45);
							 game.map.fields[4][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][5]);
							ds.Display(lblNewLabel_45);
							game.map.fields[4][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_45);
							game.map.fields[4][5].addThing(hole);
							game.map.fields[4][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][5]);
							switchh.Display(lblNewLabel_45);
							game.map.fields[4][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_46.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][6]);
							box.Display(lblNewLabel_46);
							game.map.fields[4][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][6]);
							 wall.Display(lblNewLabel_46);
							 game.map.fields[4][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][6]);
							 worker.Display(lblNewLabel_46);
							 game.map.fields[4][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][6]);
							ds.Display(lblNewLabel_46);
							game.map.fields[4][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_46);
							game.map.fields[4][6].addThing(hole);
							game.map.fields[4][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][6]);
							switchh.Display(lblNewLabel_46);
							game.map.fields[4][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_47.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][7]);
							box.Display(lblNewLabel_47);
							game.map.fields[4][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][7]);
							 wall.Display(lblNewLabel_47);
							 game.map.fields[4][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][7]);
							 worker.Display(lblNewLabel_47);
							 game.map.fields[4][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][7]);
							ds.Display(lblNewLabel_47);
							game.map.fields[4][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_47);
							game.map.fields[4][7].addThing(hole);
							game.map.fields[4][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][7]);
							switchh.Display(lblNewLabel_47);
							game.map.fields[4][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_48.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][8]);
							box.Display(lblNewLabel_48);
							game.map.fields[4][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][8]);
							 wall.Display(lblNewLabel_48);
							 game.map.fields[4][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][8]);
							 worker.Display(lblNewLabel_48);
							 game.map.fields[4][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][8]);
							ds.Display(lblNewLabel_48);
							game.map.fields[4][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_48);
							game.map.fields[4][8].addThing(hole);
							game.map.fields[4][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][8]);
							switchh.Display(lblNewLabel_48);
							game.map.fields[4][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_49.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[4][9]);
							box.Display(lblNewLabel_49);
							game.map.fields[4][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[4][9]);
							 wall.Display(lblNewLabel_49);
							 game.map.fields[4][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[4][9]);
							 worker.Display(lblNewLabel_49);
							 game.map.fields[4][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[4][9]);
							ds.Display(lblNewLabel_49);
							game.map.fields[4][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[4][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_49);
							game.map.fields[4][9].addThing(hole);
							game.map.fields[4][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[4][9]);
							switchh.Display(lblNewLabel_49);
							game.map.fields[4][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_50.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][0]);
							box.Display(lblNewLabel_50);
							game.map.fields[5][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][0]);
							 wall.Display(lblNewLabel_50);
							 game.map.fields[5][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][0]);
							 worker.Display(lblNewLabel_50);
							 game.map.fields[5][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][0]);
							ds.Display(lblNewLabel_50);
							game.map.fields[5][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_50);
							game.map.fields[5][0].addThing(hole);
							game.map.fields[5][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][0]);
							switchh.Display(lblNewLabel_50);
							game.map.fields[5][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_51.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][1]);
							box.Display(lblNewLabel_51);
							game.map.fields[5][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][1]);
							 wall.Display(lblNewLabel_51);
							 game.map.fields[5][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][1]);
							 worker.Display(lblNewLabel_51);
							 game.map.fields[5][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][1]);
							ds.Display(lblNewLabel_51);
							game.map.fields[5][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_51);
							game.map.fields[5][1].addThing(hole);
							game.map.fields[5][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][1]);
							switchh.Display(lblNewLabel_51);
							game.map.fields[5][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_52.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][2]);
							box.Display(lblNewLabel_52);
							game.map.fields[5][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][2]);
							 wall.Display(lblNewLabel_52);
							 game.map.fields[5][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][2]);
							 worker.Display(lblNewLabel_52);
							 game.map.fields[5][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][2]);
							ds.Display(lblNewLabel_52);
							game.map.fields[5][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_52);
							game.map.fields[5][2].addThing(hole);
							game.map.fields[5][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][2]);
							switchh.Display(lblNewLabel_52);
							game.map.fields[5][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_53.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][3]);
							box.Display(lblNewLabel_53);
							game.map.fields[5][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][3]);
							 wall.Display(lblNewLabel_53);
							 game.map.fields[5][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][3]);
							 worker.Display(lblNewLabel_53);
							 game.map.fields[5][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][3]);
							ds.Display(lblNewLabel_53);
							game.map.fields[5][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_53);
							game.map.fields[5][3].addThing(hole);
							game.map.fields[5][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][3]);
							switchh.Display(lblNewLabel_53);
							game.map.fields[5][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_54.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][4]);
							box.Display(lblNewLabel_54);
							game.map.fields[5][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][4]);
							 wall.Display(lblNewLabel_54);
							 game.map.fields[5][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][4]);
							 worker.Display(lblNewLabel_54);
							 game.map.fields[5][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][4]);
							ds.Display(lblNewLabel_54);
							game.map.fields[5][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_54);
							game.map.fields[5][4].addThing(hole);
							game.map.fields[5][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][4]);
							switchh.Display(lblNewLabel_54);
							game.map.fields[5][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_55.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][5]);
							box.Display(lblNewLabel_55);
							game.map.fields[5][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][5]);
							 wall.Display(lblNewLabel_55);
							 game.map.fields[5][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][5]);
							 worker.Display(lblNewLabel_55);
							 game.map.fields[5][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][5]);
							ds.Display(lblNewLabel_55);
							game.map.fields[5][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_55);
							game.map.fields[5][5].addThing(hole);
							game.map.fields[5][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][5]);
							switchh.Display(lblNewLabel_55);
							game.map.fields[5][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_56.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][6]);
							box.Display(lblNewLabel_56);
							game.map.fields[5][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][6]);
							 wall.Display(lblNewLabel_56);
							 game.map.fields[5][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][6]);
							 worker.Display(lblNewLabel_56);
							 game.map.fields[5][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][6]);
							ds.Display(lblNewLabel_56);
							game.map.fields[5][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_56);
							game.map.fields[5][6].addThing(hole);
							game.map.fields[5][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][6]);
							switchh.Display(lblNewLabel_56);
							game.map.fields[5][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_57.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][7]);
							box.Display(lblNewLabel_57);
							game.map.fields[5][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][7]);
							 wall.Display(lblNewLabel_57);
							 game.map.fields[5][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][7]);
							 worker.Display(lblNewLabel_57);
							 game.map.fields[5][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][7]);
							ds.Display(lblNewLabel_57);
							game.map.fields[5][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_57);
							game.map.fields[5][7].addThing(hole);
							game.map.fields[5][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][7]);
							switchh.Display(lblNewLabel_57);
							game.map.fields[5][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_58.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][8]);
							box.Display(lblNewLabel_58);
							game.map.fields[5][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][8]);
							 wall.Display(lblNewLabel_58);
							 game.map.fields[5][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][8]);
							 worker.Display(lblNewLabel_58);
							 game.map.fields[5][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][8]);
							ds.Display(lblNewLabel_58);
							game.map.fields[5][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_58);
							game.map.fields[5][8].addThing(hole);
							game.map.fields[5][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][8]);
							switchh.Display(lblNewLabel_58);
							game.map.fields[5][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_59.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[5][9]);
							box.Display(lblNewLabel_59);
							game.map.fields[5][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[5][9]);
							 wall.Display(lblNewLabel_59);
							 game.map.fields[5][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[5][9]);
							 worker.Display(lblNewLabel_59);
							 game.map.fields[5][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[5][9]);
							ds.Display(lblNewLabel_59);
							game.map.fields[5][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[5][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_59);
							game.map.fields[5][9].addThing(hole);
							game.map.fields[5][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[5][9]);
							switchh.Display(lblNewLabel_59);
							game.map.fields[5][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_60.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][0]);
							box.Display(lblNewLabel_60);
							game.map.fields[6][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][0]);
							 wall.Display(lblNewLabel_60);
							 game.map.fields[6][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][0]);
							 worker.Display(lblNewLabel_60);
							 game.map.fields[6][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][0]);
							ds.Display(lblNewLabel_60);
							game.map.fields[6][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_60);
							game.map.fields[6][0].addThing(hole);
							game.map.fields[6][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][0]);
							switchh.Display(lblNewLabel_60);
							game.map.fields[6][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_61.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][1]);
							box.Display(lblNewLabel_61);
							game.map.fields[6][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][1]);
							 wall.Display(lblNewLabel_61);
							 game.map.fields[6][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][1]);
							 worker.Display(lblNewLabel_61);
							 game.map.fields[6][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][1]);
							ds.Display(lblNewLabel_61);
							game.map.fields[6][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_61);
							game.map.fields[6][1].addThing(hole);
							game.map.fields[6][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][1]);
							switchh.Display(lblNewLabel_61);
							game.map.fields[6][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_62.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][2]);
							box.Display(lblNewLabel_62);
							game.map.fields[6][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][2]);
							 wall.Display(lblNewLabel_62);
							 game.map.fields[6][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][2]);
							 worker.Display(lblNewLabel_62);
							 game.map.fields[6][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][2]);
							ds.Display(lblNewLabel_62);
							game.map.fields[6][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_62);
							game.map.fields[6][2].addThing(hole);
							game.map.fields[6][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][2]);
							switchh.Display(lblNewLabel_62);
							game.map.fields[6][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_63.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][3]);
							box.Display(lblNewLabel_63);
							game.map.fields[6][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][3]);
							 wall.Display(lblNewLabel_63);
							 game.map.fields[6][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][3]);
							 worker.Display(lblNewLabel_63);
							 game.map.fields[6][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][3]);
							ds.Display(lblNewLabel_63);
							game.map.fields[6][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_63);
							game.map.fields[6][3].addThing(hole);
							game.map.fields[6][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][3]);
							switchh.Display(lblNewLabel_63);
							game.map.fields[6][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_64.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][4]);
							box.Display(lblNewLabel_64);
							game.map.fields[6][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][4]);
							 wall.Display(lblNewLabel_64);
							 game.map.fields[6][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][4]);
							 worker.Display(lblNewLabel_64);
							 game.map.fields[6][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][4]);
							ds.Display(lblNewLabel_64);
							game.map.fields[6][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_64);
							game.map.fields[6][4].addThing(hole);
							game.map.fields[6][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][4]);
							switchh.Display(lblNewLabel_64);
							game.map.fields[6][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_65.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][5]);
							box.Display(lblNewLabel_65);
							game.map.fields[6][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][5]);
							 wall.Display(lblNewLabel_65);
							 game.map.fields[6][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][5]);
							 worker.Display(lblNewLabel_65);
							 game.map.fields[6][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][5]);
							ds.Display(lblNewLabel_65);
							game.map.fields[6][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_65);
							game.map.fields[6][5].addThing(hole);
							game.map.fields[6][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][5]);
							switchh.Display(lblNewLabel_65);
							game.map.fields[6][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_66.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][6]);
							box.Display(lblNewLabel_66);
							game.map.fields[6][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][6]);
							 wall.Display(lblNewLabel_66);
							 game.map.fields[6][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][6]);
							 worker.Display(lblNewLabel_66);
							 game.map.fields[6][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][6]);
							ds.Display(lblNewLabel_66);
							game.map.fields[6][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_66);
							game.map.fields[6][6].addThing(hole);
							game.map.fields[6][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][6]);
							switchh.Display(lblNewLabel_66);
							game.map.fields[6][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_67.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][7]);
							box.Display(lblNewLabel_67);
							game.map.fields[6][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][7]);
							 wall.Display(lblNewLabel_67);
							 game.map.fields[6][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][7]);
							 worker.Display(lblNewLabel_67);
							 game.map.fields[6][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][7]);
							ds.Display(lblNewLabel_67);
							game.map.fields[6][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_67);
							game.map.fields[6][7].addThing(hole);
							game.map.fields[6][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][7]);
							switchh.Display(lblNewLabel_67);
							game.map.fields[6][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_68.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][8]);
							box.Display(lblNewLabel_68);
							game.map.fields[6][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][8]);
							 wall.Display(lblNewLabel_68);
							 game.map.fields[6][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][8]);
							 worker.Display(lblNewLabel_68);
							 game.map.fields[6][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][8]);
							ds.Display(lblNewLabel_68);
							game.map.fields[6][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_68);
							game.map.fields[6][8].addThing(hole);
							game.map.fields[6][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][8]);
							switchh.Display(lblNewLabel_68);
							game.map.fields[6][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_69.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[6][9]);
							box.Display(lblNewLabel_69);
							game.map.fields[6][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[6][9]);
							 wall.Display(lblNewLabel_69);
							 game.map.fields[6][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[6][9]);
							 worker.Display(lblNewLabel_69);
							 game.map.fields[6][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[6][9]);
							ds.Display(lblNewLabel_69);
							game.map.fields[6][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[6][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_69);
							game.map.fields[6][9].addThing(hole);
							game.map.fields[6][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[6][9]);
							switchh.Display(lblNewLabel_69);
							game.map.fields[6][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_70.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][0]);
							box.Display(lblNewLabel_70);
							game.map.fields[7][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][0]);
							 wall.Display(lblNewLabel_70);
							 game.map.fields[7][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][0]);
							 worker.Display(lblNewLabel_70);
							 game.map.fields[7][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][0]);
							ds.Display(lblNewLabel_70);
							game.map.fields[7][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_70);
							game.map.fields[7][0].addThing(hole);
							game.map.fields[7][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][0]);
							switchh.Display(lblNewLabel_70);
							game.map.fields[7][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_71.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][1]);
							box.Display(lblNewLabel_71);
							game.map.fields[7][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][1]);
							 wall.Display(lblNewLabel_71);
							 game.map.fields[7][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][1]);
							 worker.Display(lblNewLabel_71);
							 game.map.fields[7][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][1]);
							ds.Display(lblNewLabel_71);
							game.map.fields[7][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_71);
							game.map.fields[7][1].addThing(hole);
							game.map.fields[7][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][1]);
							switchh.Display(lblNewLabel_71);
							game.map.fields[7][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_72.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][2]);
							box.Display(lblNewLabel_72);
							game.map.fields[7][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][2]);
							 wall.Display(lblNewLabel_72);
							 game.map.fields[7][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][2]);
							 worker.Display(lblNewLabel_72);
							 game.map.fields[7][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][2]);
							ds.Display(lblNewLabel_72);
							game.map.fields[7][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_72);
							game.map.fields[7][2].addThing(hole);
							game.map.fields[7][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][2]);
							switchh.Display(lblNewLabel_72);
							game.map.fields[7][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_73.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][3]);
							box.Display(lblNewLabel_73);
							game.map.fields[7][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][3]);
							 wall.Display(lblNewLabel_73);
							 game.map.fields[7][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][3]);
							 worker.Display(lblNewLabel_73);
							 game.map.fields[7][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][3]);
							ds.Display(lblNewLabel_73);
							game.map.fields[7][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_73);
							game.map.fields[7][3].addThing(hole);
							game.map.fields[7][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][3]);
							switchh.Display(lblNewLabel_73);
							game.map.fields[7][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_74.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][4]);
							box.Display(lblNewLabel_74);
							game.map.fields[7][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][4]);
							 wall.Display(lblNewLabel_74);
							 game.map.fields[7][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][4]);
							 worker.Display(lblNewLabel_74);
							 game.map.fields[7][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][4]);
							ds.Display(lblNewLabel_74);
							game.map.fields[7][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_74);
							game.map.fields[7][4].addThing(hole);
							game.map.fields[7][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][4]);
							switchh.Display(lblNewLabel_74);
							game.map.fields[7][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_75.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][5]);
							box.Display(lblNewLabel_75);
							game.map.fields[7][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][5]);
							 wall.Display(lblNewLabel_75);
							 game.map.fields[7][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][5]);
							 worker.Display(lblNewLabel_75);
							 game.map.fields[7][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][5]);
							ds.Display(lblNewLabel_75);
							game.map.fields[7][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_75);
							game.map.fields[7][5].addThing(hole);
							game.map.fields[7][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][5]);
							switchh.Display(lblNewLabel_75);
							game.map.fields[7][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_76.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][6]);
							box.Display(lblNewLabel_76);
							game.map.fields[7][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][6]);
							 wall.Display(lblNewLabel_76);
							 game.map.fields[7][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][6]);
							 worker.Display(lblNewLabel_76);
							 game.map.fields[7][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][6]);
							ds.Display(lblNewLabel_76);
							game.map.fields[7][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_76);
							game.map.fields[7][6].addThing(hole);
							game.map.fields[7][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][6]);
							switchh.Display(lblNewLabel_76);
							game.map.fields[7][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_77.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][7]);
							box.Display(lblNewLabel_77);
							game.map.fields[7][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][7]);
							 wall.Display(lblNewLabel_77);
							 game.map.fields[7][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][7]);
							 worker.Display(lblNewLabel_77);
							 game.map.fields[7][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][7]);
							ds.Display(lblNewLabel_77);
							game.map.fields[7][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_77);
							game.map.fields[7][7].addThing(hole);
							game.map.fields[7][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][7]);
							switchh.Display(lblNewLabel_77);
							game.map.fields[7][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_78.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][8]);
							box.Display(lblNewLabel_78);
							game.map.fields[7][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][8]);
							 wall.Display(lblNewLabel_78);
							 game.map.fields[7][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][8]);
							 worker.Display(lblNewLabel_78);
							 game.map.fields[7][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][8]);
							ds.Display(lblNewLabel_78);
							game.map.fields[7][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_78);
							game.map.fields[7][8].addThing(hole);
							game.map.fields[7][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][8]);
							switchh.Display(lblNewLabel_78);
							game.map.fields[7][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_79.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[7][9]);
							box.Display(lblNewLabel_79);
							game.map.fields[7][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[7][9]);
							 wall.Display(lblNewLabel_79);
							 game.map.fields[7][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[7][9]);
							 worker.Display(lblNewLabel_79);
							 game.map.fields[7][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[7][9]);
							ds.Display(lblNewLabel_79);
							game.map.fields[7][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[7][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_79);
							game.map.fields[7][9].addThing(hole);
							game.map.fields[7][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[7][9]);
							switchh.Display(lblNewLabel_79);
							game.map.fields[7][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_80.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][0]);
							box.Display(lblNewLabel_80);
							game.map.fields[8][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][0]);
							 wall.Display(lblNewLabel_80);
							 game.map.fields[8][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][0]);
							 worker.Display(lblNewLabel_80);
							 game.map.fields[8][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][0]);
							ds.Display(lblNewLabel_80);
							game.map.fields[8][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_80);
							game.map.fields[8][0].addThing(hole);
							game.map.fields[8][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][0]);
							switchh.Display(lblNewLabel_80);
							game.map.fields[8][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_81.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][1]);
							box.Display(lblNewLabel_81);
							game.map.fields[8][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][1]);
							 wall.Display(lblNewLabel_81);
							 game.map.fields[8][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][1]);
							 worker.Display(lblNewLabel_81);
							 game.map.fields[8][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][1]);
							ds.Display(lblNewLabel_81);
							game.map.fields[8][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_81);
							game.map.fields[8][1].addThing(hole);
							game.map.fields[8][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][1]);
							switchh.Display(lblNewLabel_81);
							game.map.fields[8][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_82.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][2]);
							box.Display(lblNewLabel_82);
							game.map.fields[8][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][2]);
							 wall.Display(lblNewLabel_82);
							 game.map.fields[8][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][2]);
							 worker.Display(lblNewLabel_82);
							 game.map.fields[8][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][2]);
							ds.Display(lblNewLabel_82);
							game.map.fields[8][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_82);
							game.map.fields[8][2].addThing(hole);
							game.map.fields[8][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][2]);
							switchh.Display(lblNewLabel_82);
							game.map.fields[8][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_83.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][3]);
							box.Display(lblNewLabel_83);
							game.map.fields[8][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][3]);
							 wall.Display(lblNewLabel_83);
							 game.map.fields[8][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][3]);
							 worker.Display(lblNewLabel_83);
							 game.map.fields[8][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][3]);
							ds.Display(lblNewLabel_83);
							game.map.fields[8][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_83);
							game.map.fields[8][3].addThing(hole);
							game.map.fields[8][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][3]);
							switchh.Display(lblNewLabel_83);
							game.map.fields[8][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_84.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][4]);
							box.Display(lblNewLabel_84);
							game.map.fields[8][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][4]);
							 wall.Display(lblNewLabel_84);
							 game.map.fields[8][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][4]);
							 worker.Display(lblNewLabel_84);
							 game.map.fields[8][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][4]);
							ds.Display(lblNewLabel_84);
							game.map.fields[8][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_84);
							game.map.fields[8][4].addThing(hole);
							game.map.fields[8][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][4]);
							switchh.Display(lblNewLabel_84);
							game.map.fields[8][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_85.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][5]);
							box.Display(lblNewLabel_85);
							game.map.fields[8][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][5]);
							 wall.Display(lblNewLabel_85);
							 game.map.fields[8][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][5]);
							 worker.Display(lblNewLabel_85);
							 game.map.fields[8][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][5]);
							ds.Display(lblNewLabel_85);
							game.map.fields[8][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_85);
							game.map.fields[8][5].addThing(hole);
							game.map.fields[8][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][5]);
							switchh.Display(lblNewLabel_85);
							game.map.fields[8][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_86.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][6]);
							box.Display(lblNewLabel_86);
							game.map.fields[8][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][6]);
							 wall.Display(lblNewLabel_86);
							 game.map.fields[8][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][6]);
							 worker.Display(lblNewLabel_86);
							 game.map.fields[8][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][6]);
							ds.Display(lblNewLabel_86);
							game.map.fields[8][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_86);
							game.map.fields[8][6].addThing(hole);
							game.map.fields[8][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][6]);
							switchh.Display(lblNewLabel_86);
							game.map.fields[8][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_87.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][7]);
							box.Display(lblNewLabel_87);
							game.map.fields[8][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][7]);
							 wall.Display(lblNewLabel_87);
							 game.map.fields[8][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][7]);
							 worker.Display(lblNewLabel_87);
							 game.map.fields[8][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][7]);
							ds.Display(lblNewLabel_87);
							game.map.fields[8][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_87);
							game.map.fields[8][7].addThing(hole);
							game.map.fields[8][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][7]);
							switchh.Display(lblNewLabel_87);
							game.map.fields[8][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_88.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][8]);
							box.Display(lblNewLabel_88);
							game.map.fields[8][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][8]);
							 wall.Display(lblNewLabel_88);
							 game.map.fields[8][8].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][8]);
							 worker.Display(lblNewLabel_88);
							 game.map.fields[8][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][8]);
							ds.Display(lblNewLabel_88);
							game.map.fields[8][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_88);
							game.map.fields[8][8].addThing(hole);
							game.map.fields[8][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][8]);
							switchh.Display(lblNewLabel_88);
							game.map.fields[8][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_89.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[8][9]);
							box.Display(lblNewLabel_89);
							game.map.fields[8][9].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[8][9]);
							 wall.Display(lblNewLabel_89);
							 game.map.fields[8][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[8][9]);
							 worker.Display(lblNewLabel_89);
							 game.map.fields[8][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[8][9]);
							ds.Display(lblNewLabel_89);
							game.map.fields[8][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[8][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_89);
							game.map.fields[8][9].addThing(hole);
							game.map.fields[8][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[8][9]);
							switchh.Display(lblNewLabel_89);
							game.map.fields[8][9].addThing(switchh);
						}	
					}
				});
		lblNewLabel_90.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][0]);
							box.Display(lblNewLabel_90);
							game.map.fields[9][0].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][0]);
							 wall.Display(lblNewLabel_90);
							 game.map.fields[9][0].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][0]);
							 worker.Display(lblNewLabel_90);
							 game.map.fields[9][0].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][0]);
							ds.Display(lblNewLabel_90);
							game.map.fields[9][0].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][0]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_90);
							game.map.fields[9][0].addThing(hole);
							game.map.fields[9][0].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][0]);
							switchh.Display(lblNewLabel_90);
							game.map.fields[9][0].addThing(switchh);
						}	
					}
				});
		lblNewLabel_91.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][1]);
							box.Display(lblNewLabel_91);
							game.map.fields[9][1].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][1]);
							 wall.Display(lblNewLabel_91);
							 game.map.fields[9][1].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][1]);
							 worker.Display(lblNewLabel_91);
							 game.map.fields[9][1].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][1]);
							ds.Display(lblNewLabel_91);
							game.map.fields[9][1].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][1]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_91);
							game.map.fields[9][1].addThing(hole);
							game.map.fields[9][1].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][1]);
							switchh.Display(lblNewLabel_91);
							game.map.fields[9][1].addThing(switchh);
						}	
					}
				});
		lblNewLabel_92.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][2]);
							box.Display(lblNewLabel_92);
							game.map.fields[9][2].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][2]);
							 wall.Display(lblNewLabel_92);
							 game.map.fields[9][2].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][2]);
							 worker.Display(lblNewLabel_92);
							 game.map.fields[9][2].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][2]);
							ds.Display(lblNewLabel_92);
							game.map.fields[9][2].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][2]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_92);
							game.map.fields[9][2].addThing(hole);
							game.map.fields[9][2].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][2]);
							switchh.Display(lblNewLabel_92);
							game.map.fields[9][2].addThing(switchh);
						}	
					}
				});
		lblNewLabel_93.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][3]);
							box.Display(lblNewLabel_93);
							game.map.fields[9][3].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][3]);
							 wall.Display(lblNewLabel_93);
							 game.map.fields[9][3].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][3]);
							 worker.Display(lblNewLabel_93);
							 game.map.fields[9][3].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][3]);
							ds.Display(lblNewLabel_93);
							game.map.fields[9][3].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][3]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_93);
							game.map.fields[9][3].addThing(hole);
							game.map.fields[9][3].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][3]);
							switchh.Display(lblNewLabel_93);
							game.map.fields[9][3].addThing(switchh);
						}	
					}
				});
		lblNewLabel_94.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][4]);
							box.Display(lblNewLabel_94);
							game.map.fields[9][4].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][4]);
							 wall.Display(lblNewLabel_94);
							 game.map.fields[9][4].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][4]);
							 worker.Display(lblNewLabel_94);
							 game.map.fields[9][4].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][4]);
							ds.Display(lblNewLabel_94);
							game.map.fields[9][4].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][4]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_94);
							game.map.fields[9][4].addThing(hole);
							game.map.fields[9][4].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][4]);
							switchh.Display(lblNewLabel_94);
							game.map.fields[9][4].addThing(switchh);
						}	
					}
				});
		lblNewLabel_95.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][5]);
							box.Display(lblNewLabel_95);
							game.map.fields[9][5].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][5]);
							 wall.Display(lblNewLabel_95);
							 game.map.fields[9][5].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][5]);
							 worker.Display(lblNewLabel_95);
							 game.map.fields[9][5].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][5]);
							ds.Display(lblNewLabel_95);
							game.map.fields[9][5].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][5]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_95);
							game.map.fields[9][5].addThing(hole);
							game.map.fields[9][5].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][5]);
							switchh.Display(lblNewLabel_95);
							game.map.fields[9][5].addThing(switchh);
						}	
					}
				});
		lblNewLabel_96.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][6]);
							box.Display(lblNewLabel_96);
							game.map.fields[9][6].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][6]);
							 wall.Display(lblNewLabel_96);
							 game.map.fields[9][6].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][6]);
							 worker.Display(lblNewLabel_96);
							 game.map.fields[9][6].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][6]);
							ds.Display(lblNewLabel_96);
							game.map.fields[9][6].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][6]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_96);
							game.map.fields[9][6].addThing(hole);
							game.map.fields[9][6].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][6]);
							switchh.Display(lblNewLabel_96);
							game.map.fields[9][6].addThing(switchh);
						}	
					}
				});
		lblNewLabel_97.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][7]);
							box.Display(lblNewLabel_97);
							game.map.fields[9][7].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][7]);
							 wall.Display(lblNewLabel_97);
							 game.map.fields[9][7].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][7]);
							 worker.Display(lblNewLabel_97);
							 game.map.fields[9][7].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][7]);
							ds.Display(lblNewLabel_97);
							game.map.fields[9][7].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][7]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_97);
							game.map.fields[9][7].addThing(hole);
							game.map.fields[9][7].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][7]);
							switchh.Display(lblNewLabel_97);
							game.map.fields[9][7].addThing(switchh);
						}	
					}
				});
		lblNewLabel_98.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][8]);
							box.Display(lblNewLabel_98);
							game.map.fields[9][8].addThing(box);game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][8]);
							 wall.Display(lblNewLabel_98);
							 game.map.fields[9][8].addThing(wall); game.WArray.add(wall); 
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][8]);
							 worker.Display(lblNewLabel_98);
							 game.map.fields[9][8].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][8]);
							ds.Display(lblNewLabel_98);
							game.map.fields[9][8].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][8]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_98);
							game.map.fields[9][8].addThing(hole);
							game.map.fields[9][8].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
											
							Switch switchh = new Switch(hole , game.map.fields[9][8]);
							switchh.Display(lblNewLabel_98);
							game.map.fields[9][8].addThing(switchh);
						}	
					}
				});
		lblNewLabel_99.addMouseListener(new MouseAdapter() {
					@Override
					
					public void mouseClicked(MouseEvent e) {
						
						if(previousButton == btnAddBox) {
							Box box = new Box(game.map.fields[9][9]);
							box.Display(lblNewLabel_99);
							game.map.fields[9][9].addThing(box);	game.BoxArray.add(box);
						}
						if(previousButton == btnAddWall) {
							 Wall wall = new Wall(game.map.fields[9][9]);
							 wall.Display(lblNewLabel_99);
							 game.map.fields[9][9].addThing(wall); game.WArray.add(wall);
						}
						if(previousButton == btnAddWorker) {
							 game.addPlayer(new Player(playerIndex));
							 Worker worker = new Worker(game.players.get(playerIndex), game.map.fields[9][9]);
							 worker.Display(lblNewLabel_99);
							 game.map.fields[9][9].addThing(worker);
	                                      game.players.get(playerIndex).SetWorker(worker); 
							 playerIndex++;
							 
						}
						
						if(previousButton == btnAddDesignatedsquare){
							DesignatedSquare ds = new DesignatedSquare(game.map.fields[9][9]);
							ds.Display(lblNewLabel_99);
							game.map.fields[9][9].addThing(ds); game.checksum=game.checksum+5; game.DsArray.add(ds);
						}
						if(previousButton == btnAddHole){
							Hole hole = new Hole(game.map.fields[9][9]);
							hole.previous = hole; holes.add(hole);  hole.Display(lblNewLabel_99);
							game.map.fields[9][9].addThing(hole);
							game.map.fields[9][9].addThing(hole);
						}
						if(previousButton == btnAddSwitch){
							Hole hole = null; if(holes.size() != 0){  hole = holes.get(0); } holes.remove(0);
							Switch switchh = new Switch(hole , game.map.fields[9][9]);
							switchh.Display(lblNewLabel_99);
							game.map.fields[9][9].addThing(switchh);
						}	
					}
				});




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
}
