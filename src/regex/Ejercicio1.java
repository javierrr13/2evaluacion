package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(
				new InputStreamReader(Ejercicio1.class.getResourceAsStream("/100-contacts.csv")));
		
		StringBuilder s = new StringBuilder();
		String linea;
		while((linea=in.readLine())!=null) {
			s.append(linea);
		}
		
		Pattern ex = Pattern.compile("(\\w(\\.\\w+)*)@\\w+(\\.\\w+)+");
		Matcher m = ex.matcher(s);
		while (m.find()) {
			int numgrupos = m.groupCount();
			for (int i = 0; i <= numgrupos; i++) {
				System.out.println(m.group(i));
			}
		}

	}

}
