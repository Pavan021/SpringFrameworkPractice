package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserInfo()
    {
        return "New Database in action";
    }
}
