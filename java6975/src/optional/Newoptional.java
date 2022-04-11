package optional;

import java.util.Optional;

public class Newoptional {

	public static void main(String[] args) {

String[] str = new String[5];
str[3]="Java Programming";

Optional<String> checkNull = Optional.ofNullable(str[3]);


if(checkNull.isPresent()) {
	System.out.println(checkNull.get());
}
else {
	System.out.println("word is null");
}
	}

}
