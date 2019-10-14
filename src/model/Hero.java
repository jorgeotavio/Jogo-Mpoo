package model;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class Hero {
	
	private List<Projectile> projectiles;
	private Sprite sprite;
	private final int VELOCIDADE = 2;
	private String direcao;
	private boolean colidiu;
	
	public Hero(Sprite sprite) {
		this.sprite = sprite;
		
	}
	
	public void parar() {
		switch (direcao) {
		case "up":
			this.sprite.setPosY(sprite.getPosY()+VELOCIDADE);
			break;
		case "down":
			this.sprite.setPosY(sprite.getPosY()-VELOCIDADE);
			break;
		case "left":
			this.sprite.setPosX(sprite.getPosX()+VELOCIDADE);
			break;
		case "right":
			this.sprite.setPosX(sprite.getPosX()-VELOCIDADE);
			break;
		case "diagonalUpRight":
			this.sprite.setPosX(sprite.getPosX()-VELOCIDADE);
			this.sprite.setPosY(sprite.getPosY()+VELOCIDADE);
			break;
		case "diagonalUpLeft":
			this.sprite.setPosX(sprite.getPosX()+VELOCIDADE);
			this.sprite.setPosY(sprite.getPosY()+VELOCIDADE);
			break;
		case "diagonalDownRight":
			this.sprite.setPosX(sprite.getPosX()-VELOCIDADE);
			this.sprite.setPosY(sprite.getPosY()-VELOCIDADE);
			break;
		case "diagonalDownLeft":
			this.sprite.setPosX(sprite.getPosX()+VELOCIDADE);
			this.sprite.setPosY(sprite.getPosY()-VELOCIDADE);
			break;
		}
	}
	
	public List<Projectile> getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(List<Projectile> projectiles) {
		this.projectiles = projectiles;
	}
	
	public Sprite getSprite() {
		return this.sprite;
	}

	public Rectangle getRetangulo() {
		return new Rectangle(this.sprite.getPosX()+5, this.sprite.getPosY()+35, 
				this.sprite.getLargura()/2, this.sprite.getAltura()/6);
	}

	public int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public boolean isColidiu() {
		return colidiu;
	}

	public void setColidiu(boolean colidiu) {
		this.colidiu = colidiu;
	}
	
	
	
}
