package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss1 = new Boss();
        boss1.setDamage(60);
        boss1.setHealth(1000);
        boss1.setProtection("ogon");
        System.out.println(boss1.getHealth() + " " + boss1.getDamage() + " " +
                boss1.getProtection());
        creatHeroes();
        for (int i = 0; i < creatHeroes().length; i++) {
            System.out.println(creatHeroes()[i].getDamage() + " " + creatHeroes()[i].getHealth() + " " + creatHeroes()[i].getSupers());
        }
    }
    public static Hero[] creatHeroes(){
        Hero hero = new Hero(600, 50);
        Hero hero1 = new Hero(400, 70, "Voda");
        Hero hero2 = new Hero(300,80,"Ogon" );
        Hero hero3 = new Hero(200, 90,"Zemlya");
        Hero[] comand = {hero, hero1, hero2, hero3};
        return comand;
    }

}
