
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class NameFactory {

    //returns an instance of LastFirst or FirstFirst //depending on whether a comma is found
    public Namer getNamer(String entry) {
        int i = entry.indexOf(","); //comma determines name order
        Namer localnamer = null;
        Class c = null;
        Object o = null;
        try {
            if (i > 0) {
                //return new LastFirst(entry);
                c = Class.forName("LastFirst");
            } //return one class
            else {
                //return new FirstFirst(entry);
                int j = entry.indexOf("-");
                if (j > 0) {
                    c = Class.forName("MenosFirst");
                } else {
                    c = Class.forName("FirstFirst");
                }
            }
            o = c.newInstance();
            //FirstFirst ff = (FirstFirst) o;
            //ff.metodo(entry);
            localnamer = (Namer) o;
            localnamer.metodo(entry);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NameFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NameFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NameFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
//or the other
        return localnamer;
    }
}
