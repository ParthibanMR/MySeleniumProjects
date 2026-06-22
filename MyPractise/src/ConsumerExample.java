import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
		Consumer<String> printConsumer=new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		//t.forEach(printConsumer)--printconsumer-argument
  public static void main(String[] args) {
	List<String> l=Arrays.asList("parthi","arun");
	
	l.forEach(testing->System.out.println(testing));
}

}
