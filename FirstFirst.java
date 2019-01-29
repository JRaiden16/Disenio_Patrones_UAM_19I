/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class FirstFirst extends Namer {

    public FirstFirst() {
    }

    public void metodo(String s) {
        int i = s.indexOf(" ");//find space
        if (i > 0) {//left is last name
            first = s.substring(0, i).trim();//right is first name
            last = s.substring(i + 1).trim();
        }
    }
}
