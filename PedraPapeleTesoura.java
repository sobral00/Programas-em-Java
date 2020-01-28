package pedrapapeletesoura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Game {

private JFrame frmPedraPapelE;
private final ButtonGroup buttonGroup = new ButtonGroup();
int playerponto = 0;
int pcponto = 0;
int x,y;
/**
* Launch the application.
*/
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
public void run() {
	try {
		Game window = new Game();
		window.frmPedraPapelE.setVisible(true);
	} catch (Exception e) {
			e.printStackTrace();
			}
		}
	});
}

/**
* Create the application.
*/
public Game() {
	initialize();
	}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmPedraPapelE = new JFrame();
frmPedraPapelE.setIconImage(Toolkit.getDefaultToolkit().getImage(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
frmPedraPapelE.setResizable(false);
frmPedraPapelE.setTitle("Pedra, Papel e Tesoura ");
frmPedraPapelE.setBounds(100, 100, 421, 436);
frmPedraPapelE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmPedraPapelE.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("Placar");
lblNewLabel.setBounds(177, 11, 48, 14);
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
frmPedraPapelE.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("Jogador");
lblNewLabel_1.setBounds(78, 35, 65, 14);
frmPedraPapelE.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("Computador");
lblNewLabel_2.setBounds(257, 35, 102, 14);
frmPedraPapelE.getContentPane().add(lblNewLabel_2);

JLabel placarjogador = new JLabel("");
placarjogador.setBounds(78, 54, 46, 14);
frmPedraPapelE.getContentPane().add(placarjogador);

JLabel placarcomputador = new JLabel("");
placarcomputador.setBounds(257, 54, 46, 14);
frmPedraPapelE.getContentPane().add(placarcomputador);

JRadioButton pedra = new JRadioButton("Pedra");
pedra.setBounds(47, 247, 109, 23);
buttonGroup.add(pedra);
frmPedraPapelE.getContentPane().add(pedra);

JRadioButton papel = new JRadioButton("Papel");
papel.setBounds(158, 247, 109, 23);
buttonGroup.add(papel);
frmPedraPapelE.getContentPane().add(papel);

JRadioButton Tesoura = new JRadioButton("Tesoura");
Tesoura.setBounds(269, 247, 109, 23);
buttonGroup.add(Tesoura);
frmPedraPapelE.getContentPane().add(Tesoura);

JLabel resultado = new JLabel("");
resultado.setBounds(81, 166, 257, 44);
frmPedraPapelE.getContentPane().add(resultado);

JLabel jogadaplayer = new JLabel("");
jogadaplayer.setBounds(91, 111, 65, 44);
frmPedraPapelE.getContentPane().add(jogadaplayer);
JLabel jogadapc = new JLabel("");
jogadapc.setBounds(257, 111, 65, 44);
frmPedraPapelE.getContentPane().add(jogadapc);

JButton play = new JButton("Jogar");
play.setBounds(47, 301, 318, 41);
play.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

	Random random = new Random();
	y = random.nextInt(4);//ramdomiza o numero que vai ditar a jogada do pc

if(pedra.isSelected()){//controla os jbuttonradio
	x = 0;
	}
	else if (papel.isSelected()){
		x = 1;
	}
	else if (Tesoura.isSelected()) {
		x  = 2;
	}



if(x == 0) {//os ifs que controlam as imagens e pontos pela vitoria ou derrota
	jogadaplayer.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
if(y==1) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/papel.png")));
	resultado.setText(String.valueOf("<html>Você Perdeu o computador escolheu papel. <html/>")); pcponto++;
}else if(y==2) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/tesoura.png")));
	resultado.setText(String.valueOf("<html>Você Ganhou o computador escolheu tesoura. <html/>")); playerponto++;
}else {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
	resultado.setText(String.valueOf("<html>Empate, o computador escolheu o mesmo que você. <html/>"));
	}
}
if(x == 1) {
	jogadaplayer.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/papel.png")));
if(y==1) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/papel.png")));
	resultado.setText(String.valueOf("<html>Empate, o computador escolheu o mesmo que você. <html/>"));
}else if(y==2) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/tesoura.png")));
	resultado.setText(String.valueOf("<html>Você Perdeu o computador escolheu tesoura. <html/>")); pcponto++;
}else {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
	resultado.setText(String.valueOf("<html>Você Ganhou o computador escolheu pedra. <html/>")); playerponto++;
	}
}
if(x == 2) {
	jogadaplayer.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/tesoura.png")));
if(y==1) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/papel.png")));
	resultado.setText(String.valueOf("<html>Você Ganhou o computador escolheu papel. <html/>")); playerponto++;
}else if(y==2) {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/tesoura.png")));
	resultado.setText(String.valueOf("<html>Empate, o computador escolheu o mesmo que você. <html/>"));
}else {
	jogadapc.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
	resultado.setText(String.valueOf("<html>Você Perdeu o computador escolheu pedra. <html/>")); pcponto++;
	}
}


placarjogador.setText(String.valueOf(playerponto)); //atualiza o placar
placarcomputador.setText(String.valueOf(pcponto));
	}
});
play.setFont(new Font("Tahoma", Font.BOLD, 16));
frmPedraPapelE.getContentPane().add(play);
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/pedra.png")));
lblNewLabel_3.setBounds(67, 208, 32, 42);
frmPedraPapelE.getContentPane().add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("");
lblNewLabel_4.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/papel.png")));
lblNewLabel_4.setBounds(176, 209, 32, 41);
frmPedraPapelE.getContentPane().add(lblNewLabel_4);
JLabel lblNewLabel_5 = new JLabel("");
lblNewLabel_5.setIcon(new ImageIcon(Game.class.getResource("/pedrapapeletesoura/tesoura.png")));
lblNewLabel_5.setBounds(290, 206, 32, 44);
frmPedraPapelE.getContentPane().add(lblNewLabel_5);
JLabel lblX = new JLabel("X");
lblX.setFont(new Font("Tahoma", Font.BOLD, 20));
lblX.setBounds(188, 111, 20, 44);
frmPedraPapelE.getContentPane().add(lblX);
JLabel lblauthorYuriSobral = new JLabel("@Desenvolvido por Yuri Sobral");
lblauthorYuriSobral.setBounds(227, 367, 188, 14);
frmPedraPapelE.getContentPane().add(lblauthorYuriSobral);
JButton btnNewButton = new JButton("Resetar Placar");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {//reseta o placar
		
		pcponto = 0;
		playerponto = 0;
		placarjogador.setText(String.valueOf(playerponto));
		placarcomputador.setText(String.valueOf(pcponto));
		
	}
});
btnNewButton.setBounds(10, 363, 176, 23);
frmPedraPapelE.getContentPane().add(btnNewButton);

	}
}
