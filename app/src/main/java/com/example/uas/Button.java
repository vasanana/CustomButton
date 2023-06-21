package com.example.uas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class Button extends AppCompatButton {

    private void init(){
        setBackgroundColor(getResources().getColor(R.color.teal_200));
        final boolean[] click = {false};
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click[0]) {
                        setBackgroundColor(getResources().getColor(R.color.teal_200));
                        click[0] = false;
                } else{
                    setBackgroundColor(getResources().getColor(R.color.purple_500));
                    click[0] = true;
                }
            }
        });
    }


    public Button(@NonNull Context context) {
        super(context);
        init();
    }

    public Button(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Button(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
