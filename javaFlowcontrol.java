	package myLearning;
	import java.util.Scanner;
	import java.util.*;
	
	public class javaFlowcontrol 
	{
		//public static int maxNum = 75;
		
		public static void main(String[] args)
		{
			try {
			//String customName;
					
		String myContinue = "YES";
		while (myContinue.equals("Y") || myContinue.equals("YES"))
		{
		//Scanner input = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");     // type a word and hit enter
		String customName = scanner.next();
		System.out.println("Hello " + customName);
		
		
		//Scanner scanner1 = new Scanner(System.in);
		System.out.println("Would you like to continue? (Y/N) : "); 
		String goingOn = scanner.next();
		goingOn = goingOn.toUpperCase();
		System.out.println(goingOn);
		
		if(goingOn.equals("Y") || goingOn.equals("YES")) 
			
				{ System.out.println("Great job! answer the next! ");}
		else {
			System.out.println("Please return later to complete the survey.");
			return ;
		}
				

		//Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a red car? (yes, no): "); 
		String askCustomer = scanner.next();
		askCustomer = askCustomer.toUpperCase();
		System.out.println(askCustomer);
		
		if(askCustomer.equals( "Y") || askCustomer.equals ("YES"))
			
		{System.out.println("Great job! answer the next!");}
		else{
			System.out.println("Invalid data");
			
		}
		
		
				
				
		System.out.println("Enter the name of your favourite pet : ");
		//String pet = input.nextLine();
		String pet = scanner.next();
		System.out.println(pet);
		
		
		
		
		System.out.println("Enter the age of your favourite pet: ");
		int num = Integer.parseInt(scanner.next());
	   //This method reads the number provided using keyboard
		System.out.println(num);
		
		
		System.out.println("What is your lucky number?");
		int luckyNumber = Integer.parseInt(scanner.next());
	
		System.out.println(luckyNumber);
		
		System.out.println("Do you have a favorite quarterback?");
		String quaterback = scanner.next();
	
		quaterback = quaterback.toUpperCase();
		System.out.println(quaterback);
		
		
		
		
		
		System.out.println(quaterback);
		int jerseyNumber=0;
		if(quaterback.equals( "Y") || quaterback.equals ("YES"))
		{
			System.out.println("what is his jersey number?");
		     jerseyNumber = Integer.parseInt(scanner.next());
			System.out.println(jerseyNumber);
		}
		else 
		{
			System.out.println("Wooops! No favorite Quaterback?");
		}
		
		System.out.println("What is two-digit model year of their car?");
		int twodigitModel =  Integer.parseInt(scanner.next());
		System.out.println(twodigitModel);
		
		System.out.println("What is the first name of the your favorite actor or actress?");
		String favoriteact = scanner.next();
		System.out.println(favoriteact);
		
		
		System.out.println("Enter Random Numbers between 1-50 : ");
		int ranNumber = Integer.parseInt(scanner.next());
		System.out.println(ranNumber);
		
		
		//Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers. 
		//The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.  
		
		int MagicBall=0;
		
		int[] lotteryNum= {0,0,0,0,0};
		Random lNum = new Random();
		for(int i=0;i<5;i++) 
		{
		  
		   lotteryNum[i]= lNum.nextInt(65);
		   //System.out.println(lotteryNum[i]);
		}
		  int[] magicBall = {0,0,0,0,0};
		  //Random mNum = new Random();
		  
		  for(int i=0;i<5;i++) 
		  {
			  magicBall[i]= lNum.nextInt(75);
			 // System.out.println(magicBall[i]);
			  
			  
		  }
		  
		  //It should be the user's favorite quarterback jersey number *or* their lucky number, multiplied by one of the random numbers. 
		  //Make sure that the answer is less the max "magic" number of 75;
		  //if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number. 
		  
		  int deciDe = lNum.nextInt(2);
		  int calcuLation =0;
		  int OneofFive = lNum.nextInt(5);
		  System.out.println(OneofFive);
		  if(deciDe==1)
		  {
		   //calcuLation = (jerseyNumber * ranNumber);
		   calcuLation = (jerseyNumber * lotteryNum[OneofFive]);
		 	 
		  }
		  else
		  {
			  //calcuLation = (luckyNumber * ranNumber);
			  calcuLation = (luckyNumber * lotteryNum[OneofFive]);
		  }
		  
		       
		  if(calcuLation >75 ) 
		  {
			  calcuLation = calcuLation - 75;
		  }
		  
		  MagicBall=calcuLation;
		  System.out.println(MagicBall);
		  
		  //For the 5 non-magic numbers use your choice of any of the following methods to generate values:
		  //(Note that you may have to adjust each value to correct range by adding/subtracting.)
		  // Favorite quarterback number + age of pet + lucky number.
		  
		  
		  int newNumber= jerseyNumber+luckyNumber+num;
		  int[] nonMagicnum = {0,0,0,0,0};
		 		  
		  for(int i=0;i<5;i++) 
		  {
			  nonMagicnum[i]= lNum.nextInt(newNumber);
			//  System.out.println(nonMagicnum[i]);
			  
			  
		  }
		  //sorting the integer array
		  Arrays.sort(nonMagicnum);
		 // System.out.println(" Before Duplicate Search: " + Arrays.toString(nonMagicnum));
		  // remove duplicate arrays
		  int myTmp=0;
		  int arrSize=0;
		  for(int i=0;i<5;i++) 
		  {
			  myTmp=nonMagicnum[i];
			  //System.out.println(myTmp);
			  
			  for(int j=i+1;j<5;j++) 
			  {
				  //System.out.println(nonMagicnum[j]);
				  
				  if (myTmp == nonMagicnum[j]) 
				  {
					 // System.out.println("duplicate");
					  nonMagicnum[j]=-1;
					//  System.out.println(nonMagicnum[j]);
					  arrSize=arrSize+1;
				  }
			  }
			  
			 		  
		  }
		  int[] newnonMagicnum = new int[5-arrSize];
		  int k = 0;
		  for(int i=0;i<5;i++) 
		  {
			  if (nonMagicnum[i] > -1) 
			  {
				  newnonMagicnum[k]=nonMagicnum[i];
				  k++;
			  }
		  }
		//String strnonMagicnum=Arrays.toString(nonMagicnum);
		//System.out.println(" Lottery numbers Before Duplicate Removal: " + Arrays.toString(nonMagicnum) + " Magic ball: " +  MagicBall );//Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
		System.out.println(" Lottery numbers: " + Arrays.toString(newnonMagicnum) + " Magic ball: " +  MagicBall );
		System.out.println(" Do you wish to play again? (y/n)");
		myContinue = scanner.next();
		
		myContinue = myContinue.toUpperCase();
		System.out.println(myContinue);
		if(myContinue.equals("Y") || myContinue.equals("YES")) 
			
			{ 
				System.out.println("Start from the beginning ");
			}
			else {
				System.out.println("Thanks for playing.Have a great day!");
				return ;
			}
		
		
			}
			}
			catch (Exception e)
			{
				System.out.println("Invalid input. Try again");
				return;
			}
			}
			
		}
		
		  
	
	
	
	
		
		
		
	
	
		
		
		
		