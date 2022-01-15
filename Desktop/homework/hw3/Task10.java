// проверить что входная строка корректна,т е любая входная строка
import java.util.regex.*;
public class Task10 {
	public static void main(String[] args) {
		String regex = 
	    "[A-Za-z_][A-Za-z_0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("AZ");
		System.out.println(m.matches());
	}
}