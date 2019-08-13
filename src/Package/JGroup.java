/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;

/**
 *
 * @author Eduardo
 */
public class JGroup extends ReceiverAdapter {
 
    JChannel canal;
    
    public void server() throws Exception{
        
        canal = new JChannel();
        canal.setReceiver(this);
        canal.connect("Mothership");
    }
    
    public void client(int i) throws Exception{
        
        canal = new JChannel();
        canal.connect("Mothership");
        GregorianCalendar time = new GregorianCalendar();
        String msg = i + ":" + time.get((Calendar.MINUTE)) + ":" + time.get((Calendar.SECOND)) + ":" + time.get((Calendar.MILLISECOND));
        Message mensagem = new Message(null, msg);
        canal.send(mensagem);
    }
    
    public String recieve(Message msg){
        
        
        return null;
    }
    
}
