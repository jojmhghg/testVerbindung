/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.rmi.RemoteException;

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
    
}
