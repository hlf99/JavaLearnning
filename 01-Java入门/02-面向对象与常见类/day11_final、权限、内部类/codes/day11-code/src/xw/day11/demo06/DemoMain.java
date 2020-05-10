package xw.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并设置年龄
        hero.setName("疾风");
        hero.setAge(18);

        // 创建一个武器对象
        Weapon weapon = new Weapon("风之刃");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        // 年龄为18的疾风用风之刃攻击敌人。
        hero.attack();
    }
}
