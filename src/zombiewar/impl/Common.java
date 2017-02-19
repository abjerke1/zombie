package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

/**
 * Created by Desktop on 2/18/2017.
 */
public class Common extends Character implements IZombie {

    Common(){super(30);}

    public void attack(ISurvivor survivor){
        survivor.decreaseHealth(5);
    }

}
