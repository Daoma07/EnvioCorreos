/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import protocol.ChainProtocol;
import protocol.Smtp;

/**
 *
 * @author HP
 */
public class FactoryProtocol implements IFactoryProtocol {
    
    @Override
    public void useProtocol(User user, Email email, EnumProtocol protocol,
            EnumServer server) {
        ChainProtocol smtp = new Smtp();
        
        smtp.sendEmail(user, email, protocol, server);
    }
    
}
