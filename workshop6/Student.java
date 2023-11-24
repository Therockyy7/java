package workshop6;


public class Student {
	private String code;
	private String name;
	private int mark;
	public Student() {
		
	}
	public Student(String code, String name, int mark) {
		this.code = code;
		this.name = name;
		this.mark = mark;
	}
	
	//getter and setter
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name.trim().toUpperCase();
		if(name.length()>0) this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		if(mark >= 0 && mark < 10) this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", mark=" + mark + "]";
	}
	
}
