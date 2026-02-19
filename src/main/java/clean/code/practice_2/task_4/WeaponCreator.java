package clean.code.practice_2.task_4;

public abstract class WeaponCreator {
    abstract Weapon createWeapon();

    public void applyWeapon() {
        Weapon weapon = createWeapon();
        weapon.use();
    }
}
