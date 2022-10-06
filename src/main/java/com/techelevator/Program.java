package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException

	{
		Map<String, Product> productMap = new HashMap<>();
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
	}

}


