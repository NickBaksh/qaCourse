package clean.code.practice_2.task_8;

public class Character {
    private final String characterName;
    private final int totalHealth;
    private final int damagePoints;
    private final int armor;
    private final String magicianLevel;

    public Character(Builder builder) {
        this.characterName = builder.characterName;
        this.totalHealth = builder.totalHealth;
        this.damagePoints = builder.damagePoints;
        this.armor = builder.armor;
        this.magicianLevel = builder.magicianLevel;
    }

    @Override
    public String toString() {
        return STR."Character: Character name \{characterName}, total health: \{totalHealth}, damage points: \{damagePoints}, armor: \{armor}, magician level: \{magicianLevel}";
    }

    public static class Builder {
        private String characterName;
        private int totalHealth;
        private int damagePoints;
        private int armor;
        private String magicianLevel;

        public Builder setCharacterName(String characterName) {
            this.characterName = characterName;
            return this;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder setDamagePoints(int damagePoints) {
            this.damagePoints = damagePoints;
            return this;
        }

        public Builder setTotalHealth(int totalHealth) {
            this.totalHealth = totalHealth;
            return this;
        }

        public Builder setMagicianLevel(String magicianLevel) {
            this.magicianLevel = magicianLevel;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
