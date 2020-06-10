package com.example.compliteappsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
TextView Service;
Button SignUp;
    String text = "BySlgningUp You Agree to our Product Services";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Service=(TextView)findViewById(R.id.textView2);
        SignUp=(Button) findViewById(R.id.button);
        // initialize a new SpannableStringBuilder instance
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);

// apply the clickable text to the span
        ssBuilder.setSpan(
                new ForegroundColorSpan(Color.GREEN),
                text.indexOf("Product Services"),
                text.indexOf("Product Services") + String.valueOf("Product Services").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        Service.setText(ssBuilder);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(it);
            }
});
}
}

