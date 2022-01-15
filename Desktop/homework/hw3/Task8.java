//входная строка является корректным преставлением времени(? поч выдает фалс)
import java.util.regex.*;
public class Task8 {
	public static void main(String[] args) {
		String regex = 
	    "([0|1][0-9])|(2[0-3])[:][0-5][0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("13:59");
		System.out.println(m.matches());
	}
}

//паттерн просто задает строку,матчер проверяет