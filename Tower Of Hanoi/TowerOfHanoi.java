/* Java Code for Tower of Hanoi - Important example of applications of Recursion
 * Author - Akshaya Balaji
 * Date - March 24, 2020 
 * 
 * Important factors to note (Source - GeeksForGeeks):
 * 1. For n disks, total 2^(n) – 1 moves are required.
 * 2. For n disks, total 2^(n-1) function calls are made.*/
import java.util.*;
import java.io.*;
public class TowerOfHanoi {
	
	int disk_num;
	
	public TowerOfHanoi(int n)
	{
		disk_num=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tower of Hanoi");
		System.out.println("Source : A | Auxilary : B | Destination : C");
		Scanner scan  = new Scanner(System.in);
		System.out.print ("Enter the number of disks to be shifted: ");
		int n = scan.nextInt();
		System.out.println(" ");
		TowerOfHanoi obj = new TowerOfHanoi(n);
		obj.hanoiTower(obj.disk_num,'A','C','B');
		scan.close();

	}
	
	public void hanoiTower(int n, char from, char to, char aux)
	{
		if (n==1)
		{
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			return;
		}
		else
		{
			hanoiTower(n-1, from, aux, to);
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			hanoiTower(n-1,aux,to,from);
		}
		
	}

}
