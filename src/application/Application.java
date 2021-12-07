package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Application {
	public static void main(String [] args) {
		List <Product> list = new ArrayList<>();
		list.add(new Product("Computer",1750.65));
		list.add(new Product("Tv",2450.65));
		list.add(new Product("Tablet",900.00));
		list.add(new Product("Iphone",4500.0));
		
		list.forEach(System.out::println);
		System.out.println("---------------");
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		System.out.println("------------EXPRESSAO LAMBDA -------------------");
		
		Function<Product, String>func = p -> {
			return p.getName().toLowerCase();
		};
		Function<Product,String> fun = p -> p.getName().toLowerCase();
		
		
		List<String>lambNames = list.stream().map(func).collect(Collectors.toList());
		lambNames.forEach(System.out::println);
		
		List<String> lambNam = list.stream().map( p -> {
			return p.getName().toUpperCase();
		}).collect(Collectors.toList());
		
		System.out.println("-------------------------------");
		lambNam.forEach(System.out::println);
		
		System.out.println(" - - -- - - - - - --- -");
		List<String> ntrans = list.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());
		ntrans.forEach(System.out::println);
	}
}
