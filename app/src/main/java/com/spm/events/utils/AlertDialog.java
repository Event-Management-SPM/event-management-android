package com.spm.events.utils;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.spm.events.R;

import java.util.Objects;

public class AlertDialog {
    public AlertDialog() { }

    public void showDialog(Activity activity, String title, boolean error){
        final android.app.Dialog dialog = new android.app.Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);

        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView titleView = dialog.findViewById(R.id.title);
        titleView.setText(title);

        Button done = dialog.findViewById(R.id.Done);
        if (error) {
            done.setBackgroundColor(ContextCompat.getColor(activity.getApplicationContext(), R.color.red));
        }

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}