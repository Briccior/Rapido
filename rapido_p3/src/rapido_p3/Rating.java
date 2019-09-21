package rapido_p3;

import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int i, j, k = 0, voters = 0, saveI = 0, saveJ = 0, choice;
		double add, highest = 0, lowest = 0;
		char loop = 'y';
		
		String[] topics = new String[5]; 
		int[][] rating = new int[5][10];
		double[] avg = new double[5];
		
		topics[0] = "Violence";
		topics[1] = "Abortion";
		topics[2] = "Climate Change";
		topics[3] = "Gun Rights";
		topics[4] = "Mental Health";
		
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 10; j++) 
			{
				rating[i][j] = 0;
			}
		}
		System.out.println("Hello the following issues are up for voting:");
		for (i = 0; i < 5; i++)
		{
			System.out.println(topics[i]);
		}
		System.out.println("Please rank each issue from 1-10 (1 being least important and 10 being most important):");
		while (loop == 'y' || loop == 'Y') {
			
			for (i = 0; i < 5; i++)
			{
				System.out.print(topics[i] + ": ");
				choice = scnr.nextInt();
				
				switch (choice)
				{
					case 1:
						rating[i][0]++;
						break;
					
					case 2:
						rating[i][1]++;
						break;
					
					case 3:
						rating[i][2]++;
						break;	
					
					case 4:
						rating[i][3]++;
						break;
						
					case 5:
						rating[i][4]++;
						break;
						
					case 6:
						rating[i][5]++;
						break;
						
					case 7:
						rating[i][6]++;
						break;
						
					case 8:
						rating[i][7]++;
						break;
						
					case 9:
						rating[i][8]++;
						break;
						
					case 10:
						rating[i][9]++;
						break;
				}
			}
			voters++;
			System.out.println("Would someone else like to vote?(y/n): ");
			loop = scnr.next().charAt(0);
		}
		System.out.println("_________________________________________________________________________________________________________________");
		System.out.println("Topics\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage\tTotal");
		for (i = 0; i < 5; i++)
		{
			System.out.print(topics[i] + "\t");
			add = 0;
			for(j = 0; j < 10; j++)
			{
				System.out.print(rating[i][j] + "\t");
				add = add + ((double)rating[i][j] * (j + 1));
			}
			avg[i] = add / voters;
			System.out.printf("%.1f\t %.1f\n", avg[i], add);
			if (i == 0) 
				{
				lowest = add;
				saveJ = i;
				}
			if (add > highest)
				{
				highest = add;
				saveI = i;
				}
			if (add < lowest) 
				{
				lowest = add;
				saveJ = i;
				}
		}
		System.out.println("_________________________________________________________________________________________________________________");
		System.out.println("The issue with the highest point total is " + topics[saveI] + ": " + highest);
		System.out.println("The issue with the lowest point total is " + topics[saveJ] + ": " + lowest);
		}
	}



