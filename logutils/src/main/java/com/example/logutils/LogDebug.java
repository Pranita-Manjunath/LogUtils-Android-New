package com.example.logutils;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "THIS_IS_NEW_LIBRARY_APP";

    public static void printLibContents(String message) {
        Log.d(TAG, message);
    }
}
