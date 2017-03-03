
/*
  This file is a concrete implemention of how the duck quack, Speak that the one way
  of quack behaviors.
 */

public class Speak implements QuackBehavior
{
    public void quack()
    {
	System.out.println("Squeak");
    }
}
