package com.rosemellow.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toasttest{

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}