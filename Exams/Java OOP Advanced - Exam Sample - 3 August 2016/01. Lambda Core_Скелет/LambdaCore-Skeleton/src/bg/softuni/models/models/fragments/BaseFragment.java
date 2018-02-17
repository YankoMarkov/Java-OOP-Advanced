package bg.softuni.models.models.fragments;

import enums.FragmentType;
import interfaces.Fragment;

public abstract class BaseFragment implements Fragment{

    private String name;

    private FragmentType type;

    private Integer pressureAffection;

    protected BaseFragment(String name, Integer pressureAffection) {
        this.setName(name);
        this.setPressureAffection(pressureAffection);
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String value) {
        this.name = value;
    }

    public FragmentType getType() {
        return this.type;
    }

    protected void setType(FragmentType value) {
        this.type = value;
    }

    public Integer getPressureAffection () {
        return this.pressureAffection;
    }

    protected void setPressureAffection (Integer value) {
        this.pressureAffection = value;
    }
}
