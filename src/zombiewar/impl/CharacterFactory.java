
package zombiewar.impl;

import zombiewar.intf.ICharacter;
import zombiewar.intf.ICharacterFactory;
import zombiewar.impl.Child;
import zombiewar.impl.Teacher;
import zombiewar.impl.Soldier;
import zombiewar.impl.Common;
import zombiewar.impl.Tank;
/**
 *
 * @author thaoc
 */
public class CharacterFactory implements ICharacterFactory{
  
  public static final ICharacterFactory instance = new CharacterFactory();
  
  private CharacterFactory(){
   
  }

  /**
   * Make the character.  To support more characters,
   * simply implement a type and then add a case statement
   * to this method.
   * 
   * @param type The type of character to make.
   * @return 
   */
  
  @Override
  public ICharacter make(String type) {
    switch(type){
      case "child"    : return new Child();
      case "common"   : return new Common();
      case "soldier"  : return new Soldier();
      case "tank"     : return new Tank();
    }
    return null;
  }
  
}
