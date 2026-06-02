package com.loose.coupling;

public class WebServiceDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserInfo()
    {
        return "Web Service Database in action";
    }
}
