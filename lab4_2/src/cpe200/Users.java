package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users()
    {
        userList = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User temp;
        temp = new User();
        temp.setUserName(userName);
        temp.setPassword(password);
        userList.add(temp);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
       if(userList.contains(user))
       {
           return true;
       }
        else
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i = 0 ; i<userList.size() ;i++)
        {
           if(userList.get(i).getUserName() == username)
           {
               {
                   return true;
               }
           }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        int hold=0;
        for(int i = 0 ; i<userList.size() ;i++)
        {
            if(userList.get(i).getUserName() == userName)
            {
                {
                    hold = i;
                   break;
                }
            }
        }
        return userList.get(hold);
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        User[] arr;
        arr = userList.toArray(new User[userList.size()]);
        return arr;
    }
}
