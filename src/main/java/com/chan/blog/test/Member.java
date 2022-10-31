package com.chan.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter
@NoArgsConstructor //기본생성자
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
	
	@Builder //어떤 값을 넣을때 생성자의 순서를 지키지 않아도 됨.
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
}
