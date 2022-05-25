package com.example.mychatsdk;

import android.app.Application;

import sdk.chat.app.firebase.ChatSDKFirebase;

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        try {
            ChatSDKFirebase.quickStart(this, "pre_1", "abababa", true);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
