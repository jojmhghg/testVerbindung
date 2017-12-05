/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author timtim
 */
public interface ServerStub extends Remote{
    
    public String hallo(String string) throws RemoteException;
    
    public void langeFunktion(int time) throws RemoteException;
}
