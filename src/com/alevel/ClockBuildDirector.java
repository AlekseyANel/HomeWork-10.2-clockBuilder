package com.alevel;

public class ClockBuildDirector {

    private ClockBuilder builder;//объявили переменную builder типа ClockBuilder

    public ClockBuildDirector(ClockBuilder builder){//конструктор данного класса ClockBuildDirector
        this.builder=builder;//инициируем объект builder типа ClockBuilder
    }

    public Clock clockConstruct() {//метод сборки уникального объекта  класса Clock воедино
        return builder.setColorBackground("Yellow")//назначаем поля объекта
                      .setArrows(2)
                      .setClockFaceType("Romain")
                      .build();
    }

    public Clock clockConstruct2() {//метод2 сборки уникального объекта класса Clock воедино
        return builder.setColorBackground("Красный")//назначаем поля объекта
                .setArrows(3)
                //.setClockFaceType("Arabic")
                .build();
    }

}
