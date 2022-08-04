package pacote;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEx1 {
	// criamos e instaciamos um JFrame chamado 'janela'
	JFrame janela = new JFrame();
	private JTextField textNm;
	private JTextField textCPF;

	private TelaEx1() {
		// definimos o t�tulo da janela
		janela.setTitle("Primeira Aplica��o Gr�fica");
		// definimos a largura e a altura da janela
		janela.setSize(350, 150);
		// define que ao fechar a janela, encerre a aplica��o
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		janela.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		panel.add(lblNome);
		
		textNm = new JTextField();
		textNm.setBounds(56, 8, 194, 20);
		panel.add(textNm);
		textNm.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(10, 36, 46, 14);
		panel.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(56, 33, 194, 20);
		panel.add(textCPF);
		textCPF.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNm.getText();
				String cpf = textCPF.getText();
				String mensagem = "Nome:" + nome + " e CPF:" + cpf;
				JOptionPane.showMessageDialog(null, mensagem);
				textNm.setText("");
				textCPF.setText("");
			}
		});
		btnSalvar.setBounds(85, 65, 89, 23);
		panel.add(btnSalvar);
		// mostramos a janela
		janela.setVisible(true);
	}
	
	public static void main(String args[]) {
		new TelaEx1();
	}
}