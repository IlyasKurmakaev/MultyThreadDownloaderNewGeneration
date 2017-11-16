package com.company;

import com.company.GUI.GUI;
import com.company.GUI.ProgressBar;

public class Main {

    public static void main(String[] args) {

        GUI.getInstance();
        for (int i = 0; i <10; i++) {
            URLStorage.getURLStorageSingltone().setURl("http://img-1.photosight.ru/5a8/3671348_large.jpg");
        }

        for (int i = 0; i < 2; i++)
        {
            ThreadFactory.createThread();
        }


    }
}
