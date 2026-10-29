package com.srimannr.iostreams;

import java.io.*;

public class IOStreamsEx3 {
	static void main(String[] args) throws IOException {
		File f1 = new File("/home/sriman/Desktop/output.txt");
		Integer integer = 3987;
		try(FileOutputStream fOutput = new FileOutputStream(f1,true);){
			fOutput.write(integer.toString().getBytes());
		}
		try(FileOutputStream fOutput = new FileOutputStream(f1,true);
		    DataOutputStream fdos = new DataOutputStream(fOutput);
		    FileInputStream fInput = new FileInputStream(f1)){
			fdos.writeInt(integer);
		}
	}
}
