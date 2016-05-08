/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.components;

import java.awt.Image;
import model.entity.Captcha;

/**
 *
 * @author Nicollas
 */
public interface CaptchaComponent {

    public boolean inserirResposta(Captcha captcha);

    public Captcha gerarCaptchaConhecido();

    public Captcha gerarCaptchaDesconhecido();

}
