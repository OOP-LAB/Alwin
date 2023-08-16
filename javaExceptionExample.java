public class javaExceptionExample{
public static void main(String args[]){
try{
int data=100/0; }
catch(ArithemeticException e)
{System.out.println(e);}
rest of the program
System.out.println("rest of the code...");
}
}
