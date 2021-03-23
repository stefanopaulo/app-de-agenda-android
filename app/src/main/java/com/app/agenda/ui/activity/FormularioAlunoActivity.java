package com.app.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.agenda.R;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle("Novo aluno");
    }
}