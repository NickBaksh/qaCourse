package clean.code.practice_2.task_4;

public class PistolCreator extends WeaponCreator{
    @Override
    Weapon createWeapon() {
        return new Pistol();
    }
}
