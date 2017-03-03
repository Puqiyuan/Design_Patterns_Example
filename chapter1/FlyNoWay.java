/*
  This file is a concrete implemention of how the duck fly, FlyNoWay taht the one way
  of fly behaviors.
 */

public class FlyNoWay implements FlyBehavior
{
    public void fly()
    {
	System.out.println("I can't fly");
    }
}
