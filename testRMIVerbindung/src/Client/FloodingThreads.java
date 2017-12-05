/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.ServerStub;

/**
 *
 * @author timtim
 */
public class FloodingThreads extends Thread{
        
    ServerStub verbindung;
    int time;
    
    public FloodingThreads(ServerStub verbindung, int time){
        this.verbindung = verbindung;
        this.time = time;
    }
    
    @Override 
    public void run(){
        try {
            this.verbindung.langeFunktion(this.time);
        } catch (RemoteException ex) {
            Logger.getLogger(FloodingThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
