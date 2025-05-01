package OptionalBasic;

import java.util.Optional;

public class OptinalBasicFirst {
	public static void main(String[] args) {
		String[] w = new String[10];
		Optional<String> aa = Optional.ofNullable(w[5]);
		if (aa.isPresent()) {
			String wordCheck = w[5].toLowerCase();
			System.out.println("fil");
		}

		else {
			System.out.println("it me ");
		}

	}
}
