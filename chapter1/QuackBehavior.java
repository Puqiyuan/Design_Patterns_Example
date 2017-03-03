/*
  This is just a interface declare that the duck having a quack behavior.
  But how the duck quacking is another thing, is's another java file such
  as MuteQuack.java, Quack.java and Speak.java. We do so separate the "what"
  and "how" just for future we maybe add more quack behavior by other ways.
 */

public interface QuackBehavior
{
    public void quack();
}
