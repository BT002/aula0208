package exemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ExemploCombo implements ActionListener {
	JFrame janela = new JFrame();
	JLabel label = new JLabel("Selecione uma cor:");
	JButton botao = new JButton("OK");
	// criamos um novo combo
	JComboBox combo = new JComboBox();

	public static void main(String args[]) {
		new ExemploCombo();
	}

	public ExemploCombo() {
		janela.setSize(240, 100);
		janela.setTitle("Exemplo de JComboBox");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		janela.add(label);
		janela.add(combo);
		janela.add(botao);
		janela.setVisible(true);
		botao.addActionListener(this);
		// adicionamos as cores ao combo
		combo.addItem("Vermelho");
		combo.addItem("Verde");
		combo.addItem("Azul");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			// mostramos uma mensagem informando a cor selecionada pelo usuário
			JOptionPane.showMessageDialog(null, combo.getSelectedItem());
		}
	}

}