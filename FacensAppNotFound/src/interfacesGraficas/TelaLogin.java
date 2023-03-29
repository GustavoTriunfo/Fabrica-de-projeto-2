package interfacesGraficas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField senhaField;
	private JTextField usuarioField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/imagensMapa/FacensLogo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logoFacens = new JLabel("");
		logoFacens.setIcon(new ImageIcon(TelaLogin.class.getResource("/telaLogin/facensLogo (1).png")));
		logoFacens.setBounds(78, 30, 504, 142);
		contentPane.add(logoFacens);
		
		JButton loginButton = new JButton("Fazer Login");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!usuarioField.getText().equals("") && !senhaField.getText().equals("")) {
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Algum dos campos obrigatórios está vazio!",
				               "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		loginButton.setBounds(1222, 697, 221, 62);
		contentPane.add(loginButton);
		
		JLabel loginTitulo = new JLabel(" Login");
		loginTitulo.setForeground(new Color(255, 255, 255));
		loginTitulo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 45));
		loginTitulo.setBounds(1250, 416, 145, 73);
		contentPane.add(loginTitulo);
		
		JLabel lblRa = new JLabel("Usuário:");
		lblRa.setForeground(new Color(255, 255, 255));
		lblRa.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 33));
		lblRa.setBounds(1040, 506, 145, 73);
		contentPane.add(lblRa);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 33));
		lblSenha.setBounds(1066, 589, 145, 73);
		contentPane.add(lblSenha);
		
		senhaField = new JPasswordField();
		senhaField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		senhaField.setBounds(1182, 603, 309, 52);
		contentPane.add(senhaField);
		
		usuarioField = new JTextField();
		usuarioField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		usuarioField.setBounds(1182, 516, 309, 52);
		contentPane.add(usuarioField);
		usuarioField.setColumns(10);
		
		JLabel fundoTexto = new JLabel("");
		fundoTexto.setBackground(new Color(0, 0, 64));
		fundoTexto.setOpaque(true);
		fundoTexto.setBounds(1023, 388, 556, 692);
		contentPane.add(fundoTexto);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon(TelaLogin.class.getResource("/telaLogin/foto-aerea-facens.jpg")));
		imagemFundo.setBounds(0, 0, 1920, 1080);
		contentPane.add(imagemFundo);
	}
}
