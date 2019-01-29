

/**
 * Class GardenMaker
 */
public class GardenMaker {

  //
  // Fields
  //

  /**
   * //Abstract Factory wich returns one of three gardens
   */
  private Garden gd;
  
  //
  // Constructors
  //
  //Herrera improvement public GardenMaker () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Fija el valor de gd
   * //Abstract Factory wich returns one of three gardens
   * @param newVar el nuevo valor de gd
   */
  public void setGd ( Garden newVar ) {
    gd = newVar;
  }

  /**
   * Devuelve el valor de gd
   * //Abstract Factory wich returns one of three gardens
   * @return el valor de gd
   */
  public Garden getGd ( ) {
    return gd;
  }

  //
  // Other methods
  //

  /**
   * @return       Garden
   * @param        gtype
   */
  public Garden getGarden( String gtype )
  {
    gd = new VegieGarden(); //default
    if(gtype.equals("Perennial"))
    	gd = new PerennialGarden();
    if(gtype.equals("Annual"))
    	gd = new AnnualGarden();
    return gd;
  }


}
