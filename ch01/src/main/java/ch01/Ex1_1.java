package ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex1_1 {
	
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList( new Apple[] {
			new Apple(10),
			new Apple(30),
			new Apple(20),
			new Apple(5)
		});
		
		// Anonymous Class 1
//		Collections.sort(inventory, new Comparator<Apple>() {
//			@Override
//			public int compare(Apple a1, Apple a2) {
//				return a1.getWeight().compareTo(a2.getWeight());
//			}
//		});
//		System.out.println(inventory);
		
		
		// Anonymouse Class 2
//		inventory.sort(new Comparator<Apple>() {
//			@Override
//			public int compare(Apple a1, Apple a2) {
//				return a1.getWeight().compareTo(a2.getWeight());
//			}
//		});
//		System.out.println(inventory);


		// 함수형 스타일1 - Method Reference
//		inventory.sort(Comparator.comparing(Apple::getWeight));
//		System.out.println(inventory);

		// 함수형 스타일2 - Lambda
		inventory.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());
		System.out.println(inventory);
	
	}
}