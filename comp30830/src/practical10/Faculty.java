package practical10;

public class Faculty extends Employee {
	String title;
	String office;
	
	public Faculty() {
	}
	
	public Faculty(String name,int age, String emailid,double sal,String title, String office) {
		super(name,age,emailid,sal);
		this.title = title;
		this.office = office;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setOffice(String Office) {
		this.office = Office;
	}
	
	@Override
	public String toString() {
		return "title"+title+"\noffice:"+office+"\n"+super.toString();
	}
}
