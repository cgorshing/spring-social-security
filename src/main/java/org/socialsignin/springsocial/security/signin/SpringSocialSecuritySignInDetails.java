/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socialsignin.springsocial.security.signin;

import org.springframework.social.connect.ConnectionData;
import java.io.Serializable;

/**
 * POJO for holding userid and connectiondata, set in session by
 * SpringSocialSecuritySignInService and retrieved from session in
 * SpringSocialSecurityAuthenticationFilter
 * 
 * @author Michael Lavelle
 */
public class SpringSocialSecuritySignInDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getUserId() {
		return userId;
	}

	public ConnectionData getConnectionData() {
		return connectionData;
	}

	private String userId;
	private ConnectionData connectionData;

	public SpringSocialSecuritySignInDetails(String userId,
			ConnectionData connectionData) {
		this.userId = userId;
		this.connectionData = connectionData;
	}

}
