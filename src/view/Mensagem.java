package view;

import javax.swing.JOptionPane;

public class Mensagem {

	public void exibir(String msg) {
		JOptionPane.showMessageDialog(null, msg, "+1 Mensagem", JOptionPane.WARNING_MESSAGE);
	}
}