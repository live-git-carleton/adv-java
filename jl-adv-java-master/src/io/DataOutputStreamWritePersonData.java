package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamWritePersonData {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("persondata.dat");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		Person2 person2 = new Person2();
		person2.setPersonID(100);
		person2.setAge(99);
		person2.setSalary(10000);
		dataOutputStream.writeInt(person2.getPersonID());
		dataOutputStream.writeInt(person2.getAge());
		dataOutputStream.writeFloat(person2.getSalary());
		dataOutputStream.close();
		fileOutputStream.close();
		System.out.println("Done yay!");
	}
}
