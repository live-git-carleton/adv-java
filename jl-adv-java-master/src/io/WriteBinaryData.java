package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryData {
	public static void main(String[] args) throws IOException {
		// Declare the variables
		File file;
		FileOutputStream fileOutputStream;
		String message = "there are 2 types of people. One who can infer meaning from incomplete data";
		file = new File("message.txt");
		fileOutputStream = new FileOutputStream(file);
		byte messageInBytes[] = message.getBytes();
		// System.out.println((char) messageInBytes[0]);
		fileOutputStream.write(messageInBytes);
		System.out.println("Message written to file as bytes of data!");

	}
}
