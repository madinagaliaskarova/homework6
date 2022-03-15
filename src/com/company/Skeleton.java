package com.company;

public class Skeleton extends Boss {
    private int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public String printInfo() {
        return getDamage() + " " + getHealth() + " " + getWeapon().getWeapon() + " " +
                getWeapon().getTypeOfWeapons() + " " + getArrow();
    }
}
