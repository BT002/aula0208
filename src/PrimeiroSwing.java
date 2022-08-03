import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeiroSwing {
	// criamos e instaciamos um JFrame chamado 'janela'
	JFrame janela = new JFrame();
	// criamos e instaciamos um JButton chamado 'botao' e com o texto "OK"
	JButton botao = new JButton("OK");

	private PrimeiroSwing() {
		// definimos o título da janela
		janela.setTitle("Primeira Aplicação Gráfica");
		// definimos a largura e a altura da janela
		janela.setSize(350, 150);
		// define que ao fechar a janela, encerre a aplicação
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// adicionamos o botao à janela
		janela.add(botao);
		// mostramos a janela
		janela.setVisible(true);
	}
	
	public static void main(String args[]) {
		new PrimeiroSwing();
	}
}