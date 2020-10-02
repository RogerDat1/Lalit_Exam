/*N number of balloons are kept at different heights. You are asked to find out number of arrows to burst them. When an arrow hits the balloon it goes one level down.
Assume that the balloons are having same size.

for example given the balloons heights as array(Array will be given in decreasing order of size) :
5 4 3 3 2 2 1 1 1
minimum number of arrows to shoot them is: 3

explanation:
using first arrow shoot: 5 4 3 2 1
using second arrow shoot: 3 2 1
using third arrow shoot: 1*/


import java.util.ArrayList;
import java.util.Scanner;

public class ballonsHits {

	ballonsHits(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Space Seprated Array....");
		String input = sc.nextLine();
		String[] firstsrr = input.split(" ");
		ArrayList<Integer> fir = new ArrayList();
		ArrayList<Integer> sec = new ArrayList();
		System.out.println("pushing to arrylist");
		for(int i =0;i<firstsrr.length;i++)
		{
			fir.add(Integer.parseInt(firstsrr[i]));
		}
		int count =0;int hitball=0;
		int counterstop = fir.size();
		while(count<counterstop)
		{
			hitball=hitball+1;
			sec.addAll(fir);
			fir.clear();
			int firsthitsize= sec.get(0);
			for(int l =0;l<sec.size();l++)
			{
				if(firsthitsize==sec.get(l))
				{
					count++;
					firsthitsize=firsthitsize-1;
				}
				else
				{
					fir.add(sec.get(l));
				}
			}
			sec.clear();
		}
		System.out.println("No of hits required is :"+hitball);	
	}
	public static void main(String[] args) {
		ballonsHits bb = new ballonsHits();
	}
		
	
}
