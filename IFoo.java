/*
* Beispielanwendung: das Interface Transportierbar
*/

public interface IFoo
{
  public final float MAX_GEWICHT_PRO_FLAECHE = 29.99F;
  // hier geht auch: float MAX_GEWICHT_PRO_FLAECHE = 29.99F;

  // alle Methoden in Interfaces sind implizit public und abstract
  // alle vier Methodendeklarationen sind zulässig
  // jede dieser Methoden ist public und abstract
  float gewicht();
  abstract float laenge();
  public float breite();
  public abstract float hoehe();

  boolean zerbrechlich();
  String beschriftung();
}
