/*the result of test for mallard duck:
  pqy@sda1:~/.../chapter1$ javac *.java
  pqy@sda1:~/.../chapter1$ java MiniDuckSimulator
  Quack
  I'm flying!!
  pqy@sda1:~/.../chapter1$
*/

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
	Duck mallard = new MallardDuck();
	mallard.performQuack();
	mallard.performFly();
    }
}
