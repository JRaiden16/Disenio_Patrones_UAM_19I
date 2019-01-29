

/**
 * Class Plant
 */
public class Plant {

  //
  // Fields
  //

  private String name;
  
  //
  // Constructors
  //
  //Herrera improvement public Plant () { };
  /**
   * @param        pname
   */
  public  Plant( String pname )
  {
    name = pname;  	// save name
  }


  
  //
  // Methods
  //
  public String toString(){
      return "Plant.name= " + name;
  }

  //
  // Accessor methods
  //

  /**
   * Fija el valor de name
   * @param newVar el nuevo valor de name
   */
  public void setName ( String newVar ) {
    name = newVar;
  }

  /**
   * Devuelve el valor de name
   * @return el valor de name
   */
  public String getName ( ) {
    return name;
  }
 

}
