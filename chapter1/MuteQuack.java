/*
  This file is a concrete implemention of how the duck quack, MuteQuack that the one way
  of quack behaviors.
 */


public class MuteQuack implements QuackBehavior
{
    public void quack()
    {
	System.out.println("<<Silence>>");
    }
}
