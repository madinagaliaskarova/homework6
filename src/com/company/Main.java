package com.company;
//Создать класс Weapon (Оружие), с приватными полями тип оружия и
// название оружия.

//Создать класс GameEntity (Игровая сущность),
// выделить все общие поля которые присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(15);
        boss.setHealth(200);
       boss.getWeapon().setWeapon("Magical");
       boss.getWeapon().setTypeOfWeapons("Stick");
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(10);
        skeleton.setHealth(250);
        skeleton.setArrow(450);
        skeleton.getWeapon().setWeapon("Kinetic");
        skeleton.getWeapon().setTypeOfWeapons("Cold");
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setDamage(50);
        skeleton1.setHealth(300);
        skeleton1.setArrow(400);
        skeleton1.getWeapon().setWeapon("Phicisal");
        skeleton1.getWeapon().setTypeOfWeapons("Hot");
        System.out.println(skeleton1.printInfo());
    }

}
