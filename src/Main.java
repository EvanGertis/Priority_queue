import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		numbers.add(750);
		numbers.add(500);
		numbers.add(900);
		numbers.add(100);
		
		System.out.println(numbers.toString());
		
		while(!numbers.isEmpty())
		{
			System.out.println(numbers.remove());
			System.out.println(numbers.toString());
		}
		
		Comparator<String> stringLengthComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		
		System.out.println(stringLengthComparator.compare("Evan", "Tommmmmmmmm"));
		
		Comparator<String> stringLengthComparatorLambda = (s1, s2) -> {
			return s1.length() - s2.length();
		};
		
		System.out.println(stringLengthComparatorLambda.compare("Evan", "Tommmmmmmmm"));
		
		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
		
		namePriorityQueue.add("long");
		namePriorityQueue.add("longer");
		namePriorityQueue.add("longest");
		
		System.out.println(namePriorityQueue.toString());
		
	}

}
