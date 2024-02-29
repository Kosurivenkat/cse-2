import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DETECT {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DETECT window = new DETECT();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DETECT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("loginpagewith db connection");
		lblNewLabel.setBounds(146, 23, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb2 = new JLabel("id");
		tb2.setBounds(87, 119, 46, 14);
		frame.getContentPane().add(tb2);
		
		JButton sb = new JButton("submit");
		sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb1 = new JTextField();
				tb1.set Bounds(144,82,96,19);
				frame.getContentPane().add(tb1);
				tb1.setColumns(10);
				JButton btnNewButton = new JButton("login");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionperformed(ActionEvent e) {
						String name=tb1.get Text();
						String password = p1.get text();
						
					}
				}
			
			}
		});
		sb.setBounds(214, 214, 89, 23);
		frame.getContentPane().add(sb);
		
		textField = new JTextField();
		textField.setBounds(168, 70, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 113, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel tb1 = new JLabel("user name");
		tb1.setBackground(new Color(255, 255, 255));
		tb1.setBounds(76, 73, 82, 14);
		frame.getContentPane().add(tb1);
		
		JButton button = new JButton("New button");
		button.setBounds(214, 214, 89, 23);
		frame.getContentPane().add(button);
	}
}
