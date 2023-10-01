abstract class Animal
{
  public abstract void makesound();

   public void eat()
   {
      System.out.println("I'm eating");
   }
}
class Dog extends Animal
{
   public void makesound()
   {
      System.out.println("Bow Bow..........");
   }
}
class Cat extends Animal
{
  public void makesound()
   {
     System.out.println("meow meow.....");
   }
}
class mainclass
{
  public static void main(String args[])
   {
     Cat c=new Cat();
     c.makesound();
     c.eat();
     Dog d=new Dog();
     d.makesound();
     d.eat();
   }
}


