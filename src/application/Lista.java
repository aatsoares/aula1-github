package application;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

			List<String> list=new ArrayList<>();
			
			list.add("Maria");
			list.add("Joao");
			list.add("Andre");
			list.add("Alfredo");
			
			list.add(3,"Rav Moise");
			
			for (String x: list) {
				System.out.println(x);
				
			}
			
			System.out.println(list.size());
			System.out.println(list.get(2));
			
			System.out.println("--------------------------");
			list.remove(1);
			list.removeIf(x -> x.charAt(0)=='J');
			
			for (String x: list) {
				System.out.println(x);
				
			}
			System.out.println("--------------------------");
			List<String> result=list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
			
			for (String x: result) {
				System.out.println(x);				
			}
			System.out.println("--------------------------");
			
			String name=list.stream().filter(x -> x.charAt(0)=='P').findFirst().orElse(null);
			System.out.println(name);
			
			
	}

}
