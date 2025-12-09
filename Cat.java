import java.util.*;
public class Cat{
public static void main( String[] args ){
//this program works like a madlib
Scanner input = new Scanner(System.in);
System.out.println("Give me a number: ");
int num = input.nextInt();
System.out.println("Give me a color: ");
String color = input.next();
System.out.println("Give me an animal: ");
String animal = input.next();
System.out.println("I saw " + num + " " + color +" "+ animal + "s running by the school.");
}
}