package school;

import enemy.Enemy;

public class HolySchool implements MagicSchool {

    private static final String NAME = "Holy";
    private static final double DAMAGE_MULTIPLIER = 1;
    private static final String AFTEREFFECT = "Blinded by the light";

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