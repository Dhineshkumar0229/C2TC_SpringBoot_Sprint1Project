package com.tnsif.userservice.role;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
	@JsonProperty("Super-User")
	Super_User,
	Manager,
	Staff
}