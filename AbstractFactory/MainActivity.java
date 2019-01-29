/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class MainActivity {
    public static void main(String[] args) {
        GardenMaker gm = new GardenMaker();
        //Garden g = gm.getGarden("Annual");
        //Garden g = gm.getGarden("Perennial");
        Garden g = gm.getGarden("Vegie");
        System.out.println("" + g.getBorder());
        System.out.println("" + g.getCenter());
        System.out.println("" + g.getShade());
    }
}
