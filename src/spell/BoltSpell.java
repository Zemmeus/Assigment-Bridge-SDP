package spell;

import enemy.Enemy;
import school.MagicSchool;

import java.util.List;

public class BoltSpell extends Spell {

    public BoltSpell(MagicSchool school, String name, int basePower) {
        super(school, name, basePower);
    }

    @Override
    public void cast(List<Enemy> enemies) {
        if (enemies.isEmpty()) {
            System.out.println(name + " has no target");
            return;
        }

        Enemy target = enemies.get(0);
        System.out.println(name + " [" + school.getName() + "] hits " + target.getName());

        int damage = school.calculateDamage(basePower);
        target.takeDamage(damage);
        school.applyAftereffect(target);
    }
}