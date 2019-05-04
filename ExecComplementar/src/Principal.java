import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal {
	
	private static JFrame tela; 
	private static JPanel painel; 
	private static JLabel lblTitulo; 
	private static JLabel lblNome; 
	private static JLabel lblData; 
	
	public static void main(String[] args) {
		Frame();
	}
	public static void Frame() {
	
		tela = new JFrame("Principal");
		tela.setSize(500, 400);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		//-------------------------------------------
		painel = new JPanel();
		painel.setLayout(null);
		painel.setOpaque(true);
		tela.setContentPane(painel);
		//-------------------------------------------
		lblTitulo = new JLabel("Cadastro de Clientes");
		lblTitulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblTitulo.setForeground(new Color(28, 67, 114));
		lblTitulo.setSize(220, 30);
		lblTitulo.setLocation(140, 50);
		painel.add(lblTitulo);
		//--------------------------------------------
		lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNome.setForeground(Color.BLACK);
		lblNome.setSize(100, 20);
		lblNome.setLocation(100, 100);
		painel.add(lblNome);
		//-------------------------------------------
	
		
		
		
		
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		
	}
}
