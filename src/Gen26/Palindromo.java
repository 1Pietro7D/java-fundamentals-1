package Gen26;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize a variable maxPalindrome with value 0
		int maxPalindrome = 0;

		//Outer loop that goes from 999 to 100 (in descending order)
		for (int i = 999; i >= 100; i--) {
		    //Inner loop that goes from i to 100 (in descending order)
		    for (int j = i; j >= 100; j--) {
		        //Calculate the product of i*j
		        int product = i * j;
		        //Convert the product to a string
		        String productString = Integer.toString(product);
		        //Create a StringBuilder object from the product string
		        StringBuilder productBuilder = new StringBuilder(productString);
		        //If the product string is equal to its reversed version (palindrome)
		        if (productString.equals(productBuilder.reverse().toString())) {
		            //Update the maxPalindrome variable with the maximum value between its current value and the product
		            maxPalindrome = Math.max(maxPalindrome, product);
		            //Exit the inner loop
		            break;
		        }
		    }
		    //If maxPalindrome is greater than i*999, exit the outer loop
		    if (maxPalindrome > i * 999) break;
		}
		//Print the result
		System.out.printf("The largest palindrome made from the product of two 3-digit numbers is: %d ", maxPalindrome);
	}

}


