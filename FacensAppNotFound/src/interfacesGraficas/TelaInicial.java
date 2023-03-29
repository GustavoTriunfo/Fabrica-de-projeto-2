package interfacesGraficas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.time.LocalTime;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInicial.class.getResource("/imagensMapa/FacensLogo.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Fundo = new JLabel("");
		Fundo.setIcon(new ImageIcon(TelaInicial.class.getResource("/telaInicial/fundoTelaInicialDiurno (1).jpg")));
		
		LocalTime myObj = LocalTime.now();
		if(myObj.getHour() < 8){
			Fundo.setIcon(new ImageIcon(TelaInicial.class.getResource("/telaInicial/fundoTelaInicialDiurno (1).jpg")));
		}
		else {
			Fundo.setIcon(new ImageIcon(TelaInicial.class.getResource("/telaInicial/fundoTelaInicialNoturno.jpg")));
		}
		
		JLabel nivelAcessoLabel = new JLabel("Nível de Acesso: Estudante");
		nivelAcessoLabel.setForeground(new Color(255, 255, 255));
		nivelAcessoLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		nivelAcessoLabel.setBounds(10, 10, 437, 78);
		contentPane.add(nivelAcessoLabel);
		
		JLabel Icone = new JLabel("");
		Icone.setIcon(new ImageIcon(TelaInicial.class.getResource("/telaInicial/studentIcon.png")));
		Icone.setBounds(-44, 386, 615, 512);
		contentPane.add(Icone);
		
		JButton btnVagasEstacionamento = new JButton("Vagas Estacionamento");
		btnVagasEstacionamento.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVagasEstacionamento.setBounds(617, 253, 338, 68);
		contentPane.add(btnVagasEstacionamento);
		
		JButton aulasButton = new JButton("Aulas");
		aulasButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		aulasButton.setBounds(617, 342, 338, 68);
		contentPane.add(aulasButton);
		
		JButton mapaButton = new JButton("Mapa");
		mapaButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		mapaButton.setBounds(617, 432, 338, 68);
		contentPane.add(mapaButton);
		Fundo.setBounds(-21, -27, 1920, 1080);
		contentPane.add(Fundo);
		}
		
		
	}


