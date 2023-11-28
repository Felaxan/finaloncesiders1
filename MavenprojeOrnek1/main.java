package ders11yazilim;
import org.apache.commons.lang3.StringUtils;

public class main {

	public static void main(String[] args) {
		
		String hataliMetin = " M ed i p     o         l";
		System.out.println("Hatali metin: " +hataliMetin);
		
		
		String duzgunMetin = StringUtils.deleteWhitespace(hataliMetin);
		System.out.println("Düzgün metin: " +duzgunMetin);
		
		


	}

}
