package school;

import enemy.Enemy;

public class FrostSchool implements MagicSchool {

    private static final String NAME = "Frost";
    private static final double DAMAGE_MULTIPLIER = 0.85;
    private static final String AFTEREFFECT = "Chilled";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int calculateDamage(int basePower) {
        return (int) (basePower * DAMAGE_MULTIPLIER);
    }

    @Override
    public void applyAftereffect(Enemy target) {
        target.addEffect(AFTEREFFECT);
    }
}