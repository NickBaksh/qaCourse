package clean.code.practice_2.task_4;

public class BowCreator extends WeaponCreator {
    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}
