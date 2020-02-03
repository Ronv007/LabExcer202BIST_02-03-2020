import java.util.Scanner;
public class LabExer1B {

	public static int integer;
     public static void main(String[] args) {
     	Scanner scan = new Scanner(System.in);
     	System.out.print("Enter an integer: ");
     	integer = scan.nextInt();
     	System.out.println(integer + " plus 10 is " + showNumberPlus10(integer));
     	System.out.println(integer + " plus 100 is " + showNumberPlus100(integer));
     	System.out.println(integer + " plus 1000 is " + showNumberPlus1000(integer));
     	
     	
    }
    
     public static int showNumberPlus10(int a){
     	a = integer + 10;
     	return a;
     	}
     	
     public static int showNumberPlus100(int a){
     	a = integer + 100;
     	return a;
     	}
     	
     public static int showNumberPlus1000(int a){
     	a = integer + 1000;
     	return a;
     	}
    
    
}