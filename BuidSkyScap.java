package binarySearchTree;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuidSkyScap {
	public static void main(String[] args) {
		//creating the Object 
		try (Scanner sc = new Scanner(System.in)) {
			//asking user to enter number of floors
			System.out.println("enter the total no of floors in the building");
			//allocating int for total number of floors in building
			int totalNoOfBuildings = sc.nextInt();
			//entering the floor size
			int[] floorSize = new int[totalNoOfBuildings+1];
			//checking the integer int with total number of building
			for(int i=1;i<=totalNoOfBuildings;i++) {
				//asking user to enter the floor size given on day
				System.out.println("enter the floor size given on day : "+i);
				floorSize[i] = sc.nextInt();
			}
			buildSkyScraper(totalNoOfBuildings,floorSize);
		}
	}
	
	private static void buildSkyScraper(int n,int[] floorSize) {
		//creating object for priority 
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int max = n;
		for(int i=1;i<=n;i++) {
			pq.add(floorSize[i]);
			System.out.println("\nDay: "+i+" \n");

			while(pq.peek()!=null && pq.peek()==max) {
				System.out.print(pq.poll()+" ");
				max--;
			}
		}

	}
}



