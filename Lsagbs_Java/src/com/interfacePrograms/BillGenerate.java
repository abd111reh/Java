package com.interfacePrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BillGenerate {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		Scanner scanner=new Scanner(System.in);
		Invoice invoice=new Invoice();
		System.out.println("Welcome to Our Shopping Center");
		System.out.println("Enter The Customer Name");
		invoice.customerName(scanner.nextLine());
		System.out.println("Enter The Customer Address");
		invoice.detailofCustomer(scanner.nextLine());
		System.out.println("Enter The Product Name");
		invoice.productName(scanner.nextLine());
		System.out.println("Enter The Product Quantity");
		invoice.productQuantity(scanner.nextInt());
		System.out.println("Enter The Single Product Price");
		invoice.productPrice(scanner.nextDouble());
		System.out.println();
		System.out.println();
		/*
		 * System.out.println("Customer Name     "+invoice.name);
		 * System.out.println("Customer Address  "+invoice.add);
		 * System.out.println("Product Name	  "+invoice.product);
		 * System.out.println("Product Quantity  "+invoice.qty);
		 * System.out.println("Product Price     "+invoice.price);
		 * System.out.println("Total Amount      "+invoice.calculateAmount());
		 */
		list.add("Customer Name     "+invoice.name);
		list.add("Customer Address  "+invoice.add);
		list.add("Product Name	  "+invoice.product);
		list.add("Product Quantity  "+invoice.qty);
		list.add("Product Price     "+invoice.price);
		list.add("Total Amount      "+invoice.calculateAmount());
		for (Object object : list) {
			System.out.println(object);
			
		}
		
			
		
			
		}
	}

