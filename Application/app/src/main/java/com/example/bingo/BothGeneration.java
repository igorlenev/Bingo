package com.example.bingo;

import android.widget.TextView;

import java.util.Random;

public class BothGeneration {
    private TextView[] bothTextView;
    private String[] task = new String[18];
    private boolean[] isUsed = new boolean[task.length];
    private int temporary;
    private Random random = new Random();

    public BothGeneration(TextView[] bothTextView) {
        this.bothTextView = bothTextView;

        task[0] = "Соблюдение режима";
        task[1] = "ЛФК";
        task[2] = "Подготовка к ЕГЭ";
        task[3] = "Проект";
        task[4] = "Протирка пыли";
        task[5] = "Уборка пылесосом";
        task[6] = "Важное дело, нне внесённое в список";
        task[7] = "Прогресс в работе по улучшению себя";
        task[8] = "Правильное питание в течение недели";
        task[9] = "Без ссор с кем-либо и друг с другом";
        task[10] = "Без переутомлений";
        task[11] = "Без действий, о которых потом будешь жалеть";
        task[12] = "Без поедания вкусняшек, предназначенных не для себя";
        task[13] = "Придуман новый пункт в Бинго";
        task[14] = "Поездка в библиотеку";
        task[15] = "Личная гигиена";
        task[16] = "Без взаимоисключающих параграфов";
        task[17] = "Без пустых \"разбирательств в себе\"";
    }

    public void generate(){
        for (int i=0; i<isUsed.length; i++){
            isUsed[i]=false;
        }
        temporary = 0;

        for (int i=0; i<bothTextView.length; i++){
            temporary = random.nextInt(isUsed.length);
            if (!isUsed[temporary]){
                bothTextView[i].setText(task[temporary]);
                isUsed[temporary] = true;
            }
            else {i--;}
        }
    }

    public TextView[] getBothTextView() {
        return bothTextView;
    }

    public void setBothTextView(TextView[] bothTextView) {
        this.bothTextView = bothTextView;
    }
}