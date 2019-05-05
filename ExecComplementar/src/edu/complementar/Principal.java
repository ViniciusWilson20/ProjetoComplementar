package edu.complementar;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Principal {
	private static String arquivo = "Clientes.txt";

	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Janela j = new Janela();
	}

	public static class Cliente {

		private String _nome;
		private String _dataN;
		private String _rg;
		private String _cpf;
		private String _telefone;
		private String _logradouro;
		private String _numero;
		private String _complemento;
		private String _cep;
		private String _bairro;
		private String _cidade;
		private String _uf;
		private String _email;

		public String get_nome() {
			return _nome;
		}
		public void set_nome(String _nome) {
			this._nome = _nome;
		}
		public String get_dataN() {
			return _dataN;
		}
		public void set_dataN(String _dataN) {
			this._dataN = _dataN;
		}
		public String get_rg() {
			return _rg;
		}
		public void set_rg(String _rg) {
			this._rg = _rg;
		}
		public String get_cpf() {
			return _cpf;
		}
		public void set_cpf(String _cpf) {
			this._cpf = _cpf;
		}
		public String get_telefone() {
			return _telefone;
		}
		public void set_telefone(String _telefone) {
			this._telefone = _telefone;
		}
		public String get_logradouro() {
			return _logradouro;
		}
		public void set_logradouro(String _logradouro) {
			this._logradouro = _logradouro;
		}
		public String get_numero() {
			return _numero;
		}
		public String get_complemento() {
			return _complemento;
		}
		public void set_complemento(String _complemento) {
			this._complemento = _complemento;
		}
		public String get_bairro() {
			return _bairro;
		}
		public void set_bairro(String _bairro) {
			this._bairro = _bairro;
		}
		public void set_numero(String _numero) {
			this._numero = _numero;
		}
		public String get_cep() {
			return _cep;
		}
		public void set_cep(String _cep) {
			this._cep = _cep;
		}
		public String get_cidade() {
			return _cidade;
		}
		public void set_cidade(String _cidade) {
			this._cidade = _cidade;
		}
		public String get_uf() {
			return _uf;
		}
		public void set_uf(String _uf) {
			this._uf = _uf;
		}
		public String get_email() {
			return _email;
		}
		public void set_email(String _email) {
			this._email = _email;
		}
	}

	public static class Janela implements ActionListener {

		private JFrame tela;
		private JPanel painel;
		private JLabel lblTitulo;
		private JLabel lblNome;
		private JTextField txtNome;
		private JLabel lblData;
		private JTextField txtData;
		private JLabel lblRG;
		private JTextField txtRG;
		private JLabel lblCPF;
		private JTextField txtCPF;
		private JLabel lblTelefone;
		private JTextField txtTelefone;
		private JLabel lblLogradouro;
		private JTextField txtLogradouro;
		private JLabel lblNumero;
		private JTextField txtNumero;
		private JLabel lblComplemento;
		private JComboBox<String> cmbComplemento;
		private JLabel lblCEP;
		private JTextField txtCEP;
		private JLabel lblBairro;
		private JTextField txtBairro;
		private JLabel lblCidade;
		private JTextField txtCidade;
		private JLabel lblUF;
		private JComboBox<String> cmbUF;
		private JLabel lblEmail;
		private JTextField txtEmail;
		private JButton btnInserir;
		private JButton btnLimpar;
		private JButton btnMostrar;

		private Cliente c;
		ClienteDao dao = new ClienteDao();

		public Janela() {

			tela = new JFrame("Formulário de Cadastro");
			tela.setSize(500, 540);
			tela.setResizable(false);
			tela.setLocationRelativeTo(null);
			// -------------------------------------------
			painel = new JPanel();
			painel.setLayout(null);
			painel.setOpaque(true);
			tela.setContentPane(painel);
			// -------------------------------------------
			lblTitulo = new JLabel("Cadastro de Clientes");
			lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
			lblTitulo.setForeground(new Color(28, 67, 114));
			lblTitulo.setSize(300, 30);
			lblTitulo.setLocation(100, 50);
			painel.add(lblTitulo);
			// --------------------------------------------
			lblNome = new JLabel("Nome: ");
			lblNome.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNome.setForeground(Color.BLACK);
			lblNome.setSize(100, 20);
			lblNome.setLocation(100, 100);
			painel.add(lblNome);
			// -------------------------------------------
			txtNome = new JTextField();
			txtNome.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtNome.setSize(200, 27);
			txtNome.setLocation(150, 98);
			painel.add(txtNome);
			// -------------------------------------------
			lblData = new JLabel("Data Nascimento: ");
			lblData.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblData.setForeground(Color.BLACK);
			lblData.setSize(150, 20);
			lblData.setLocation(30, 125);
			painel.add(lblData);
			// -------------------------------------------
			txtData = new JTextField();
			txtData.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtData.setSize(200, 27);
			txtData.setLocation(150, 123);
			painel.add(txtData);
			// -------------------------------------------
			lblRG = new JLabel("RG: ");
			lblRG.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblRG.setForeground(Color.BLACK);
			lblRG.setSize(40, 20);
			lblRG.setLocation(120, 150);
			painel.add(lblRG);
			// -------------------------------------------
			txtRG = new JTextField();
			txtRG.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtRG.setSize(200, 27);
			txtRG.setLocation(150, 148);
			painel.add(txtRG);
			// -------------------------------------------
			lblCPF = new JLabel("CPF: ");
			lblCPF.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblCPF.setForeground(Color.BLACK);
			lblCPF.setSize(40, 20);
			lblCPF.setLocation(115, 175);
			painel.add(lblCPF);
			// -------------------------------------------
			txtCPF = new JTextField();
			txtCPF.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtCPF.setSize(200, 27);
			txtCPF.setLocation(150, 173);
			painel.add(txtCPF);
			// -------------------------------------------
			lblTelefone = new JLabel("Telefone: ");
			lblTelefone.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblTelefone.setForeground(Color.BLACK);
			lblTelefone.setSize(100, 20);
			lblTelefone.setLocation(85, 200);
			painel.add(lblTelefone);
			// -------------------------------------------
			txtTelefone = new JTextField();
			txtTelefone.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtTelefone.setSize(200, 27);
			txtTelefone.setLocation(150, 198);
			painel.add(txtTelefone);
			// -------------------------------------------
			lblLogradouro = new JLabel("Logradouro: ");
			lblLogradouro.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblLogradouro.setForeground(Color.BLACK);
			lblLogradouro.setSize(100, 20);
			lblLogradouro.setLocation(66, 225);
			painel.add(lblLogradouro);
			// --------------------------------------------
			txtLogradouro = new JTextField();
			txtLogradouro.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtLogradouro.setSize(200, 27);
			txtLogradouro.setLocation(150, 223);
			painel.add(txtLogradouro);
			// --------------------------------------------
			lblNumero = new JLabel("Numero: ");
			lblNumero.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblNumero.setForeground(Color.BLACK);
			lblNumero.setSize(100, 20);
			lblNumero.setLocation(90, 250);
			painel.add(lblNumero);
			// --------------------------------------------
			txtNumero = new JTextField();
			txtNumero.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtNumero.setSize(200, 27);
			txtNumero.setLocation(150, 248);
			painel.add(txtNumero);
			// --------------------------------------------
			lblComplemento = new JLabel("Complemento: ");
			lblComplemento.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblComplemento.setForeground(Color.BLACK);
			lblComplemento.setSize(100, 20);
			lblComplemento.setLocation(52, 275);
			painel.add(lblComplemento);
			// --------------------------------------------
			cmbComplemento = new JComboBox<>();
			cmbComplemento.setFont(new Font("Verdana", Font.ITALIC, 12));
			cmbComplemento.setSize(200, 27);
			cmbComplemento.setLocation(150, 273);
			cmbComplemento.insertItemAt("Casa" , 0);
			cmbComplemento.insertItemAt("Apartamento" , 1);
			cmbComplemento.insertItemAt("Pousada" , 2);
			painel.add(cmbComplemento);
			//---------------------------------------------
			lblCEP = new JLabel("CEP: ");
			lblCEP.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblCEP.setForeground(Color.BLACK);
			lblCEP.setSize(40, 20);
			lblCEP.setLocation(115, 300);
			painel.add(lblCEP);
			// --------------------------------------------
			txtCEP = new JTextField();
			txtCEP.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtCEP.setSize(200, 27);
			txtCEP.setLocation(150, 298);
			painel.add(txtCEP);
			// --------------------------------------------
			lblBairro = new JLabel("Bairro: ");
			lblBairro.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblBairro.setForeground(Color.BLACK);
			lblBairro.setSize(80, 20);
			lblBairro.setLocation(103, 325);
			painel.add(lblBairro);
			//---------------------------------------------
			txtBairro = new JTextField();
			txtBairro.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtBairro.setSize(200, 27);
			txtBairro.setLocation(150, 323);
			painel.add(txtBairro);
			// --------------------------------------------
			lblCidade = new JLabel("Cidade: ");
			lblCidade.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblCidade.setForeground(Color.BLACK);
			lblCidade.setSize(90, 20);
			lblCidade.setLocation(97, 350);
			painel.add(lblCidade);
			// --------------------------------------------
			txtCidade = new JTextField();
			txtCidade.setFont(new Font("Verdana", Font.ITALIC, 12));
			txtCidade.setSize(200, 27);
			txtCidade.setLocation(150, 348);
			painel.add(txtCidade);
			// --------------------------------------------
			lblUF = new JLabel("UF: ");
			lblUF.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblUF.setForeground(Color.BLACK);
			lblUF.setSize(40, 20);
			lblUF.setLocation(125, 375);
			painel.add(lblUF);
			// --------------------------------------------
			cmbUF = new JComboBox<>();
			cmbUF.setFont(new Font("Verdana", Font.ITALIC, 12));
			cmbUF.setSize(200, 27);
			cmbUF.setLocation(150, 373);
			cmbUF.insertItemAt("AC", 0);
			cmbUF.insertItemAt("AP", 1);
			cmbUF.insertItemAt("AM", 2);
			cmbUF.insertItemAt("BA", 3);
			cmbUF.insertItemAt("CE", 4);
			cmbUF.insertItemAt("DF", 5);
			cmbUF.insertItemAt("ES", 6);
			cmbUF.insertItemAt("GO", 7);
			cmbUF.insertItemAt("MT", 8);
			cmbUF.insertItemAt("MS", 9);
			cmbUF.insertItemAt("MG", 10);
			cmbUF.insertItemAt("PA", 11);
			cmbUF.insertItemAt("PB", 12);
			cmbUF.insertItemAt("PR", 13);
			cmbUF.insertItemAt("PE", 14);
			cmbUF.insertItemAt("PI", 15);
			cmbUF.insertItemAt("SP", 16);
			cmbUF.insertItemAt("SC", 17);
			cmbUF.insertItemAt("RN", 18);
			cmbUF.insertItemAt("RS", 19);
			cmbUF.insertItemAt("RO", 20);
			cmbUF.insertItemAt("RR", 21);
			cmbUF.insertItemAt("SP", 22);
			cmbUF.insertItemAt("SC", 23);
			cmbUF.insertItemAt("SE", 24);
			cmbUF.insertItemAt("TO", 25);
			painel.add(cmbUF);
			// --------------------------------------------
			lblEmail = new JLabel("Email: ");
			lblEmail.setFont(new Font("Verdana", Font.PLAIN, 12));
			lblEmail.setForeground(Color.BLACK);
			lblEmail.setSize(50, 27);
			lblEmail.setLocation(108, 400);
			painel.add(lblEmail);
			// --------------------------------------------
			txtEmail = new JTextField();
			txtEmail.setFont(new Font("Verdana", Font.PLAIN, 12));
			txtEmail.setSize(200, 27);
			txtEmail.setLocation(150, 398);
			painel.add(txtEmail);
			// --------------------------------------------
			btnInserir = new JButton("Inserir");
			btnInserir.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnInserir.setSize(100, 28);
			btnInserir.setLocation(370, 168);
			btnInserir.addActionListener(this);
			painel.add(btnInserir);
			// --------------------------------------------
			btnLimpar = new JButton("Limpar");
			btnLimpar.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnLimpar.setSize(100, 28);
			btnLimpar.setLocation(370, 200);
			btnLimpar.addActionListener(this);
			painel.add(btnLimpar);
			// --------------------------------------------
			btnMostrar = new JButton("Mostrar");
			btnMostrar.setFont(new Font("Verdana", Font.PLAIN, 12));
			btnMostrar.setSize(100, 28);
			btnMostrar.setLocation(370, 230);
			btnMostrar.addActionListener(this);
			painel.add(btnMostrar);
			// --------------------------------------------
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setVisible(true);
		}

		public void resetarCampos() {
			txtNome.setText(null);
			txtData.setText(null);
			txtRG.setText(null);
			txtCPF.setText(null);
			txtTelefone.setText(null);
			txtLogradouro.setText(null);
			txtNumero.setText(null);
			txtCEP.setText(null);
			txtBairro.setText(null);
			txtCidade.setText(null);
			cmbComplemento.setSelectedIndex(-1);
			cmbUF.setSelectedIndex(-1);
			txtEmail.setText(null);
			txtNome.grabFocus();
		}
		@Override
		public void actionPerformed(ActionEvent e) {

			c = new Cliente();
			c.set_nome(txtNome.getText());
			c.set_dataN(txtData.getText());
			c.set_rg(txtRG.getText());
			c.set_cpf(txtCPF.getText());
			c.set_telefone(txtTelefone.getText());
			c.set_logradouro(txtLogradouro.getText());
			c.set_numero(txtNumero.getText());	
			c.set_cep(txtCEP.getText());
			c.set_bairro(txtBairro.getText());
			c.set_cidade(txtCidade.getText());
			try {
				c.set_complemento(cmbComplemento.getSelectedItem().toString());
				c.set_uf(cmbUF.getSelectedItem().toString());
			} catch (Exception erro) {
			}
			c.set_email(txtEmail.getText());

			if (btnInserir == e.getSource()) {
				if (c.get_nome().isEmpty() || c.get_telefone().isEmpty() 
						|| c.get_rg().isEmpty()         || c.get_cpf().isEmpty() 
						|| c.get_logradouro().isEmpty() || c.get_numero().isEmpty()
						|| c.get_complemento().isEmpty()|| c.get_cep().isEmpty() 
						|| c.get_bairro().isEmpty()     || c.get_cidade().isEmpty() 
						|| c.get_uf().isEmpty()         || c.get_email().isEmpty()) {

					JOptionPane.showMessageDialog(null, 
							"Ainda Faltam Campos a Serem Inseridos",
							"Dados Não Cadastrados", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						dao.adicionar_cliente(c);
						dao.gravarCliente(c);
						JOptionPane.showMessageDialog(null, 
								"Um Novo Cliente foi Inserido: " 
								+ "\nNome: " + c.get_nome()
								+ "\nData de Nascimento: : " + c.get_dataN().toString() 
								+ "\nRG: " + c.get_rg()
								+ "\nCPF: " + c.get_cpf() 
								+ "\nTelefone: " + c.get_telefone() 
								+ "\nLogradouro: "+ c.get_logradouro() 
								+ "\nNumero: " + c.get_numero() 
								+ "\nComplemento: " + c.get_complemento()
								+ "\nCep: " + c.get_cep()
								+ "\nBairro: " + c.get_bairro()
								+ "\nCidade: " + c.get_cidade() 
								+ "\nUF: " + c.get_uf() 
								+ "\nEmail: " + c.get_email(),
								"Cadastro Efetuado com Sucesso!", JOptionPane.INFORMATION_MESSAGE);
						resetarCampos();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			} else if (btnLimpar == e.getSource()) {
				resetarCampos();
			} else if (btnMostrar == e.getSource()) {
				try {
					dao.lerCliente(c);
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public static class ClienteDao {

		List<Cliente> clientela = new ArrayList<>();

		public void gravarCliente(Cliente cli) throws IOException {

			BufferedWriter write = new BufferedWriter(new FileWriter(arquivo));

			for (Cliente c : clientela) {
				write.write(c.get_nome());
				write.newLine();
				write.write(c.get_dataN().toString());
				write.newLine();
				write.write(c.get_rg());
				write.newLine();
				write.write(c.get_cpf());
				write.newLine();
				write.write(c.get_telefone());
				write.newLine();
				write.write(c.get_logradouro());
				write.newLine();
				write.write(c.get_numero());
				write.newLine();
				write.write(c.get_complemento());
				write.newLine();
				write.write(c.get_cep());
				write.newLine();
				write.write(c.get_bairro());
				write.newLine();
				write.write(c.get_cidade());
				write.newLine();
				write.write(c.get_uf());
				write.newLine();
				write.write(c.get_email());
				write.newLine();
			}
			write.close();
		}

		public void adicionar_cliente(Cliente cli) {
			clientela.add(cli);
		}

		public void lerCliente(Cliente cli) throws IOException {

			BufferedReader read = new BufferedReader(new FileReader(arquivo));
			for (Cliente c : clientela) {
				c.set_nome(read.readLine());
				c.set_dataN(read.readLine());
				c.set_rg(read.readLine());
				c.set_cpf(read.readLine());
				c.set_telefone(read.readLine());
				c.set_logradouro(read.readLine());
				c.set_numero(read.readLine());
				c.set_complemento(read.readLine());
				c.set_cep(read.readLine());
				c.set_bairro(read.readLine());
				c.set_cidade(read.readLine());
				c.set_uf(read.readLine());
				c.set_email(read.readLine());
			}
			File arq = new File(arquivo);
			Desktop desk = Desktop.getDesktop();
			desk.open(arq);
			read.close();
		}
	}
}
