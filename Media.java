package com.mycompany.aprendizadojava;

import javax.swing.JOptionPane;

/**
 * @author Yuri
 */
public class OiMundo {

    public static void main(String[] args) {
        double n1,n2,n3,n4,media;
        String nome;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota: "));
        
        media = (n1+n2+n3+n4)/4;
        
        JOptionPane.showMessageDialog(null, "Aluno(a) " + nome + " ,sua media é: "+ media);
        
    }   
}
