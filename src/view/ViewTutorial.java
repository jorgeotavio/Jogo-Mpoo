package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ViewTutorial extends AbstractView{
	private JLabel descriptionLabel;
	private JButton backButton;
	
	public ViewTutorial() {
		
		descriptionLabel = new JLabel(
				"<html>"
				+ "<div style='font-size: 20;'>Tutorial </div><br/> "
				+ "Nesse jogo voc� ter� que pegar o m�ximo de <br/>"
				+ "n�meros do tipo solicitado nas fases, se pegar algum n�mero,<br/>"
				+ "de tipo diferente perder� vida, e se zerar voc� ser� <br/>"
				+ "congelado naquela fase, esperando at� a pr�xima. :(<br/>"
				+ "- Para controlar os personagens ser�o respectivamente.<br/>"
				+ "<hr/>"
				+ "<div style='font-size: 16;'>Player 1: </div><br/>"
				+ "			Seta cima-frente <br/>"
				+ "			Seta baixo-Tr�s <br/> "
				+ "			Seta direita-Direita<br/>"
				+ "			Seta esquerda-Esquerda <br/>"
				+ "			SHIFT - Pegar objeto"
				+ "<hr/>"
				+ "<div style='font-size: 16;'>Player 2: </div><br/> "
				+ "			 W-frente <br/> "
				+ "			 S-Tr�s <br/> "
				+ "			 F-Direita <br/> "
				+ "			 A-Esquerda <br/>"
				+ "			 SPACE - Pegar objeto"
				+ "<hr/>"
				
				);
		descriptionLabel.setBounds(150, 10, 500, 400);
		
		backButton = new ButtonCustom("Back");
		backButton.setBounds(270, 400, 80, 30);
		
		add(descriptionLabel);
		add(backButton);
		
		setVisible(false);
	}

	public JLabel getDescriptionLabel() {
		return descriptionLabel;
	}

	public JButton getBackButton() {
		return backButton;
	}
	
	
	
}

