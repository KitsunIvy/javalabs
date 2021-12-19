package ru.mirea.labs1920;

import java.util.ArrayList;

public class Generator {
    private ArrayList<String> base = new ArrayList<>();

    public void preGenerate() {
        String i_str;
        for (int i = 0; i < 9; i++) {
            i_str = Integer.toString(i);
            this.base.add(i_str + i_str + i_str);
            this.base.add(i_str + "00");
            this.base.add("00" + i_str);
        }
    }

    public String getRandom() {
        String alpha = "АВЕКМНОРСТУХ";
        String numbers = this.base.get(Randomizer.rand(0, this.base.size() - 1));
        String region = Integer.toString(Randomizer.rand(1, 199));
        region = Integer.parseInt(region) < 10 ? "0" + region : region;

        return alpha.charAt(Randomizer.rand(0, alpha.length() - 1)) + numbers +
                alpha.charAt(Randomizer.rand(0, alpha.length() - 1)) +
                alpha.charAt(Randomizer.rand(0, alpha.length() - 1)) + region;
    }
}
