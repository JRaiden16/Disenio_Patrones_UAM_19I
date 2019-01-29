

/**
 * Class VegieGarden
 */
public class PerennialGarden extends Garden {

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
    return new Plant("shadePerinneal");
  }


  /**
   * @return       Plant
   */
  public Plant getCenter(  )
  {
    return new Plant("centerPerinneal");
  }


  /**
   * @return       Plant
   */
  public Plant getBorder(  )
  {
    return new Plant("borderPerrineal");
  }


}
