package com.srimannr.iostreams;

import java.io.*;

final class IOUtils {
	public static void copy(OutputStream out, InputStream in) throws IOException {
		byte[] buffer = new byte[4];
		int value;
		
		while ((value = in.read(buffer)) > 0) {
			out.write(buffer, 0, value);
		}
	}
	
	public static void byteCopy(OutputStream out, InputStream in) throws IOException {
		int n;
		while ((n = in.read()) != -1) {
			out.write(n);
		}
	}
	
	
}

public class IOStreamsEx2 {
	static void main() throws IOException {
		File output = new File("/home/sriman/Desktop", "output.txt");
		try (FileOutputStream outStream = new FileOutputStream(output, true);
		     FileReader fread = new FileReader(output);) {
			IOUtils.byteCopy(outStream, System.in);
			int value;
			char[] buf = new char[1024];
			int n = fread.read(buf);
			for (int i = 0; i < n; i++) {
				System.out.print(buf[i]);
			}
			System.out.println();
		}
	}
}
