package Interface1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class teste extends JFrame {

	private JPanel contentPane;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
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
	public teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Odonto Sena");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 32));
		lblNewLabel.setBounds(193, 11, 258, 84);
		contentPane.add(lblNewLabel);
		
		senha = new JPasswordField();
		senha.setBounds(252, 211, 135, 20);
		contentPane.add(senha);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(158, 199, 87, 33);
		contentPane.add(lblNewLabel_1);
		
		JTextArea login = new JTextArea();
		login.setBounds(252, 168, 133, 22);
		contentPane.add(login);
		
		JLabel lblNewLabel_2 = new JLabel("Login:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(158, 160, 87, 28);
		contentPane.add(lblNewLabel_2);
		
		JButton btnBotao = new JButton("Acessar");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setText("Olá");
			
				
			}
		});
		btnBotao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBotao.setBounds(266, 270, 89, 23);
		contentPane.add(btnBotao);
	}
}
