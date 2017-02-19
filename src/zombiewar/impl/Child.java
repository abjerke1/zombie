package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

/**
 * Created by Desktop on 2/18/2017.
 */
public class Child extends Character implements ISurvivor {

    Child(){super(20);}

    public void attack(IZombie zombie){
        zombie.decreaseHealth(2);
    }

}
