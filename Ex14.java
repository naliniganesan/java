# java
code
public class City
{
 //declaring class variables
 public String name;
 public long population;
 //defining the method of the class
 public void display()
 {
 System.out.println("City name: " +name);
 System.out.println("Population: " +population);
 }
 public static void main(String args[])
 {
 //declaring the objects of the class City
 City metro1,metr
 metro1 = new City();
 metro2 = new City();
 metro1.name ="Mumbai";
 metro1.population = 23409876;
 System.out.println("Details of metro city 1:");
 metro1.display(); //display() method is being invoked for the object metro1
 metro2.name ="Pune";
 metro2.population = 45874294;
 System.out.println("Details of metro city 2:");
 metro2.display(); //display() method is being invoked for the object metro2
 }}
