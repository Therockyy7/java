package workshop6;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentList extends ArrayList<Student>{
	String filename = "student.dat";
	// This là cái ArrayList.
	public StudentList() {
		super();
	}	
	public Student search(String code) {
		code = code.trim().toUpperCase(); 
		for (int i=0; i<this.size(); i++) 			 
			if (this.get(i).getCode().equals (code)) 
				return this.get(i); 
		return null; 
	}
	private Boolean isCodeDupplicated (String code) { 
		code = code.trim().toUpperCase(); 
		return search(code) != null;
	}
	public void addStudent() {
		String newCode;
		String newName;
		int newMark;
		Boolean codeDuplicate = false;
		do {
			newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
			newCode = newCode.trim().toUpperCase(); 
			codeDuplicate = isCodeDupplicated(newCode);
			if(codeDuplicate) System.out.println("Code is duplicated!");
		}while(codeDuplicate == true);
		newName = Inputter.inputNonBlankStr("Name of new student: ");
		newName = newName.toUpperCase();
		newMark = Inputter.inputInt("Mark: ", 0, 10);
		this.add(new Student(newCode, newName, newMark));
		System.out.println("Student " + newCode + " has been added");
	}
	public void searchStudent() {
		if (this.isEmpty()) {
			System.out.println("Empty list. No search can be performed!");
		}
		else{
			String code = Inputter. inputStr("Input student code for search: ");
			Student st = this.search (code); 
			if (st == null) {
				System.out.println("Student" + code + " doesn't existed!");
			}
			else {
				System.out.println("Found: " + st);
			}
		}
	}
	public void updateStudent () {		
		if (this.isEmpty()) {
			System.out.println("Empty list. No update can be performed!");
		}
		else {
			String code = Inputter.inputStr("Input code of updated student: "); 
			Student st = this.search(code);
			if (st == null) {
				System.out.println("Student " + code + " doesn't existed!");
			}else{
				String oldName = st.getName();
				String msg = "old name: " + oldName + ", new name:";
				String newName = Inputter.inputNonBlankStr(msg);
				st.setName(newName);
				int oldMark = st.getMark();
				msg = "Old mark: "+ oldMark + ", new mark 0..10:";
				int newMark = Inputter.inputInt(msg, 0, 10);
				st.setMark(newMark);
				System.out.println("Student + uCode + has been updated.");
			}
		}
	}
	public void removeStudent () {
		if (this.isEmpty()) {
			System.out.println("Empty list. No remove can be performed!");
		}else {
			String rCode =Inputter. inputStr("Input code of removed student: "); 
			Student st = this.search(rCode); 
			if (st==null) {
				System.out.println("Student " + rCode + " doesn't existed!");
			}else{
				this.remove(st); 
				System.out.println("Student " + rCode + " has been removed.");
			}
		}
	}
	public void printAll() {
		if (this.isEmpty()) {
			System.out.println("Empty list!");
		}else{
			System.out.println("Student list: "); 
			for (Student st: this) System.out.println(st);
			System.out.println("Total: " + this.size() + " student (s).");
		}
	}
}
