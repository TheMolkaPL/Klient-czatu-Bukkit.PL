package me.northpl93;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

public class Configuration implements Serializable
{
	private static final long serialVersionUID    = 1; //Wersja configu 1
	
	private List<String> blockedUsers      = null;
	
	private boolean isSessionStored        = false;
	private String storedNick              = null;
	private byte[] storedPassword          = null;
	
	private boolean debugOnChat            = false;
	private boolean rollOnNewPost          = true;
	
	public Configuration()
	{
		setDefaults();
	}
	
	/**
	 * Metoda która ustawi wartoąci na domyślne
	 */
	public void setDefaults()
	{
		setSessionStored(false);
		blockedUsers = new ArrayList<String>();
		storedNick = "";
		storedPassword = new byte[0];
	}
	
	public List<String> getBlockedUsers()
	{
		return blockedUsers;
	}
	
	public void setBlockedUsers(List<String> blockedUsers)
	{
		this.blockedUsers = blockedUsers;
	}
	
	public String getStoredNick()
	{
		return storedNick;
	}
	
	public void setStoredNick(String storedNick)
	{
		this.storedNick = storedNick;
	}
	
	public String getStoredPassword()
	{
		return new String(Base64.decodeBase64(this.storedPassword));
	}
	
	public void setStoredPassword(String password)
	{
		this.storedPassword = Base64.encodeBase64(password.getBytes());
	}

	public boolean isSessionStored()
	{
		return isSessionStored;
	}

	public void setSessionStored(boolean isSessionStored)
	{
		this.isSessionStored = isSessionStored;
	}

	public boolean isDebugOnChat()
	{
		return debugOnChat;
	}

	public void setDebugOnChat(boolean debugOnChat)
	{
		this.debugOnChat = debugOnChat;
	}

	public boolean isRollOnNewPost()
	{
		return rollOnNewPost;
	}

	public void setRollOnNewPost(boolean rollOnNewPost)
	{
		this.rollOnNewPost = rollOnNewPost;
	}
}
