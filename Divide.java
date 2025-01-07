import java.util.*;
class Divide{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if(b == 0){
System.out.println("Invalid Operation");
}
else{
System.out.println("Divide:"  + (a / b));
}
}
}