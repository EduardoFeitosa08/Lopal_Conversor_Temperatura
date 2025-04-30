package br.dev.eduardo.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaConversor {
	
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelCelsius;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		
		
		tela.setLayout(null);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(30, 80, 540, 40);
		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(30, 130, 260, 50);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(310, 130, 260, 50);
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(30, 50, 260, 30);
		
		labelResultado = new JLabel();
		labelResultado.setText("FAHREINHEIT");
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultado.setBounds(90, 220, 420, 40);
		
		labelMensagemErro = new JLabel();
		
		String mensagemErro = "teste1";
		labelMensagemErro.setText(mensagemErro);
		labelMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);
		labelMensagemErro.setBounds(90, 270, 420, 30);
		
		//Usar um if para quando errar fazer a mensagem de erro estar visivel
		labelMensagemErro.setVisible(false);
		
		
		
		
		//Adicionando no painel de conteudo (ContentPane)
		tela.getContentPane().add(textCelsius);
		
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		
		//Essa linha deve ser a ultima dessa função
		tela.setVisible(true);
		
	}
	
}
