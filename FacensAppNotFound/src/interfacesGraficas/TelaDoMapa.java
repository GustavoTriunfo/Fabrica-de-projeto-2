package interfacesGraficas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import operacoes.OperacoesMapa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaDoMapa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoMapa frame = new TelaDoMapa();
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
	public TelaDoMapa() {
		setUndecorated(true);
		setResizable(false);
		setForeground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaDoMapa.class.getResource("/imagensMapa/FacensLogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel menuDireita = new JLabel("");
		JLabel cabecalho = new JLabel("");
		JLabel trajeto1 = new JLabel("");
		cabecalho.setVisible(false);
		
		JLabel rotasButton = new JLabel("");
		rotasButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				definirRota(trajeto1);
			}
		});
		rotasButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rotasButton.setVisible(false);
		
		JLabel profileButton = new JLabel("");
		profileButton.setVisible(false);
		profileButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 JOptionPane.showMessageDialog(null,"Informações do usuário: como RA, nome completo...");  
			}
		});
		
		JLabel iconesMapa = new JLabel("");
		iconesMapa.setVisible(false);
		iconesMapa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(menuDireita.isVisible()) {
					menuDireita.setVisible(false);
				}else {
				menuDireita.setVisible(true);
				}
			}
		});
		iconesMapa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconesMapa.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/imagensMapa/iconesMapa.png")));
		iconesMapa.setBounds(999, 10, 80, 80);
		contentPane.add(iconesMapa);
		
		
		trajeto1.setVisible(false);
		trajeto1.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/rotas/Trajeto1.png")));
		trajeto1.setBounds(-271, -11, 1036, 918);
		contentPane.add(trajeto1);
		profileButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		profileButton.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/imagensMapa/profileIcone.png")));
		profileButton.setBounds(775, 10, 80, 80);
		contentPane.add(profileButton);
		rotasButton.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/imagensMapa/rotaIcone.png")));
		rotasButton.setBounds(1249, 10, 93, 80);
		contentPane.add(rotasButton);
		
		JLabel cabecalhoButton = new JLabel("");
		cabecalhoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(cabecalho.isVisible()) {
					cabecalho.setVisible(false);
					rotasButton.setVisible(false);
					menuDireita.setVisible(false);
					profileButton.setVisible(false);
					iconesMapa.setVisible(false);
				}else {
					cabecalho.setVisible(true);
					rotasButton.setVisible(true);
					profileButton.setVisible(true);
					iconesMapa.setVisible(true);
				}
			}
		});
		
		
		cabecalhoButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cabecalhoButton.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/imagensMapa/menuIcone1.png")));
		cabecalhoButton.setBounds(1457, 16, 60, 60);
		contentPane.add(cabecalhoButton);
		cabecalho.setBackground(new Color(63, 63, 63));
		cabecalho.setOpaque(true);
		cabecalho.setBounds(698, -52, 881, 150);
		contentPane.add(cabecalho);
		
		
		menuDireita.setVisible(false);
		menuDireita.setOpaque(true);
		menuDireita.setBackground(new Color(0, 0, 125));
		menuDireita.setBounds(1341, 86, 237, 821);
		contentPane.add(menuDireita);
		
		JLabel mapa = new JLabel("");
		mapa.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/imagensMapa/mapaFacens (1).png")));
		mapa.setBounds(-260, -11, 1839, 918);
		contentPane.add(mapa);
	}
	public static void definirRota(JLabel trajeto)
	{
		trajeto.setVisible(true);
		trajeto.setIcon(new ImageIcon(TelaDoMapa.class.getResource("/rotas/Trajeto1.png")));
	}
}
