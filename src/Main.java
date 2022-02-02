import java.time.LocalTime;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		LocalTime tm = LocalTime.now();
		IntStream stream = IntStream.range(1, 10000);
		stream.forEach(text -> System.out.println(tm + " " + text));
	}

}