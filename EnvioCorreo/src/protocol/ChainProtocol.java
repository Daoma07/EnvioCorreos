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
import factory.FactoryServer;
import factory.IFactoryServer;

/**
 *
 * @author HP
 */
public abstract class ChainProtocol {

    ChainProtocol chainProtocol;
    IFactoryServer factoryServer;

    public ChainProtocol() {
        this.factoryServer = new FactoryServer();
    }

    public void setNextProtocol(ChainProtocol chainProtocol) {
        this.chainProtocol = chainProtocol;
    }

    public void sendEmail(User user, Email email, EnumProtocol protocol,
            EnumServer server) {
        if (this.chainProtocol != null) {
            this.chainProtocol.sendEmail(user, email, protocol, server);
        }
    }

}
