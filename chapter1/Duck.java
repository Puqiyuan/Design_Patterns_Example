/*
  This file create a class of Duck. It's abstract class, because we just abstrct some common features
  of all Ducks. The features includning fly behaviors, quack behaviors.
 */


public abstract class Duck
{
    FlyBehavior flyBehavior; //Flybehavior and QuackBehavior classes are interfaces. 
    QuackBehavior quackBehavior; //These interfaces including kind of behaviors that will be
                                 //implement in future, such as in FlyWithWings.java file and
                                 //Quack.java file. The interface is good for elasticity for adding
                                 // duck behavior in the future.

    public Duck() {}

    public abstract void display();

    public void performFly()
    {
	flyBehavior.fly();
    }

    public void performQuack()
    {
	quackBehavior.quack();
    }

    public void swim()
    {
	System.out.println("All ducks float, even decoys!");
    }
	
}


