package com.alevel;

public class Clock {//это билдер-строитель
    private String colorBackground;
    private int arrows;
    private String clockFaceType;

    public Clock() {//конструктор по-умолчанию
    }

    public void setColorBackground (final String colorBackground) {
        this.colorBackground = colorBackground;

    }
    public String getColorBackground() {
        return colorBackground;
    }


    public void setArrows (final int arrows) {
        this.arrows = arrows;
    }
    public int getArrows() {
        return arrows;
    }


    public void setClockFaceType(final String clockFaceType) {
        this.clockFaceType = clockFaceType;
    }
    public String getClockFaceType() {
        return clockFaceType;
    }

    @Override
    public String toString() {
        return "Wall clock has " + arrows + " arrows, background color is " + colorBackground
                 + " and clock-face type is "+clockFaceType;
    }


}
