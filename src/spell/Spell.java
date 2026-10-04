package spell;

import school.MagicSchool;

import enemy.Enemy;

import java.util.List;

public abstract class Spell {

    protected MagicSchool school;
    protected final String name;
    protected final int basePower;

    protected Spell(MagicSchool school, String name, int basePower) {
        this.school = school;
        this.name = name;
        this.basePower = basePower;
    }

    public void setSchool(MagicSchool school) {
        this.school = school;
    }

    public abstract void cast(List<Enemy> enemies);

}
