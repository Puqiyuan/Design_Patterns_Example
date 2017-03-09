/*the result of test for mallard duck:
  pqy@sda1:~/.../chapter1$ javac *.java
  pqy@sda1:~/.../chapter1$ java MiniDuckSimulator
  Quack
  I'm flying!!
  pqy@sda1:~/.../chapter1$

  the result of testing dynamicaly method:
  pqy@sda1:~/.../chapter1$ java MiniDuckSimulator
  Quack
  I'm flying!!
  I can't fly
  I'm flying with  rocket!
*/

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
	Duck mallard = new MallardDuck();
	mallard.performQuack();
	mallard.performFly();

	Duck model = new ModelDuck();
	model.performFly();
	model.setFlyBehavior(new FlyRocketPowered());
	model.performFly();
    }
}
