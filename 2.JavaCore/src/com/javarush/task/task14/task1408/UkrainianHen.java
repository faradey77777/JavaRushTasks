package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 21;
    }

    @Override
    String getDescription() {

        return super.getDescription() + "Я - курица. Моя страна - "+Country.UKRAINE+". Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";

    }
}
