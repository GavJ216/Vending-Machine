package com.techelevator;

import com.techelevator.product.Beverage;
import com.techelevator.product.Candy;
import com.techelevator.product.Chips;
import com.techelevator.product.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)

	{
		System.out.println("Hello World!");
		Product test = new Beverage("chunk", .50);
		System.out.println(test.getMessage());




	}

}

//	String invListPath = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team4\\vendingmachine.csv";
//	File inventoryList = new File(invListPath);
//		try (Scanner invScanner = new Scanner(inventoryList);){
//				while (invScanner.hasNextLine()) {
//				inventory.put(1st scan, 2nd scan);
//
//				}
//				}
//				catch (FileNotFoundException e) {
//				System.out.println("WARNING: NO INV LIST FOUND");
//				}
//
