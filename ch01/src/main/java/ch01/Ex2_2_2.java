package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Ex2_2_2 {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList( new Apple[] {
				new Apple(100, "red"),
				new Apple(300, "green"),
				new Apple(200, "red"),
				new Apple(500, "green")
			});
		
		// Method Reference
		List<Apple> list = filterApples(inventory, Ex2_2_2::isGreenApple);		
		list = filterApples(list, Ex2_2_2::isHeavyApple);
		for(Apple apple : list) {
			System.out.println(apple);
		}
		
		
		System.out.println( "==========================================" );
		
		// Lambda
		list = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		list = filterApples(list, (Apple a) -> a.getWeight() > 150);
		for(Apple apple : list) {
			System.out.println(apple);
		}
		
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<Apple>();
		
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}
	
	public static <T> Collection<T> filter(Collection<T> c, Predicate<T> p){
		List<T> result = new ArrayList<T>();
		for(T t : c) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
}
