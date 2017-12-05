/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static java.lang.Thread.sleep;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author timtim
 */
public class ServerStubImpl implements ServerStub{

    @Override
    public String hallo(String string) throws RemoteException {
        System.out.println("Hallo gesagt");
        return "Hallo " + string;
    }

    @Override
    public void langeFunktion(int time) throws RemoteException {
        try {
            System.out.println("SLEEP start");
            sleep(time);
            System.out.println("SLEEP ende");
        } catch (InterruptedException ex) {
            Logger.getLogger(ServerStubImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
