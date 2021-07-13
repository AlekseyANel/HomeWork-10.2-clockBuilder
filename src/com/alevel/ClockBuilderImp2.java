package com.alevel;

public class ClockBuilderImp2 implements ClockBuilder {//отдельный бидер строит уникалные часы-объект

    private Clock clockImp;//объявляем переменную clockImp для объекта класса Clock
    public ClockBuilderImp2() {//коструктор для нового объекта clockImp класса Clock
        clockImp = new Clock();
    }

    @Override
    public Clock build () {//переназначаем метод билд (из интерфейса ClockBuilder)
        //для нового объекта clock
        Clock clock = new Clock();
        clock.setColorBackground(clockImp.getColorBackground());
        clock.setArrows(clockImp.getArrows());
        //clock.setClockFaceType(clockImp.getClockFaceType());
        return clock;
    }

    @Override//переназначаем метод сеттера colorBackground из интерфейса ClockBuilder
    public ClockBuilder setColorBackground(final String colorBackground) {
        clockImp.setColorBackground(colorBackground);
        return this;
    };
    @Override//переназначаем метод из интерфейса
    public ClockBuilder setArrows(final int arrows) {
        clockImp.setArrows(arrows);
        return this;
    };
    @Override//переназначаем метод из интерфейса
    public ClockBuilder setClockFaceType(final String clockFaceType) {
        clockImp.setClockFaceType(clockFaceType);
        return this;
    };

}
