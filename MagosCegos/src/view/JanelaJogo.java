/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Nicollas
 */
public class JanelaJogo extends JPanel {

    private Graphics2D g2d;

    private Image background = new ImageIcon("assets/background.png").getImage();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        desenharBackground();
    }

    public void desenharBackground() {
        g2d.drawImage(background, 0, 0, this);
    }

}
