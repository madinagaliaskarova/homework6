package com.company;
//Создать класс GameEntity (Игровая сущность),
// выделить все общие поля которые присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.


public class GameEntity {
    private int damage;
    private int health;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
