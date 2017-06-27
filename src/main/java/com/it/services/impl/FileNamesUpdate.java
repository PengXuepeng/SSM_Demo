package com.it.services.impl;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class FileNamesUpdate {
	private Map<String, String> sourceFileNames;
	private Set<String> desFileIndex;
	private String sourcePath = "C:\\Users\\yangxuep\\Desktop\\spring m v c";
	private String desPath = "C:\\mvc";

	public void getSourceFileNames() {
		File file = new File(sourcePath);
		File[] listFiles = file.listFiles();
		sourceFileNames = new TreeMap();
		for (File fileItem : listFiles) {

			sourceFileNames.put(
					fileItem.getName().substring(0, 2).replace(".", ""),
					fileItem.getName().replace("尚硅谷_佟刚_SpringMVC_", "").replace(".zip", ".avi"));
			// System.out.println(fileItem.getName().substring(0,
			// 2).replace(".", "")+"+++++++"+
			// fileItem.getName().replace("尚硅谷_佟刚_SpringMVC_", ""));
		}
		// System.out.println("----------------------------------------------------");

	}

	@Test
	public void TestFun() {
		updateName();
		// getSourceFileNames();
//		getDesFileIndex();
//		Iterator<String> iterator = desFileIndex.iterator();
//		// while(iterator.hasNext()){
		// System.out.println(iterator.next());
		// }
		// Iterator<Entry<String,String>> iterator = map.entrySet().iterator();
		// while(iterator.hasNext()){
		// Entry<String,String> entry = iterator.next();
		// System.out.println(entry.getKey()+"--------"+entry.getValue());
		// }
	}

	public void updateName(){
		getSourceFileNames();
		File file = new File(desPath);
		File[] listFiles = file.listFiles();
		for (File fileItem : listFiles) {
			Iterator<Entry<String,String>> iterator = sourceFileNames.entrySet().iterator();
			while(iterator.hasNext()){
				Entry<String,String> entry = iterator.next();
				System.out.println(fileItem.getName().substring(0, 2).replace(".", ""));
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				if(fileItem.getName().substring(0, 2).replace(".", "").equals(entry.getKey() )){
					fileItem.renameTo(new File("C:\\newMvc\\"+entry.getValue()));
					break;
				}
			}
	
		}
	}

	public void getDesFileIndex() {
		File file = new File(desPath);
		File[] listFiles = file.listFiles();
		desFileIndex = new HashSet();
		for (File fileItem : listFiles) {
			desFileIndex.add(fileItem.getName().substring(0, 2)
					.replace(".", ""));
			// map.put(fileItem.getName().substring(0, 2).replace(".", ""),
			// fileItem.getName().replace("尚硅谷_佟刚_SpringMVC_", ""));
			// System.out.println(fileItem.getName().substring(0,
			// 2).replace(".", "")+"+++++++"+
			// fileItem.getName().replace("尚硅谷_佟刚_SpringMVC_", ""));
		}
		// System.out.println("----------------------------------------------------");

	}

}
