
public class SinhVien2 extends SinhVien {

	private String hocLuc;
	
	public SinhVien2() {};

	public SinhVien2(String mssv, String name, double gpa, String faculty, String course, String hocLuc) {
		super(mssv, name, gpa, faculty, course);
		this.hocLuc = hocLuc;
	}

	public String getHocLuc() {
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}

	@Override
	public String toString() {
		return "SinhVien2 [HocLuc=" + getHocLuc() + ", MSSV=" + getMssv()
				+ ", Name= " + getName() + ", GPA= " + getGpa() + ", Faculty=" + getFaculty()
				+ ", Course=" + getCourse() + "] \n";
	}


	
	
	
	
}
