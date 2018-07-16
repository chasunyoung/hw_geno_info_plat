package kr.ifjbnu.hgip.member;

public class MemberCommand {
	
	private Integer id;
	private String mId;
	private String mPw;
	private String name;
	
	private String phone;
	private String phone1;
	private String phone2;
	private String phone3;
	
	private String address;
	private String address1;
	private String address2;
	
	private String cellphone;
	private String cellphone1;
	private String cellphone2;
	private String cellphone3;
	
	private String email;
	private String email1;
	private String email2;
	
	private String gender;
	
	private String birth;
	private String birthYear;
    private String birthMon;
    private String birthDay;
    
    
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
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCellphone1() {
		return cellphone1;
	}
	public void setCellphone1(String cellphone1) {
		this.cellphone1 = cellphone1;
	}
	public String getCellphone2() {
		return cellphone2;
	}
	public void setCellphone2(String cellphone2) {
		this.cellphone2 = cellphone2;
	}
	public String getCellphone3() {
		return cellphone3;
	}
	public void setCellphone3(String cellphone3) {
		this.cellphone3 = cellphone3;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMon() {
		return birthMon;
	}
	public void setBirthMon(String birthMon) {
		this.birthMon = birthMon;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
    
	@Override
	public String toString() {
		return "Member [id=" + id + ", mId=" + mId + ", mPw=" + mPw + ", name=" + name +", cellphone=" + cellphone
				+", cellphone1=" + cellphone1 + ", cellphone2=" + cellphone2 + ",cellphone3=" + cellphone3
				+", phone1=" + phone1 + ", phone2=" + phone2 + ",phone3=" + phone3 +", phone=" + phone
				+", address1=" + address1 + ", address2=" + address2 + ", address=" + address
				+ ", email1=" + email1+ ", email2=" + email2+ ", email=" + email + ", gender=" + gender
				+ ", birth =" + birth +", birthYear=" + birthYear+ ", birthMon=" + birthMon
				+ ", birthDay=" + birthDay+ "]";
	}
}
