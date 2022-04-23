package org.home.myapp;

import org.home.myapp.service.*;

// notation camelCase, parmis les bonnes pratiques
public class MyApp {
	public static void main(String[] args) {
		System.out.println("Hello World !!");

		if (args.length != 2) {
			System.out.println(String.format("You must provide two argument!"));
			System.exit(0);
		}
		System.out.println("Hello World !!!");

		MyService service = new MyService();

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

		double result = service.compute(a, b);
		System.out.println(String.format("Sum of %s and %s is %s", a, b, result));
	}
}