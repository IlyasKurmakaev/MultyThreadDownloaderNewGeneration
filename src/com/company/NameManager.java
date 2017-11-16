package com.company;

/**
 * Created by Lite on 07.08.2017.
 */

public class NameManager {
    private static NameManager nameManager;
    NameManager() {
    }
//DEPRICATED
//    public static synchronized NameManager getInstance()     // синглтон в данном случае нужен для того, чтобы не злоупотреблять "new NameManager.getNewNameCode"
//    {
//        if (nameManager == null)
//        {
//            nameManager = new NameManager();
//        }
//        return nameManager;
//    }


    private static int a = 0;
    public synchronized static int getNewNameCode()
    {
        return ++a;
    }
}
