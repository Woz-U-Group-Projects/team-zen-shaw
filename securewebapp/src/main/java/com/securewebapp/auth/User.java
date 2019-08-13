package com.securewebapp.auth;

import javax.persistence.*;

@Entity
@Table(name="User")
@SecondaryTables(value= {
		@SecondaryTable(name="Posts", pkJoinColumns=@PrimaryKeyJoinColumn(name="post_id", referencedColumnName="user_id")),
		@SecondaryTable(name="Messages", pkJoinColumns=@PrimaryKeyJoinColumn(name="message_id", referencedColumnName="user_id"))
		
})
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
 
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable=false)
    private String password;
    
 

	public Long getUser_Id() {
		return user_id;
	}

	public void setUser_Id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Entity
	@Table(name="Posts")
public class Posts{
		
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private long post_id;
		
		@Id
		private long user_id;
		
		private String post_text;

		public String getPost_text() {
			return post_text;
		}

		public void setPost_text(String post_text) {
			this.post_text = post_text;
		}
		
	}
public class Messages{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long message_id;
	
	@Id
	private long user_id;
	
	@Id
	private long post_id;
	
	private String message_text;

	public String getMessage_text() {
		return message_text;
	}

	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}
}
}

