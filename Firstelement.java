package firstelement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Firstelement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B","c","D");
		Optional<String> result = list.stream().findFirst();
		if(result.isPresent()) {
			System.out.println(result.get());
		}
		else {
			System.out.println("no result");
		}
			}
		
}
