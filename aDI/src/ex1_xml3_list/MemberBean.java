package ex1_xml3_list;

public class MemberBean {
	private String  name;
	private int 	age;
	private String  message;
	
	//-----------------------
	public void output() {
		System.out.println(name +"["+ age +"]"+ message);
	}
	
	public MemberBean() {
		System.out.println("기본생성자");
	}
	
	// 생성자 함수
	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
		System.out.println("인자있는 생성자");
	}
	
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
}
