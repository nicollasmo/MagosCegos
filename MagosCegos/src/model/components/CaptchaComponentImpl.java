/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.components;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Captcha;

/**
 *
 * @author Nicollas
 */
public class CaptchaComponentImpl implements CaptchaComponent {

    File arquivoTexto = new File("assets/Texto/verbos.txt");

    @Override
    public boolean inserirResposta(Captcha captcha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Captcha gerarCaptchaConhecido() {
        try {
            Captcha captcha = new Captcha();
            Scanner s = new Scanner(arquivoTexto);
            return captcha;
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    @Override
    public Captcha gerarCaptchaDesconhecido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
