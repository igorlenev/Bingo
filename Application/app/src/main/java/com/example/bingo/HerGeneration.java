package com.example.bingo;

import android.widget.TextView;

import java.util.Random;

public class HerGeneration {
    private TextView[] herTextView;
    private String[] task = new String[11];
    private boolean[] isUsed = new boolean[task.length];
    private int temporary;
    private Random random = new Random();

    public HerGeneration(TextView[] herTextView) {
        this.herTextView = herTextView;

        task[0] = "Дедлайн по хима4у/физике/матеше/русскому";
        task[1] = "Английский/немецкий";
        task[2] = "Растяжка";
        task[3] = "Графический дизайн";
        task[4] = "Внутриуниверситетская литература";
        task[5] = "Соблюдение графика без перегрузов";
        task[6] = "Ведение ежеднневника";
        task[7] = "Кулинария";
        task[8] = "Поддержание порядка в комнате/квартире";
        task[9] = "Без выплёскиваний агрессии на Игоря";
        task[10] = "Одна пачка на неделю";
    }

    public void generate(){
        for (int i=0; i<isUsed.length; i++){
            isUsed[i]=false;
        }
        temporary = 0;

        for (int i=0; i<herTextView.length; i++){
            temporary = random.nextInt(isUsed.length);
            if (!isUsed[temporary]){
                herTextView[i].setText(task[temporary]);
                isUsed[temporary] = true;
            }
            else {i--;}
        }
    }

    public TextView[] getHerTextView() {
        return herTextView;
    }

    public void setHerTextView(TextView[] herTextView) {
        this.herTextView = herTextView;
    }
}