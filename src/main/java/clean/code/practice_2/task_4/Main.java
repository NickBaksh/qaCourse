package clean.code.practice_2.task_4;

public class Main {
    static void main(String[] args) {
        WeaponCreator bowCreator = WeaponFactoryResolver.create("bow");
        bowCreator.applyWeapon();

        WeaponCreator swordCreator = WeaponFactoryResolver.create("sword");
        swordCreator.applyWeapon();
    }


}
