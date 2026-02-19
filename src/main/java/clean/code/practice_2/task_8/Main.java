package clean.code.practice_2.task_8;

public class Main {
    public static void main(String[] args) {
        Character flexCharacter = new Character.Builder()
                .setCharacterName("Ninja")
                .setArmor(200)
                .setDamagePoints(500)
                .setMagicianLevel("Zero")
                .setTotalHealth(2000)
                .build();

        System.out.println(flexCharacter);
    }
}
