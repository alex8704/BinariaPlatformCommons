package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;

public class AccessTokenDTO implements Serializable {
	private String tokenString;
	private Date creationDate;
	private Date expirationDate;
	private SN2Boolean isActive;
    private UserDTO user;
    private ApplicationDTO application;
	/**
	 * @return the tokenString
	 */
	public String getTokenString() {
		return tokenString;
	}
	/**
	 * @param tokenString the tokenString to set
	 */
	public void setTokenString(String tokenString) {
		this.tokenString = tokenString;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	/**
	 * @return the isActive
	 */
	public SN2Boolean getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(SN2Boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the user
	 */
	public UserDTO getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(UserDTO user) {
		this.user = user;
	}
	/**
	 * @return the application
	 */
	public ApplicationDTO getApplication() {
		return application;
	}
	/**
	 * @param application the application to set
	 */
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
    
}
