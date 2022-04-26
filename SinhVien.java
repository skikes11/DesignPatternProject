
public class SinhVien {
	private String mssv;
	private String name;
	private double gpa;
	private String faculty;
	private String course;
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public SinhVien(String mssv, String name, double gpa, String faculty, String course) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.gpa = gpa;
		this.faculty = faculty;
		this.course = course;
	}
	public SinhVien() {
		super();
	}
	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", name=" + name + ", gpa=" + gpa + ", faculty=" + faculty + ", course="
				+ course + "] \n";
	}
	
	
	
	
	
}
