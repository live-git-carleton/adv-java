package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPersonObject_ObjectInputStream {
	public static void main(String[] args) {
		File file = new File("persons.dat");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Person person = null;
			person = (Person) objectInputStream.readObject();
			System.out.println("Read Object " + person);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {

		}
	}
}
