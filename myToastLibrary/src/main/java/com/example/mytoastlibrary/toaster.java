package com.example.mytoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class toaster {

    public static void popLongMessage(Context c, String message)
    {
        Toast.makeText(c,message,Toast.LENGTH_LONG).show();
    }

    public static void popShortMessage(Context c, String message)
    {
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
