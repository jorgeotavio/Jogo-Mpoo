package view;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void exibir(String msg) {
		JOptionPane.showMessageDialog(null, "A miss�o � pegar todos os n�meros "+msg, "+1 Mensagem", 1);
	}
	
	public static int confirmar(String msg) {
		return JOptionPane.showConfirmDialog(null, "O vencedor �: "+msg+" desejam tentar novamente?", "+1 Mensagem", 1);
	}
}
