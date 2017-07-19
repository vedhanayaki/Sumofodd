package player;
import java.util.Scanner;
public class Sum1to15oddsumof15to45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the elements:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int count =0;
for(int i=0;i<=count;i++){
	if(i<=15){
		System.out.println(i);
		count++;
	}
}
for(int j=15;j<=45;j++){
	if(j%2!=0){
		System.out.println("Odd Number"+j);
	}
}
	}

}
