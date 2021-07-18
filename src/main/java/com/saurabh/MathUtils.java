package com.saurabh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathUtils {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		
		return 3.14*radius*radius;
	}
	
	public static void main(String args[]) {
		Map<Integer, Long> mp = Stream.of(1,1,2,3,4,4)
				.collect(
						Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()))
				;
		
//		mp.entrySet()
		
		Stream.of(mp.entrySet().toArray(new Map.Entry[0]))
			.filter(map -> ((Long)map.getValue() == 1))
			.forEach(m -> System.out.println(m));
		int[] a = {10,2,3,4};

		
		// For primitive
		IntStream s = Arrays.stream(a);
		s.filter(w -> w % 2 == 0)
		.forEach(ar -> System.out.println(ar));

		
		List<Integer> streamInt = IntStream.of(1,2,3,4)
		.boxed()
		.collect(Collectors.toList());
		

		
//		
		Stream<Map.Entry<Integer, Long>> stream = Stream.of(mp.entrySet().toArray(new Map.Entry[mp.size()]));
//		stream.forEach( m -> System.out.println(m.getKey()+ "-> " + m.getValue()));
		stream.filter(map -> map.getValue()==1 )
		.forEach(m -> System.out.println(m));
		
		mp.entrySet().stream()
			.filter( m -> m.getValue()==1 )
			.forEach(m -> System.out.println(m));
		
		mp.forEach((k,v) -> {
			if(v==1)
				System.out.println(k);
		});
	
		
	}
	
	
}
