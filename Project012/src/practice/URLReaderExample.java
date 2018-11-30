package practice;

import java.io.*;
import java.net.*;

public class URLReaderExample {

	public static void main(String[] args) throws Exception {
		try {
			URL google = new URL("http://www.google.com");
			BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
			String line;
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			
			in.close();
		} catch(MalformedURLException e) {
			System.out.println(e);
		}
	}
}