

/**
 * Class VegieGarden
 */
public class AnnualGarden extends Garden {

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
    return new Plant("shadeAnnual");
  }


  /**
   * @return       Plant
   */
  public Plant getCenter(  )
  {
    return new Plant("centerAnnual");
  }


  /**
   * @return       Plant
   */
  public Plant getBorder(  )
  {
    return new Plant("borderAnnual");
  }


}
