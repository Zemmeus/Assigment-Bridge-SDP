package school;

import enemy.Enemy;

public interface MagicSchool {
    String getName();
    int calculateDamage(int basePower);
    void applyAftereffect(Enemy target);
}