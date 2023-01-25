package member;

public class MemberBean {

	private int id; // 테이블의 컬럼 id
	private String name;  //테이블 컬럼 name
	private String phone;  //테이블 컬럼 phone
	private String address;  //테이블 컬럼 address
	private String team;  //테이블 컬럼 team
	
	
	
	// 위에 변수들이 private이니까.. 외부에서 위 변수들 쓰기 위해서.. Getter Setter해줌..
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	
	
	
	
}
