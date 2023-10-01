/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;

/**
 *
 * @author HP
 */
public class Smtp extends ChainProtocol {

    @Override
    public void sendEmail(User user, Email email, EnumProtocol protocol,
            EnumServer server) {
        super.sendEmail(user, email, protocol, server); //To change body of generated methods, choose Tools | Templates.SUP
    }

}
