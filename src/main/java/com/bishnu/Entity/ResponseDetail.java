package com.bishnu.Entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDetail {
	
	
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOffice> postOffice;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PostOffice> getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(List<PostOffice> postOffice) {
		this.postOffice = postOffice;
	}

	

}
