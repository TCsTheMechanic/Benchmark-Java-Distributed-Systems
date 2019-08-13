/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Eduardo
 */
public interface IRMI extends Remote{
    
    public String msg(int i) throws RemoteException;
}
