package com.xworkz.socialmedia.things;

public class SocialMedia {
	
	public String userName;
	public int numberOfFollowers;
	public int numberOfPosts;
	public boolean isProfilePublic;
	
	
	public SocialMedia()
	{
		this("shashi",4,0,true);
		System.out.println("0 args constructor");
	}
    
	public SocialMedia(String userName,int numberOfFollowers,int numberOfPosts,boolean isProfilePublic)
	{
		this.userName=userName;
		this.numberOfFollowers=numberOfFollowers;
		this.numberOfPosts=numberOfPosts;
		this.isProfilePublic=isProfilePublic;
		System.out.println("all args constructor");
	}
	//instance methods
	public String getUserName()
	{
		this.getSocialMediaDetails();
		return userName;
	}
	public void getSocialMediaDetails()
	{
		System.out.println("userName:"+this.userName);
		System.out.println("numberOfFollowers:"+this.numberOfFollowers);
		System.out.println("numberOfPosts:"+this.numberOfPosts);
		System.out.println("isProfilePublic:"+this.isProfilePublic);
		
	}
}
