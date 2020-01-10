package it.flatwhite.dialogs.toasted;

import android.content.Context;
import android.widget.Toast;

public class maketoast {

    public static void buildToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
