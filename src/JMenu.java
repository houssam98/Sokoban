import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class JMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
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
	
	public JMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 364);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(0, 49, 434, 266);
		panel.add(lblNewLabel);
		ImageIcon img = new ImageIcon("images/sokoban.jpg");
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(newimg));
		
		JButton btnLoad = new JButton("LOAD EXISTING MAP");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game game = LoadGame();
				JPlay play = new JPlay(game);
				play.setVisible(true);
			}
		});


		btnLoad.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		btnLoad.setForeground(new Color(255, 255, 255));
		btnLoad.setBackground(new Color(0, 128, 128));
		btnLoad.setBounds(0, 0, 434, 49);
		btnLoad.setFocusPainted(false);
		panel.add(btnLoad);
		
		JButton btnCreate = new JButton("CREATE NEW MAP");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JBuilder jbuild = new JBuilder();
			jbuild.setVisible(true);
			}
		});
		btnCreate.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		btnCreate.setForeground(new Color(255, 255, 255));
		btnCreate.setBackground(new Color(0, 128, 128));
		btnCreate.setBounds(0, 315, 434, 49);
		btnCreate.setFocusPainted(false);
		panel.add(btnCreate);
		
	}
}
