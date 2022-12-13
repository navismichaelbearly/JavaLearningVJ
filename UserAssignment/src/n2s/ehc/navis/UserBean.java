package n2s.ehc.navis;

public class UserBean {
	private int optionValue;
	private int userId;
	private String userName;
	
	public int getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(int optionValue) {
		this.optionValue = optionValue;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserBean [optionValue=" + optionValue + ", userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	
}
