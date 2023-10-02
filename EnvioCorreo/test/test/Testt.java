/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import facade.Facade;
import facade.IFacade;

/**
 *
 * @author Daniel Alameda
 */
public class Testt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IFacade facade = new Facade();
        facade.sendEmial(new User("daoma222@gmail.com", "rfva uvsn fpzi ubjc"),
                new Email("daniel.lopez.044@hotmail.com", "pruebas", "pruebas"), EnumProtocol.SMTP, EnumServer.GMAIL);
        
//        facade.sendEmial(new User("daniel.lopez.044@hotmail.com", "daniel2002"),
//                new Email("daoma222@gmail.com", "pruebas", "pruebas"), EnumProtocol.SMTP, EnumServer.OUTLOOK);
//  
    }
    
}
