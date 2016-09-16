package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        this.userName = "John Doe";
        this.password = "0123456789";
    }

    public boolean setUserName(String name)
    {
        this.userName = name;
        String pattern = "[a-zA-Z][a-zA-Z0-9]+";
        if(name.matches(pattern) && name.length() >= 8)
        {
            return true;
        }
        else
            return false;
    }

    public boolean setPassword(String name)
    {
        this.password = name;
        String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]+";
        if (name.matches(pattern) && name.length() >= 12)
        {
            return true;
        } else
            return false;
    }

    public String getUserName()
    {

        return this.userName;
    }

    public String getPassword()
    {

        return this.password;
    }
}