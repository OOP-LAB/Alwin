import java.util.Scanner;
class Sample
{
void display()
{
System.out.println("BASE CLASS");
}
}                                                                                                                                                                                                                                               
class Sample1 extends Sample
{
void displaydata()
{
System.out.println("derived class");
}}
public class alfina{
public static void main(String args[])
{
Sample1 obj=new Sample1();
obj.display();
obj.displaydata();
}}
