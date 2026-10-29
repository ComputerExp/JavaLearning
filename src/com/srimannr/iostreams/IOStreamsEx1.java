package com.srimannr.iostreams;

import java.io.File;
import java.io.FilenameFilter;

class DirectoryTree {
	private static int level = 0;
	
	public static void traverse(File dir) {
		DirectoryTree.selectTraverse(dir, new AllowAll());
	}
	
	public static void selectTraverse(File dir, FilenameFilter filter) {
		File[] files = dir.listFiles(filter);
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					if (file.getName().equals(".git"))
						continue;
					StringBuilder arrows = new StringBuilder();
					arrows.repeat("> ", level);
					System.out.println(arrows + "Files/Directories under " + file.getName());
					level++;
					selectTraverse(file, filter);
					level--;
				} else {
					StringBuilder name = new StringBuilder();
					name.append("> ".repeat(level)); //JDK 17 fn
//					for (int i = 0; i < level; i++) {
//						name.append("> ");
//					}
//					name.repeat(">", Math.max(0, level));
					name.append(file.getName());
					System.out.println(name);
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static boolean containsFile(File dir, String extension) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					if (file.getName().endsWith(extension)) {
						return true; // Match found, exit immediately
					}
				} else if (file.isDirectory()) {
					// If the subdirectory contains the file, return true immediately
					if (containsFile(file, extension)) {
						return true;
					}
				}
			}
		}
		return false; // No match found after scanning everything
	}
}
class SQLFileFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		File childItem = new File(dir, name);
		if(childItem.isFile()){
			return name.endsWith(".sql");
		}
		return DirectoryTree.containsFile(childItem, ".sql");
	}
}
class AllowAll implements FilenameFilter{
	@Override
	public boolean accept(File dir, String name) {
		return true;
	}
}
public class IOStreamsEx1 {
	public static void main(String[] args) {
		File basepath  = new File("/home/sriman/Desktop/Dev/");
//		DirectoryTree.selectTraverse(basepath,new SQLFileFilter());
		DirectoryTree.traverse(basepath);
	}
}
