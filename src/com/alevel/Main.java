package com.alevel;

public class Main {

    public static void main(String[] args) {

        ClockBuilder clock = new ClockBuilderImp();
        ClockBuildDirector clockBuildDirector = new ClockBuildDirector(clock);
        System.out.println(clockBuildDirector.clockConstruct());//инициализация объекта от первого конструктора

        ClockBuilder clock2 = new ClockBuilderImp2();
        ClockBuildDirector clockBuildDirector2 = new ClockBuildDirector(clock2);
        System.out.println(clockBuildDirector2.clockConstruct2());//инициализация объекта от второго конструктора

    }
}
