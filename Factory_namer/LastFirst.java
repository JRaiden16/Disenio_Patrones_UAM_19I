/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class LastFirst extends Namer {

    public LastFirst() {
    }

    public void metodo(String s) {
        int i = s.indexOf(",");//find comma
        if (i > 0) {//left is last name
            last = s.substring(0, i).trim();//right is first name
            first = s.substring(i + 1).trim();
        }
    }
}
