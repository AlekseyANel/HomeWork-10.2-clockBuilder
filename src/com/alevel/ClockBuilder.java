package com.alevel;

public interface ClockBuilder {//это интерфейс билдера-строителя
    Clock build();
    ClockBuilder setColorBackground(final String colorBackground);
    ClockBuilder setArrows(final int arrows);
    ClockBuilder setClockFaceType(final String clockFaceType);
}
