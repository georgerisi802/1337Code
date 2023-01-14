package findDuplicateFileInSystem_609;
/*
 * Given a list paths of directory info, including the directory path, and all the files with contents in this 
 * directory, return all the duplicate files in the file system in terms of their paths. You may return the answer 
 * in any order.
 * 
 * A group of duplicate files consists of at least two files that have the same content.
 * 
 * A single directory info string in the input list has the following format:
 *		"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * 
 * It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content) 
 * respectively in the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0. If m = 0, it means the directory 
 * is just the root directory.
 * 
 * The output is a list of groups of duplicate file paths. For each group, it contains all the file paths of the 
 * files that have the same content. A file path is a string that has the following format:
 * 		"directory_path/file_name.txt"
 */

import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

public class Solution {
	List<List<String>> findDuplicate(String[] paths){
		
		// Put all the files in a list of file objects
		String[] filePath;
		String[] fileDetails;
		FileObj f;
		HashMap<String, List<String>> duplicateMap = new HashMap<>();
		
		for(String entry : paths) {
			filePath = entry.split(" ");
			for(int i=filePath.length-1; i > 0; i--) {
				fileDetails = filePath[i].split("\\(");
				f = new FileObj(filePath[0], fileDetails[0], fileDetails[1]);
				
				if(duplicateMap.containsKey(f.content)) {
					List<String> temp = duplicateMap.remove(f.content);
					temp.add(new String(f.path + "/" + f.name));
					duplicateMap.put(f.content, temp);
				}
				else {
					List<String> temp = new LinkedList<String>();
					temp.add(new String(f.path + "/" + f.name));
					duplicateMap.put(f.content, temp);
				}
			}
		}
		
		// Put the duplicates in the result list
		List<List<String>> result = new LinkedList<List<String>>();
		
		for(List<String> val : duplicateMap.values()) {
			if(val.size() > 1) {
				result.add(val);
			}
		}
		return result;
	}
}
