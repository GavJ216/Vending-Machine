package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Product> productMap = new HashMap<>();
		User user = new User();

		String invPath = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team4\\vendingmachine.csv";
		File invFile = new File(invPath);
		try (Scanner invScanner = new Scanner(invFile)) {
			while (invScanner.hasNextLine()) {
				String currentLine = invScanner.nextLine();
				String[] productParts = currentLine.split(",");
				String productLocation = productParts[0];
				String productName = productParts[1];
				double productPrice = Double.parseDouble(productParts[2]);
				String productType = productParts[3];
				productMap.put(productLocation, new Product(productName, productPrice, productType));

			}
		}


		System.out.println("*************************************************************");
		System.out.println("*Very-Convenient-Vending-Service-Tron-O-Matic-1006-PLUS-9001*");
		System.out.println("*************************************************************");

		// menu

		Scanner userRead = new Scanner(System.in);


		System.out.println("(1) Display Vending Machine Items"); // print inventory and return to this menu
		System.out.println("(2) Purchase");                     //
		System.out.println("(3) Exit");
		String userChoice = userRead.nextLine();        // expecting 1 - 3

		while (userChoice != "3"){
			if (userChoice.equals("1")) {
				//output inventory screen and return to menu
				Set<String> keys = productMap.keySet();
				for (String key : keys){
					System.out.println(key +" "+ productMap.get(key).getName() + " " + productMap.get(key).getPrice() + " (" + productMap.get(key).getStock()+ " in stock)");

				}
		}
			else if(userChoice.equals("2")) {
				System.out.println("(1) Feed Money");
				System.out.println("(2) Select Product");
				System.out.println("(3) Finish Transaction");
				String purchaseChoice = userRead.nextLine();
				while(purchaseChoice ){


				}



			}


			//user input #


		}

	}
}


