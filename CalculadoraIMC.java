package imcCalculo;
// @Author Yuri Sobral

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class CalculadoraIMC {

	private JFrame frmCalculadoraImcBy;
	private JTextField altura;
	private JTextField peso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIMC window = new CalculadoraIMC();
					window.frmCalculadoraImcBy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraIMC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraImcBy = new JFrame();
		frmCalculadoraImcBy.setResizable(false);
		frmCalculadoraImcBy.setTitle("Calculadora IMC by Yuri Sobral");
		frmCalculadoraImcBy.setBounds(100, 100, 350, 240);
		frmCalculadoraImcBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraImcBy.getContentPane().setLayout(null);
		
		JLabel lblSuaAltura = new JLabel("Sua Altura: ");
		lblSuaAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSuaAltura.setBounds(10, 23, 85, 14);
		frmCalculadoraImcBy.getContentPane().add(lblSuaAltura);
		
		altura = new JTextField();
		altura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		altura.setBounds(100, 22, 86, 20);
		frmCalculadoraImcBy.getContentPane().add(altura);
		altura.setColumns(10);
		
		JLabel lblSeuPeso = new JLabel("Seu peso:");
		lblSeuPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSeuPeso.setBounds(10, 63, 85, 14);
		frmCalculadoraImcBy.getContentPane().add(lblSeuPeso);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		peso.setBounds(100, 62, 86, 20);
		frmCalculadoraImcBy.getContentPane().add(peso);
		peso.setColumns(10);
		
		JButton btnCalcularImc = new JButton("Calcular IMC");
		JLabel resposta = new JLabel("");
		btnCalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					// declaração das variáveis e coleta de valores para calculo do IMC
					float altura1 = Float.parseFloat(altura.getText());
					float peso1 = Float.parseFloat(peso.getText());
				  
					 
					float result =  (peso1/(altura1 * altura1));
					DecimalFormat decimalFormat = new DecimalFormat("#,##0.00"); // reduzir a duas casas decimais o resultado
			        decimalFormat.setRoundingMode(RoundingMode.DOWN);
			
				//ifs e elses dos resultados
				if(result<18.5) resposta.setText(String.valueOf("Seu IMC é de "+result+" pontos, você está abaixo do peso!"));
				else if(result>18.6 && result<24.9) resposta.setText(String.valueOf("<html>Seu IMC é de "+decimalFormat.format(result)+" pontos.<br/>Você está no seu peso ideal.<html/>"));
				else if(result>25 && result<29.9) resposta.setText(String.valueOf("<html>Seu IMC é de "+decimalFormat.format(result)+" pontos.<br/>Você está com sobrepeso.<html/>"));
				else if(result>30 && result<34.9) resposta.setText(String.valueOf("<html>Seu IMC é de "+decimalFormat.format(result)+" pontos.<br/>Você está com obesidade grau I.<html/>"));
				else if(result>35 && result<39.9) resposta.setText(String.valueOf("<html>Seu IMC é de "+decimalFormat.format(result)+" pontos.<br/>Você está com obesidade grau II(Severa).<html/>"));
				else if(result>40) resposta.setText(String.valueOf("<html>Seu IMC é de "+decimalFormat.format(result)+" pontos.<br/>Você está com obesidade grau III(Morbida).<html/>"));
			}
		});
		btnCalcularImc.setBounds(213, 21, 106, 61);
		frmCalculadoraImcBy.getContentPane().add(btnCalcularImc);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(126, 101, 86, 14);
		frmCalculadoraImcBy.getContentPane().add(lblResultado);
		
		
		resposta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		resposta.setBounds(10, 127, 309, 63);
		frmCalculadoraImcBy.getContentPane().add(resposta);
	}
}
