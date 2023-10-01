/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import enums.EnumServer;

/**
 *
 * @author HP
 */
public abstract class ChainServer {
    
    ChainServer chainServer;
    
    public void setNextServer(ChainServer chainServer) {
        this.chainServer = chainServer;
    }
    
    public void useServer(EnumServer server) {
        if (this.chainServer != null) {
            this.chainServer.useServer(server);
        }
    }
    
}
