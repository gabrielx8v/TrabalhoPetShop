package trabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Consultasveterinarias {

	private JFrame frame;
	private JTextField textFieldCliente;
	private JTextField textFieldSobrenome;
	private JTextField textFieldTelefone;
	private JTextField textFieldNomePet;
	private JTextField textFieldSexoPet;
	private JTextField textFieldIdadePet;
	private JTextField textFieldAno;
	private JTextField textFieldMes;
	private JTextField textFieldDia;
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
					Consultasveterinarias window = new Consultasveterinarias();
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
	public Consultasveterinarias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNavegar = new JMenu("Navegar");
		menuBar.add(mnNavegar);
		
		JMenuItem mntmGerenciarUsurios = new JMenuItem("Gerenciar Usu\u00E1rios");
		mnNavegar.add(mntmGerenciarUsurios);
		
		JMenuItem mntmGrenciarPets = new JMenuItem("Grenciar Pets");
		mnNavegar.add(mntmGrenciarPets);
		
		JMenuItem mntmGrenciarConsultas = new JMenuItem("Grenciar Consultas");
		mnNavegar.add(mntmGrenciarConsultas);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel PagInicial = new JPanel();
		panel.add(PagInicial, "name_1216047870691100");
		PagInicial.setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo!");
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblBemVindo.setBounds(128, 88, 188, 33);
		PagInicial.add(lblBemVindo);
		
		JLabel lblBomTrabalho = new JLabel("Bom Trabalho!");
		lblBomTrabalho.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBomTrabalho.setHorizontalAlignment(SwingConstants.CENTER);
		lblBomTrabalho.setBounds(145, 132, 154, 14);
		PagInicial.add(lblBomTrabalho);
		
		JPanel Clientes = new JPanel();
		panel.add(Clientes, "name_1215724276807700");
		Clientes.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 295, 20);
		Clientes.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(315, 10, 89, 23);
		Clientes.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 395, 194);
		Clientes.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel Pets = new JPanel();
		panel.add(Pets, "name_1215728201922200");
		Pets.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 12, 295, 20);
		Pets.add(textField_2);
		
		JButton button = new JButton("Listar");
		button.setBounds(315, 11, 89, 23);
		Pets.add(button);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 44, 395, 195);
		Pets.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JPanel Consultas = new JPanel();
		panel.add(Consultas, "name_1215731004926500");
		Consultas.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 12, 295, 20);
		Consultas.add(textField_3);
		
		JButton button_1 = new JButton("Listar");
		button_1.setBounds(315, 11, 89, 23);
		Consultas.add(button_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 38, 394, 201);
		Consultas.add(scrollPane_2);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		
		JPanel GerClientes = new JPanel();
		panel.add(GerClientes, "name_1216783068392000");
		GerClientes.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 56, 73, 20);
		GerClientes.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 88, 73, 20);
		GerClientes.add(lblSobrenome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 120, 73, 20);
		GerClientes.add(lblTelefone);
		
		textFieldCliente = new JTextField();
		textFieldCliente.setBounds(113, 56, 183, 20);
		GerClientes.add(textFieldCliente);
		textFieldCliente.setColumns(10);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBounds(113, 88, 183, 20);
		GerClientes.add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(113, 120, 183, 20);
		GerClientes.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 152, 73, 20);
		GerClientes.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(113, 152, 183, 20);
		GerClientes.add(textField);
		textField.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(310, 216, 90, 23);
		GerClientes.add(btnRemover);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(188, 216, 90, 23);
		GerClientes.add(btnAdicionar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Novo Cliente"}));
		comboBox.setBounds(113, 25, 321, 20);
		GerClientes.add(comboBox);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 28, 46, 14);
		GerClientes.add(lblCliente);
		
		JButton btnPet = new JButton("Gerenciar Pet");
		btnPet.setBounds(32, 216, 124, 23);
		GerClientes.add(btnPet);
		
		JPanel GerPets = new JPanel();
		panel.add(GerPets, "name_1216787221615700");
		GerPets.setLayout(null);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(10, 90, 46, 14);
		GerPets.add(lblNome_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 115, 46, 14);
		GerPets.add(lblSexo);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 140, 46, 14);
		GerPets.add(lblIdade);
		
		textFieldNomePet = new JTextField();
		textFieldNomePet.setBounds(66, 87, 123, 20);
		GerPets.add(textFieldNomePet);
		textFieldNomePet.setColumns(10);
		
		textFieldSexoPet = new JTextField();
		textFieldSexoPet.setBounds(66, 113, 123, 20);
		GerPets.add(textFieldSexoPet);
		textFieldSexoPet.setColumns(10);
		
		textFieldIdadePet = new JTextField();
		textFieldIdadePet.setBounds(66, 139, 123, 20);
		GerPets.add(textFieldIdadePet);
		textFieldIdadePet.setColumns(10);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.setBounds(322, 216, 89, 23);
		GerPets.add(btnRemover_1);
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setBounds(200, 216, 89, 23);
		GerPets.add(btnAdicionar_1);
		
		JLabel lblDono = new JLabel("Dono:");
		lblDono.setBounds(10, 46, 46, 14);
		GerPets.add(lblDono);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(66, 43, 200, 20);
		GerPets.add(comboBox_1);
		
		JLabel lblPet_1 = new JLabel("Pet:");
		lblPet_1.setBounds(10, 21, 46, 14);
		GerPets.add(lblPet_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Novo Pet"}));
		comboBox_3.setBounds(66, 18, 200, 20);
		GerPets.add(comboBox_3);
		
		JButton btnGerenciarConsulta = new JButton("Gerenciar Consulta");
		btnGerenciarConsulta.setBounds(44, 216, 123, 23);
		GerPets.add(btnGerenciarConsulta);
		
		JPanel GerConsultas = new JPanel();
		panel.add(GerConsultas, "name_1216790217754200");
		GerConsultas.setLayout(null);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(10, 80, 46, 20);
		GerConsultas.add(lblAno);
		
		JLabel lblMes = new JLabel("Mes:");
		lblMes.setBounds(10, 108, 46, 20);
		GerConsultas.add(lblMes);
		
		JLabel lblDia = new JLabel("Dia:");
		lblDia.setBounds(10, 133, 46, 20);
		GerConsultas.add(lblDia);
		
		textFieldAno = new JTextField();
		textFieldAno.setBounds(56, 80, 86, 20);
		GerConsultas.add(textFieldAno);
		textFieldAno.setColumns(10);
		
		textFieldMes = new JTextField();
		textFieldMes.setBounds(56, 108, 86, 20);
		GerConsultas.add(textFieldMes);
		textFieldMes.setColumns(10);
		
		textFieldDia = new JTextField();
		textFieldDia.setBounds(56, 133, 86, 20);
		GerConsultas.add(textFieldDia);
		textFieldDia.setColumns(10);
		
		JButton btnCancelarConsulta_1 = new JButton("Cancelar");
		btnCancelarConsulta_1.setBounds(70, 216, 104, 23);
		GerConsultas.add(btnCancelarConsulta_1);
		
		JButton btnMarcar = new JButton("Marcar");
		btnMarcar.setBounds(183, 216, 104, 23);
		GerConsultas.add(btnMarcar);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(56, 11, 244, 20);
		GerConsultas.add(comboBox_2);
		
		JLabel lblPet = new JLabel("Pet:");
		lblPet.setBounds(10, 14, 46, 14);
		GerConsultas.add(lblPet);
	}
}
