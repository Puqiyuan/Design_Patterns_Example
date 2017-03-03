public class MallardDuck extends Duck // the duck extends from duck.
{
    public MallardDuck()
    {
	quackBehavior = new Quack(); //father class have these two handle for 
	flyBehavior = new FlyWithWings(); //processing Quack and Fly.
    }

    public void display()
    {
	System.out.println("I'm a real Mallard duck");
    }
}
