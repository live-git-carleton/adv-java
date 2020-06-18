package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamReadPersonData {
	public static void main(String[] args) throws IOException {
		// Establishing the streams
		FileInputStream fileInputStream = new FileInputStream("persondata.dat");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);

		// Fetching all the primitive types
		int personID = dataInputStream.readInt();
		int age = dataInputStream.readInt();
		float salary = dataInputStream.readFloat();

		// Storing it back onto a person object
//		System.out.println(personID);
//		System.out.println(age);
//		System.out.println(salary);

		Person2 person2 = new Person2();
		person2.setPersonID(personID);
		person2.setAge(age);
		person2.setSalary(salary);

		System.out.println(person2);

	}
}
