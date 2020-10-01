package com.matt.finalNull;

public class CFinalUninitialized {
    public int getVi1() {
        return vi1;
    }

    public double getVd1() {
        return vd1;
    }

    public String getVs1() {
        return vs1;
    }

    public final int vi1;
    private final double vd1;
    private final String vs1;

    public void getIc() {
        System.out.println(ic.getIci() + " " + ic.getIcs());
    }

    private final InsideClass ic;

    public CFinalUninitialized(int vi1, double vd1, String vs1) {
        this.vi1 = vi1;
        this.vd1 = vd1;
        this.vs1 = vs1;
        this.ic = new InsideClass(vi1, vs1);
    }
}

class InsideClass {
    private final int ici;
    private final String ics;

    public int getIci() {
        return ici;
    }

    public String getIcs() {
        return ics;
    }

    InsideClass(int ici, String ics) {
        this.ici = ici;
        this.ics = ics;
    }
}
