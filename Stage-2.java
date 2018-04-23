import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Stage_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stage_2 window = new Stage_2();
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
	public Stage_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel label = new JLabel("Species");
		label.setBounds(20, 21, 92, 26);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Starting Population");
		lblNewLabel.setBounds(20, 61, 184, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel = new JLabel("Generations");
		lblNewLabel.setBounds(20, 101, 125, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel = new JLabel("Growth Rate (%)");
		lblNewLabel.setBounds(20, 141, 184, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnFixed = new JRadioButton("Fixed");
		rdbtnFixed.setBounds(20, 181, 201, 35);
		frame.getContentPane().add(rdbtnFixed);
		
		JRadioButton rdbtnVariable = new JRadioButton("Variable");
		rdbtnVariable.setBounds(20, 221, 201, 35);
		frame.getContentPane().add(rdbtnVariable);
		
		JLabel lblHabitat = new JLabel("Habitat");
		lblHabitat.setBounds(420, 21, 92, 26);
		frame.getContentPane().add(lblHabitat);
		
		JLabel lblFinalPopulation = new JLabel("Final Population");
		lblFinalPopulation.setBounds(420, 61, 184, 26);
		frame.getContentPane().add(lblFinalPopulation);
		
		textField = new JTextField();
		textField.setBounds(101, 18, 209, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 58, 85, 32);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 98, 85, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(514, 18, 209, 32);
		frame.getContentPane().add(textField_3);
	}
}
