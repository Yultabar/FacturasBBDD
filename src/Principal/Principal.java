/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Vista.FramePrincipal;

import dao.Modelo;
import javax.swing.JFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author juan
 */
public class Principal {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Modelo modelo = (Modelo)context.getBean("modelo");
        JFrame miFrame = new FramePrincipal(modelo);
         
    }
}
