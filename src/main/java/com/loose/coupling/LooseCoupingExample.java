package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupingExample {

    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationBeanLooseCouplingIOC.xml" );

//        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
//        UserManager userDBManager = new UserManager(userDatabaseProvider);
        UserManager userDBManager = (UserManager) context.getBean("userManagerwithUserDB");
        System.out.println(userDBManager.getUserDetails());

//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager newDBManager = new UserManager(newDatabaseProvider);
        UserManager newDBManager = (UserManager) context.getBean("userManagerwithNewDB");
        System.out.println(newDBManager.getUserDetails());

//        UserDataProvider webServiceDatabaseProvider = new WebServiceDatabaseProvider();
//        UserManager webDBManager = new UserManager(webServiceDatabaseProvider);
        UserManager webDBManager = (UserManager) context.getBean("userManagerwithWebServiceDB");
        System.out.println(webDBManager.getUserDetails());

    }
}
