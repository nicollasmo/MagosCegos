/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Nicollas
 */
public class JanelaPrincipal extends JFrame {

    private JanelaJogo janelaJogo = new JanelaJogo();

    public JanelaPrincipal() {

        initUI();
    }

    private void initUI() {

        add(janelaJogo);

        setSize(1920, 1080);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JanelaPrincipal ex = new JanelaPrincipal();
                ex.setVisible(true);
            }
        });
    }

}
