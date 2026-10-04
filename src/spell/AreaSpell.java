package spell;

import enemy.Enemy;
import school.MagicSchool;

import java.util.List;

public class AreaSpell extends Spell {

    private static final double AREA_POWER_FACTOR = 0.6;

    public AreaSpell(MagicSchool school, String name, int basePower) {
        super(school, name, basePower);
    }

    @Override
    public void cast(List<Enemy> enemies) {
        if (enemies.isEmpty()) {
            System.out.println(name + " has no targets");
            return;
        }

        System.out.println(name + " [" + school.getName() + "] hits " + enemies.size() + " enemies");

        int areaPower = (int) (basePower * AREA_POWER_FACTOR);
        int damagePerTarget = school.calculateDamage(areaPower);

        for (Enemy target : enemies) {
            target.takeDamage(damagePerTarget);
            school.applyAftereffect(target);
        }
    }
}