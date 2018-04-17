package com.abhishek.dialogflowchat;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Abhishek on 17/4/18.
 */
public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
