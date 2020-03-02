package com.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import model.Product;

public class TestIterator {

	

	public static void main(String[] args) {
		
		Product product=new Product(101,"cake",15);
		Product product2=new Product(102,"samosa",20);
		Product product3=new Product(103,"cheese sticks",12);	
		//LinkedHashSet<Product> hashSet=new LinkedHashSet<Product>();	
		ArrayList <Product> hashSet=new ArrayList<Product>();
		hashSet.add(product);
		hashSet.add(product2);
		hashSet.add(product3);
		Iterator<Product> iterator=hashSet.iterator();
		//ListIterator<Product> listIterator=hashSet.listIterator();
		while(iterator.hasNext())
		{
			
			Product product4=iterator.next();
			System.out.println(product4.getProId());
			System.out.println(product4.getProName());
			System.out.println(product4.getProPrice());
			if(product4.getProPrice()>15)
			{
				iterator.remove();
				System.out.println("product has been removed");
			}
			
		}
		Iterator<Product> iterator2=hashSet.iterator();
		while(iterator2.hasNext())
		{
			
			Product product4=iterator2.next();
			System.out.println(product4.getProId());
			System.out.println(product4.getProName());
			System.out.println(product4.getProPrice());
			
		}
		/*
		while(listIterator.hasPrevious())
		{
			Product product4=listIterator.previous();
			System.out.println(product4.getProId());
			System.out.println(product4.getProName());
			System.out.println(product4.getProPrice());
		}
		*/
	}

}
