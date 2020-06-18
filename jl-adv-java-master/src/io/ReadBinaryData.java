package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBinaryData {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("message.txt");

		int asciiOfCharacter = inputStream.read();
		while (asciiOfCharacter != -1) {
			System.out.print((char) asciiOfCharacter);
			asciiOfCharacter = inputStream.read();
		}
//best practice to close the stream
		inputStream.close();
	}
}
