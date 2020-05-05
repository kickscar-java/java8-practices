package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2_2_1 {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList( new Apple[] {
				new Apple(100, "red"),
				new Apple(300, "green"),
				new Apple(200, "red"),
				new Apple(500, "green")
			});
		
			List<Apple> list = filterGreenApples(inventory); 
			for(Apple apple : list) {
				System.out.println(apple);
			}
			
			list = filterHeavyApples(inventory); 
			for(Apple apple : list) {
				System.out.println(apple);
			}
	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
