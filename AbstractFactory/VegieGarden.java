

/**
 * Class VegieGarden
 */
public class VegieGarden extends Garden {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public VegieGarden () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @return       Plant
   */
  public Plant getShade(  )
  {
    return new Plant("Brocoli");
  }


  /**
   * @return       Plant
   */
  public Plant getCenter(  )
  {
    return new Plant("Corn");
  }


  /**
   * @return       Plant
   */
  public Plant getBorder(  )
  {
    return new Plant("Peas");
  }


}
