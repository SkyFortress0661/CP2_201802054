package practice;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLExample {
	public static void main(String[] args) throws MalformedURLException {
		URL myurl = new URL("http://java.sum.com:80/docs/books/tutorial" 
								+ "/index.html?name=database#TOP");
		System.out.println("protocol = " + myurl.getProtocol());
		System.out.println("authority = " + myurl.getAuthority());
		System.out.println("host = " + myurl.getHost());
		System.out.println("port = " + myurl.getPort());
		System.out.println("path = " + myurl.getPath());
		System.out.println("query = " + myurl.getQuery());
		System.out.println("filename = " + myurl.getFile());
		System.out.println("ref = " + myurl.getRef());
	}
}
