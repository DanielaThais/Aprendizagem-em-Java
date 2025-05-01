package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print); //usado o forEach pois se trata de uma função terminal
		
		System.out.println("\n\n***IMPRINDO ARRAY***\n" + marcas);
		
	}
}
