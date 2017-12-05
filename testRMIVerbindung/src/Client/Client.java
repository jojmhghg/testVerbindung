/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import test.ServerStub;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author timtim
 */
public class Client {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.NotBoundException
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        
        Registry registry = LocateRegistry.getRegistry("25.23.112.58", 1099);
        ServerStub stub = (ServerStub) registry.lookup("ServerStub");
        
        System.out.println("verbunden");     
        System.out.println(stub.hallo("tim"));
    }
    
}
