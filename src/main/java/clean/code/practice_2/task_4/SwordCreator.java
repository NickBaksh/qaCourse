package clean.code.practice_2.task_4;

public class SwordCreator extends WeaponCreator {

    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
