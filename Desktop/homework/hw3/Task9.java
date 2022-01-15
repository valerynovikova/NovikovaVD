//входня строка является целым числом
import java.util.regex.*;
public class Task9 {
	public static void main(String[] args) {
		String regex = 
	    "[-]*[0|1|2|3|4|5|6|7|8|9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("590");
		System.out.println(m.matches());
	}
}