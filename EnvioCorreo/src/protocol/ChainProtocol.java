/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

/**
 *
 * @author HP
 */
public abstract class ChainProtocol {

    ChainProtocol chainProtocol;

    public void setNextProtocol(ChainProtocol chainProtocol) {
        this.chainProtocol = chainProtocol;
    }

    public void sendEmail() {
        if (this.chainProtocol != null) {
            this.chainProtocol.sendEmail();
        }
    }

}
