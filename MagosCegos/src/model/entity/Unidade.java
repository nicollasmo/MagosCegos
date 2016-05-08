/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.awt.Image;

/**
 *
 * @author Nicollas
 */
public class Unidade {

    private int vida;

    private Image sprite;

    private int alcance;

    private int dano;

    private int velAtaque;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVelAtaque() {
        return velAtaque;
    }

    public void setVelAtaque(int velAtaque) {
        this.velAtaque = velAtaque;
    }

}
