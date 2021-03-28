package com.app.agenda;

import android.app.Application;

import com.app.agenda.dao.AlunoDAO;
import com.app.agenda.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeExemplo();
    }

    private void criaAlunosDeExemplo() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Alex", "11922223333", "alex@gmail.com"));
        dao.salva(new Aluno("Fran", "11944445555", "fran@gmail.com"));
    }
}
