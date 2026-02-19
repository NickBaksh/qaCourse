package clean.code.practice_2.task_4;

public class Main {
    static void main(String[] args) {
        WeaponCreator weaponCreator;

        String weaponType = "sword";

        if ("Bow".equalsIgnoreCase(weaponType)) {
            weaponCreator = new BowCreator();
        } else if ("Sword".equalsIgnoreCase(weaponType)) {
            weaponCreator = new SwordCreator();
        } else {
            weaponCreator = new PistolCreator();
        }

        weaponCreator.applyWeapon();
    }


}
