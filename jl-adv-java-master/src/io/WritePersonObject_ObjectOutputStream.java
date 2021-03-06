package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePersonObject_ObjectOutputStream {
	public static void main(String[] args) {
		File file = new File("persons.dat");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			Person person = new Person("Sam for Coffee", 5, 'M');
			System.out.println("Written Object ");
			objectOutputStream.writeObject(person);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
