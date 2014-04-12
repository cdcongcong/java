package mybatistest.entity;
import java.io.*;
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -255692613846381236L;
	private String userID;
	private String userNumber;
	private String userName;
	private String description;

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the userNumber
	 */
	public String getUserNumber() {
		return userNumber;
	}

	/**
	 * @param userNumber
	 *            the userNumber to set
	 */
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



}
