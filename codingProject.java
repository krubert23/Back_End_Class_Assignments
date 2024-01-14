package week04;

public class codingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 
		System.out.println("1. ");
		
		// Create an array of int called ages that contains:
		// 3, 9, 23, 64, 2, 8, 28, 93
		
		int [] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		System.out.println("Here is my age array:");
		for(int age : ages) {System.out.print(age + " ");}
		
		//Programmatically subtract the value of the first element
		//from the value in the last element
		int differenceInElements = ages[ages.length-1] - ages[0];
		
		//print to the console
		System.out.println(" ");
		System.out.println("The last element in the array (93) minus the first element in the array (3):");
		System.out.println(differenceInElements);
		
		//create a new array of int called ages2 with 9 elements
		int [] ages2 = new int[9];
		ages2[0] = 23;
		ages2[1] = 27;
		ages2[2] = 30;
		ages2[3] = 33;
		ages2[4] = 61;
		ages2[5] = 59;
		ages2[6] = 11;
		ages2[7] = 9;
		ages2[8] = 7;
		
		//subtract the first element from the last element
		//the last element is always the length of the array -1 and the first element is always 0
		int differenceInElements2 = ages2[ages2.length-1] - ages2[0];
		
		//show that using the index values for the elements is dynamic
		System.out.println("The last element in the array (7) minus the first element in the array (23):");
		System.out.println(differenceInElements2);
		//This is dynamic because it is the same code, but is able to calculate two different problems.
		
		
		//use a loop to iterate through the array and calculate the average age
		//First I'm going to add up all of the ages then I will divide by the length of the array to get the average
		int sumOfAges = 0;
		for(int i = 0; i < ages2.length; i++) {sumOfAges += ages2[i];}
		int averageAge = sumOfAges / ages2.length;
		//print result to the console
		System.out.println("The average age in the second ages array is: " + averageAge);
		
		//2. 
		System.out.println("2. ");
		//Create an array of String called names that contains:
		//"Sam", "Tommy", "Tim", "Sally", "Buck", and "Bob"
		
		String [] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		
		System.out.println("Here is my name array:");
		for(String name : names) {System.out.print(name + " ");}
		System.out.println(" ");
		//use a loop to iterate through the array and calculate the average number of letters per name
		//This loop is going through the whole array and adding all of the letters in each name (by finding the length of that name) and then dividing by the length of the array to get the average
		int lettersInArray = 0;
		for(String name : names) {lettersInArray += name.length();}
		
		int averageLettersPerName = lettersInArray / names.length;
		
		//print result to console
		System.out.println("The average amount of letters per name is: " + averageLettersPerName);
		
		//use a loop to iterate through again and concatenate all the names together, separated by spaces
		//print to the console
		for(String name : names) {System.out.print(name + " ");}
		System.out.println(" ");
		
		
		
		//3.
		System.out.println("3. ");
		//How do you access the last element of any array?
		System.out.println("To access the last element of an array you look at array[array.length -1]");
		
		//4.
		System.out.println("4. ");
		//How do you access the first element of any array?
		System.out.println("To access the first element of an array you look at array[0]");
		
		//5. 
		System.out.println("5. ");
		//Create a new array of int called nameLengths. 
		int [] nameLengths = new int[6];
		
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		//This loop takes each element at the current iteration, finds its length, and puts that length into the new array
		for(int i = 0; i < names.length; i++) {nameLengths[i] = names[i].length();}
		for(int i = 0; i < names.length; i++) {System.out.print(nameLengths[i] + " ");}
		System.out.println(" ");

		
		//6. 
		System.out.println("6. ");
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//This loop calculates the sum of all the name lengths by taking each value at the current iteration and adding them together
		int sumOfNameLengths = 0;
		for(int i = 0; i < nameLengths.length; i++) {sumOfNameLengths += nameLengths[i];}
		
		//print result to the console
		System.out.println("The sum of all the elements in the array name lengths is: " + sumOfNameLengths);
		
		//Test to see if my method will print the word the number of times I tell it to
		System.out.println("7. ");
		System.out.println(repeatWord("Heyo", 7));
		
		//Test to see if my method will print out my full name
		System.out.println("8. ");
		System.out.println(fullName("Ryn", "Rubert"));
		
		//Test to see if my ages array has a sum that is greater than 100
		System.out.println("9. ");
		System.out.println(isGreaterThan100(ages));
		
		//Test to see if my method will find the average of an array of double
		System.out.println("10. ");
		//I need to make an array of double in order to test my method
		double[] price = new double[4];
		price[0] = 11.45;
		price[1] = 8.75;
		price[2] = 3.25;
		price[3] = 1.55;
		System.out.println("The average price in the array price is: $" + average(price));
		
		//Test to see if my method will take two double arrays and see if the average of the first is larger than the average of the second
		System.out.println("11. ");
		//I need another double array to test this method
		double[] price2 = new double [5];
		price2[0] = 11.55;
		price2[1] = 21.67;
		price2[2] = 13.33;
		price2[3] = 18.45;
		price2[4] = 20.00;
		
		System.out.println("The first price array has a higher average than the second price array:");
		System.out.println(higherAverage(price, price2));
		System.out.println(higherAverage(price2, price));

		
		//Test to see if my method will determine whether it is hot outside or not and if I have enough money to buy a drink for the heat
		System.out.println("12. ");
		System.out.println("It is hot outside and I have $12.50. Am I able to buy a drink? " + willBuyDrink(true, 12.50));
		System.out.println("It is not hot outside and I have $12.50. Am I able to buy a drink? " + willBuyDrink(false, 12.50));
		System.out.println("It is hot outside and I have $8.50. Am I able to buy a drink? " + willBuyDrink(true, 8.50));
		System.out.println("It is not hot outside and I have $8.50. Am I able to buy a drink? " + willBuyDrink(false, 8.50));
		
		//Test to see if my method will take a test score and return a letter grade
		System.out.println("13. ");
		System.out.println("A 75.83 is a grade: " + letterGrade(75.83));
		System.out.println("A 65.83 is a grade: " + letterGrade(65.83));
		System.out.println("A 55.83 is a grade: " + letterGrade(55.83));
		System.out.println("A 85.83 is a grade: " + letterGrade(85.83));
		System.out.println("A 95.83 is a grade: " + letterGrade(95.83));
	}
	//The rest of the questions are methods, so I am writing them outside of the current method, but still inside the class
	// Then I am invoking each method inside of the method above to verify that they do work

		//7. 
	
		//Write a method that takes a String, word, and an int, n, as arguments
		//and returns the word concatenated to itself n number of times.
		
		public static String repeatWord(String word, int n) {
			String result = " ";
			for(int i = 0; i < n; i++) {result += word + " ";
		}
			return result;}
		
		//8.
	
		//Write a method that takes two Strings, firstName and lastName, and returns a full name with a space in between
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
		
		//9. 
	
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		public static boolean isGreaterThan100(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {sum += arr[i];}
			if(sum > 100) {return true;}
			else {return false;}
		}
		
		
		//10.
	
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double average(double[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {sum += arr[i];}
			int mean = sum / arr.length;
			return mean;
		}
		
		
		//11. 
	
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static boolean higherAverage(double[] arr1, double[] arr2) {
			int sum1 = 0;
			for(int i = 0; i < arr1.length; i++) {sum1 += arr1[i];}
			int mean1 = sum1 / arr1.length;
			
			int sum2 = 0;
			for(int i = 0; i < arr2.length; i++) {sum2 += arr2[i];}
			int mean2 = sum2 / arr2.length;
			
			if(mean1 > mean2) {return true;}
			else {return false;}
		}
		
		
		//12. 
	
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside == true && moneyInPocket > 10.50) {return true;}
			else {return false;}
		}
		
		
		//13. 
	
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		//My method will take in a score on a test and return a letter grade
		
		public static String letterGrade(double grade) {
			if(grade < 60.00) {return "F";}
			else if(grade < 70.00) {return "D";}
			else if(grade < 80.00) {return "C";}
			else if(grade < 90.00) {return "B";}
			else {return "A";}
		}

}
