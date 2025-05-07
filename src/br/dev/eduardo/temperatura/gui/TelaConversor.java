package br.dev.eduardo.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.dev.eduardo.temperatura.model.Temperatura;

public class TelaConversor {
	
	//Criacao dos elementos que vao ser exibidos
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelCelsius;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	public void criarTelaConversor() {
		
		//Criacao do JFrame e suas configuracoes
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		
		//Configurando o layout da tela exibida
		tela.setLayout(null);
		
		//Configurando o tamanho e o local de cada elemento da tela
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
		labelResultado.setBounds(90, 220, 420, 40);
		
		//setFont é para alterar o tamanho da fonte do texto do JLabel
		Font fonteResultado = new Font("Bold", 80, 30);
		labelResultado.setFont(fonteResultado);
		
		//setHorizontalAlignment serve para alinhar o texto do labelResultado no centro
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultado.setVisible(false);
		
		labelMensagemErro = new JLabel();
		String mensagemErro = "O valor inserido no campo está incorreto";
		labelMensagemErro.setText(mensagemErro);
		labelMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);
		labelMensagemErro.setBounds(90, 270, 420, 30);
		
		//setForeground é para alterar a cor do texto do JLabel, 
		//o Color.cor é para vc selecionar a cor desejada
		labelMensagemErro.setForeground(Color.red);
		
		Font fonteErro = new Font("Bold", 80, 14);
		labelMensagemErro.setFont(fonteErro);
		labelMensagemErro.setVisible(false);
		
		
		//Adicionando as ações dos botões Fahreinheit e Kelvin
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Essa string vai receber o conteudo que foi escrito pelo usuario
				String celsius = textCelsius.getText();
				
				//Essas funcoes sao semelhantes ao If, porem mais completo
				//onde se o sistema perceber que nao consegue fazer o calculo ele
				//passara o comando para o catch fazer seus comandos
				try {
					
					Temperatura temperatura = new Temperatura();
					
					//O valor inserido pelo usuario foi convertido para um double
					//assim a funcao que vai converter a temperatura podera funcionar
					double resultado = Double.valueOf(celsius);
					temperatura.setCelsius(resultado);
					double fahreinheit = temperatura.converterParaFahreinheit();
					
					//DecimalFormat foi usado para formatar os resultados,
					//deixando apenas uma casa decimal apos o ponto aparecer
					DecimalFormat decimal = new DecimalFormat("0.0");
					String resultadoFormatado = decimal.format(fahreinheit);
					labelResultado.setText(	resultadoFormatado + " FAHREINHEIT");
					
					//Deixando o resultado visivel e a mensagem de erro invisivel
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					
					//logo apos o botao ser selecionado o usuario sera direcionado 
					//para o campo textCelsius ira
					textCelsius.requestFocus();
					
				}catch(Exception ex) {
					labelMensagemErro.setVisible(true);
					labelResultado.setVisible(false);
					textCelsius.requestFocus();
				}
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Essa string vai receber o conteudo que foi escrito pelo usuario
				String celsius = textCelsius.getText();
				
				//Essas funcoes sao semelhantes ao If, porem mais completo
				//onde se o sistema perceber que nao consegue fazer o calculo ele
				//passara o comando para o catch fazer seus comandos
				try {
					Temperatura temperatura2 = new Temperatura();
					double resultado = Double.valueOf(celsius);
					temperatura2.setCelsius(resultado);
					double kelvin = temperatura2.converterParaKelvin();
					
					labelResultado.setText(kelvin + " KELVIN");
					
					//Deixando o resultado visivel e a mensagem de erro invisivel
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					textCelsius.requestFocus();
					
				}catch(Exception ex) {
					labelMensagemErro.setVisible(true);
					labelResultado.setVisible(false);
					
					//logo apos o botao ser selecionado o usuario sera direcionado 
					//para o campo textCelsius ira
					textCelsius.requestFocus();
				}
			}
		});
		
		//Adicionando no painel de conteudo (ContentPane)
		tela.getContentPane().add(textCelsius);
		
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreinheit);
		
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		
		//Essa linha deve ser a ultima dessa função, 
		//por fazer a janela ser visivel ao usuario
		tela.setVisible(true);
		
	}
	
}
