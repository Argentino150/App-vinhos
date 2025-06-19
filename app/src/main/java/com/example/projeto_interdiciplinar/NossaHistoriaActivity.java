package com.example.projeto_interdiciplinar;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class NossaHistoriaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nossa_historia);

        //anim fade
        View layout = findViewById(R.id.layout_principal);
        layout.setAlpha(0f);
        layout.animate().alpha(1f).setDuration(800);  // Faz o fade em 800ms
    }
}