package kr.ifjbnu.hgip.member;

public class Member {
	
		private Integer id;
		private String mId;
		private String mPw;
		private String name;
		private String cellphone;
		private String email;
		private String gender;
		private String birth;
		
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
		public String getgender() {
			return gender;
		}
		public void setgender(String gender) {
			this.gender = gender;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		
		@Override
		public String toString() {
			return "Member [id=" + id + ", mId=" + mId + ", mPw=" + mPw + ", name=" + name
					+", cellphone=" + cellphone + ", email=" + email + ", gender=" + gender
					+", birth=" + birth+ "]";
		}
		
}
