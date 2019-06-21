import java.io.*;
import java.util.*;
public class FractionalKnapsack {
	
	public static void bubbleSort(ArrayList<Integer> arr,ArrayList<Integer> indices, int n)
	{
		//System.out.println(arr);
		//System.out.println(indices);
		
		//Base Case
		if (n==1)
		{
			return;
		}
			
		boolean swapped=false;
		//Recursive cases
		for (int i=0;i<n-1;i++)
		{
			if (arr.get(i)<arr.get(i+1))
			{
				int temp1=arr.get(i);
				int temp2=arr.get(i+1);
				int temp3=indices.get(i);
				int temp4=indices.get(i+1);
				arr.set(i,temp2);
				arr.set(i+1,temp1);
				indices.set(i,temp4);
				indices.set(i+1,temp3);
				
				swapped=true;
			}
		
		}
		if (swapped==false)
		{
			return;
		}
		bubbleSort(arr,indices,n-1);
	}

	
	public static double fracKnap(ArrayList<Integer> weights, ArrayList<Integer> values,int W)
	{
		ArrayList<Integer> weighted_vals=new ArrayList<Integer>();
		ArrayList<Integer> indices=new ArrayList<Integer>();
		
		for (int i=0;i<weights.size();i++)
		{
			int val=values.get(i)/weights.get(i);
			weighted_vals.add(val);
			indices.add(i);
		}
		bubbleSort(weighted_vals,indices,weighted_vals.size());
		System.out.println("Weighted vals: "+weighted_vals);
		System.out.println("Indices: "+indices);
		System.out.println(" ");
		
		//Finding maximum value possible for given total weight W
		double total_val=0.0;
		for (int i=0;i<weighted_vals.size();i++)
		{
			System.out.println("Total weight left is: "+W);
			if (W==0)
				return total_val;
			int index=indices.get(i);
			int w_i=weights.get(index);
			System.out.println("Current iteration object weight is: "+w_i);
			int min_w=0;
			
			if (W>w_i)
				min_w=w_i;
			else
				min_w=W;
			
			System.out.println("Minimum of current object weight and total weight left is: "+min_w);
			
			total_val+=min_w*(weighted_vals.get(i));
			System.out.println("Total value at "+i+"th iteration: "+total_val);
			
			W=W-min_w;
			weights.set(index,w_i-min_w);
			System.out.println("Remainig weight of current object is: "+weights.get(index));
			System.out.println(weights);
			System.out.println(" ");
		}
		
		//return 0.0;
		return total_val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> weights=new ArrayList<Integer>();
		ArrayList<Integer> values=new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of weights and values: ");
		int n=scan.nextInt();
		System.out.println("Enter the weights: ");
		for (int i=0;i<n;i++)
		{
			weights.add(scan.nextInt());
		}
		System.out.println("Enter the values: ");
		for (int i=0;i<n;i++)
		{
			values.add(scan.nextInt());
		}
		System.out.println("Enter the total weight allowed: ");	
		int W=scan.nextInt();
		
		double total_val=fracKnap(weights,values,W);
		System.out.println("Maximum value possible is: "+total_val);
		
		scan.close();

	}

}
