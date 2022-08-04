package exemplos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ExemploJRadioButton implements ActionListener {
	JFrame janela = new JFrame();

	JPanel painel = new JPanel();
	JButton botao = new JButton("OK");
	// criamos três radio buttons
	JRadioButton rb1 = new JRadioButton("Opção 1 GP1");
	JRadioButton rb2 = new JRadioButton("Opção 2 GP1");
	JRadioButton rb3 = new JRadioButton("Opção 3 GP1");
	
	// Grupo 2
	JRadioButton rb1gp2 = new JRadioButton("Opção 1 GP2");
	JRadioButton rb2gp2 = new JRadioButton("Opção 2 GP2");
	JRadioButton rb3gp2 = new JRadioButton("Opção 3 GP2");
	// criamos o grupo para os radio buttons
	ButtonGroup grupo1 = new ButtonGroup();
	ButtonGroup grupo2 = new ButtonGroup();

	public static void main(String args[]) {
		new ExemploJRadioButton();
	}

	public ExemploJRadioButton() {
		janela.setSize(240, 100);
		janela.setTitle("Exemplo de JRadioButton");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new GridLayout(2, 1));
		painel.setLayout(new GridLayout(1, 1));
		painel.add(rb1);
		painel.add(rb2);
		painel.add(rb3);
		painel.add(rb1gp2);
		painel.add(rb2gp2);
		painel.add(rb3gp2);
		janela.add(painel);
		janela.add(botao);
		janela.setVisible(true);
		botao.addActionListener(this);
		// adicionamos os radio buttons ao grupo
		grupo1.add(rb1);
		grupo1.add(rb2);
		grupo1.add(rb3);
		
		grupo2.add(rb1gp2);
		grupo2.add(rb2gp2);
		grupo2.add(rb3gp2);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			String mensagem = "Nenhuma opção selecionada";
			// verificamos qual radio button está selecionado
			if (rb1.isSelected()) {
				mensagem = "Opção 1 selecionada";
			} else if (rb2.isSelected()) {
				mensagem = "Opção 2 selecionada";
			} else if (rb3.isSelected()) {
				mensagem = "Opção 3 selecionada";
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}
