/*
  This is just a interface declare that the duck having a fly behavior.
  But how the duck flying is another thing, is's another java file such
  as FlyNoWay.java and FlyWithWings.java. We do so separate the "what"
  and "how" just for future we maybe add more fly behavior by other ways.
 */

public interface FlyBehavior
{
    public void fly();
}


