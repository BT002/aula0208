package pacote;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout {
	// criamos um JFrame chamado 'janela'
	JFrame janela = new JFrame();
	// criamos um JPanel chamado painel
	JPanel painel = new JPanel();
	// criamos um JButton chamado sul
	JButton sul = new JButton("SUL");
	// criamos um JButton chamado norte
	JButton norte = new JButton("NORTE");
	// criamos um JButton chamado leste
	JButton leste = new JButton("LESTE");
	// criamos um JButton chamado oeste
	JButton oeste = new JButton("OESTE");
	// criamos um JButton chamado centro
	JButton centro = new JButton("CENTRO");

	public static void main(String args[]) {
		new ExemploBorderLayout();
	}

	private ExemploBorderLayout() {
		// definimos o título da janela
		janela.setTitle("Exemplo de um BoderLayout");
		// definimos a largura e a altura da janela
		janela.setSize(300, 200);
		// define a posição da janela na tela
		janela.setLocation(50, 50);
		// define que ao fechar a janela, encerre a aplicação
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// definimos o layout do painel
		painel.setLayout(new BorderLayout());
		// adicionamos os botões ao painel
		painel.add("North", norte);
		painel.add("South", sul);
		painel.add("East", leste);
		painel.add("West", oeste);
		painel.add("Center", centro);
		// adicionamos o painel à janela
		janela.add(painel);
		// mostramos a janela
		janela.setVisible(true);
	}
}