/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Eduardo
 */
public class RMI extends UnicastRemoteObject implements IRMI {
    
    public RMI() throws RemoteException{};
    
    @Override
    public String msg(int i){
        
        GregorianCalendar time = new GregorianCalendar();
        String msg = i + ":" + time.get((Calendar.MINUTE)) + ":" + time.get((Calendar.SECOND)) + ":" + time.get((Calendar.MILLISECOND));
        return msg;
    }
}
