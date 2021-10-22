package com.example.frasesdesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateSentence(View view) {

        String[] phrases = {
                "Seja feliz. A base de remédios",
                "Potencial. Nem todo mundo será Astronauta quando crescer!",
                "Esforço. Plágio economiza tempo!",
                "Se você não conseguir de primeira, remova todas as evidências de que você ao menos tentou!",
                "Sexta feira! O melhor dia para invejar pessoas felizes…",
                "Faça um elogio. Não receba outro em troca.",
                "O Primeiro passo para derrota é começar",
                "Nada é tão horrivel que não possa piorar muito!",
                "O não você já tem. Agora falta buscar a humilhação!",
                "Não deixe para desistir amanhã do que você pode desistir ainda hoje!",
                "Procure saber antes se é impossível, porque daí você não precisa tentar!",
                "Lute como nunca. Perca como sempre!",
                "O caminho é longo, mas a derrota é certa!",
                "É só uma fase ruim, logo vai piorar...",
                "Os sonhos antecedem os seus fracassos",
                "A vida te derruba hoje preparando para a queda de amanhã!",
                "Seja o protagonista do seu fracasso!",
                "Nunca foi azar, sempre foi incompetência",
                "Você é mais fraco do que você pensa!",
        };

        int number = new Random().nextInt(phrases.length);

        TextView phrase = findViewById(R.id.sentence);
        phrase.setText(phrases[number]);


    }
}