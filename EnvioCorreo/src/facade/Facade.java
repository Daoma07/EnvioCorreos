/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import factory.FactoryProtocol;
import factory.IFactoryProtocol;

/**
 *
 * @author HP
 */
public class Facade implements IFacade {
    
    IFactoryProtocol factoryProtocol;
    
    public Facade() {
        this.factoryProtocol = new FactoryProtocol();
    }
    
    @Override
    public void sendEmial(User user, Email email, EnumProtocol protocol, EnumServer server) {
        factoryProtocol.useProtocol(user, email, protocol, server);
    }
    
}
