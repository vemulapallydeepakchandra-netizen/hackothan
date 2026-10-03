import java.util.Scanner;
public class WasteCollection {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int wasteCollected = sc.nextInt();
if(wasteCollected >= 100) {
System.out.println("collection target achived");
}else{
System.out.println("More waste to collect");
}
}
}