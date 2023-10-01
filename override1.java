class Animal
{
  public void eat()
   {
     System.out.println("Eating the food");
   } 
}
class Heribivores extends Animal
{
  public void eat()
   {
     System.out.println("Eating meat");
   }
}
class Carnivores extends Animal
{
  public void eat()
   {
     System.out.println("Eating leaves");
   }
}
class override1
{
  public static void main(String args[])
    {
       Animal a=new Animal();
       a.eat();
       Heribivores b=new Heribivores();
       b.eat();
       Carnivores c=new Carnivores();
       c.eat();
    }
}