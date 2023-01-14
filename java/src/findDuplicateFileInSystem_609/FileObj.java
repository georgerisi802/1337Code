package findDuplicateFileInSystem_609;

public class FileObj {
	String path;
	String name;
	String content;
	
	FileObj(String path, String name, String content){
		this.path = path;
		this.name = name;
		this.content = content;
	}
	
	void printFile() {
		System.out.println("Path: " + this.path);
		System.out.println("Name: " + this.name);
		System.out.println("Content: " + this.content);
	}
}
