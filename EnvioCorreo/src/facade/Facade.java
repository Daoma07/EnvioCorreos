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

/**
 *
 * @author HP
 */
public class Facade implements IFacade {

    @Override
    public void sendEmial(User user, Email email, EnumProtocol protocol, EnumServer server) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
