package com.example.bingo;

import android.widget.TextView;

import java.util.Random;

public class HisGeneration {
    private TextView[] hisTextView;
    private String[] task = new String[21];
    private boolean[] isUsed = new boolean[task.length];
    private int temporary;
    private Random random = new Random();

    public HisGeneration(TextView[] hisTextView) {
        this.hisTextView = hisTextView;

        task[0] = "Нет пропущенной домашки";
        task[1] = "Изучение Kotlin";
        task[2] = "Ни единой \"2\" или \"3\"";
        task[3] = "Без четвёрок";
        task[4] = "Не купил ни одной игры";
        task[5] = "Без агрессии";
        task[6] = "Почищены уши";
        task[7] = "Смена комплекта постельного белья";
        task[8] = "Брал дополнительные задания в школе";
        task[9] = "Меньше стал хрустеть суставами";
        task[10] = "Одна пачка на неделю";
        task[11] = "\"Само в себе\"";
        task[12] = "Без вины";
        task[13] = "Без тремора";
        task[14] = "Без криков";
        task[15] = "Внимание";
        task[16] = "Без эпизодов прокрастинации";
        task[17] = "Продолжительность";
        task[18] = "Уменьшение лишних трат";
        task[19] = "Без траты времени впустую";
        task[20] = "Хотя бы одна прогулка";
    }

    public void generate(){
        for (int i=0; i<isUsed.length; i++){
            isUsed[i]=false;
        }
        temporary = 0;

        for (int i=0; i<hisTextView.length; i++){
            temporary = random.nextInt(isUsed.length);
            if (!isUsed[temporary]){
                hisTextView[i].setText(task[temporary]);
                isUsed[temporary] = true;
            }
            else {i--;}
        }
    }

    public TextView[] getHisTextView() {
        return hisTextView;
    }

    public void setHisTextView(TextView[] hisTextView) {
        this.hisTextView = hisTextView;
    }
}