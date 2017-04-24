package co.com.binariasystems.orion.model.enumerated;

import java.io.Serializable;

public enum SecurityExceptionType implements Serializable{
	ACCOUNT_BLOCKED, CREDENTIALS_NOT_MATCH, INVALID_ACCOUNT, MAX_AUTHENTICATION_ATTEMPTS;
}
