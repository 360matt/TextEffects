package fr.i360matt.textEffects.effects;


import fr.i360matt.textEffects.Animation;

public final class PulseAnimation extends Animation {
    public static class Options {
        public enum Colors {
            MULTI, WHITE, BLACK, RED, YELLOW, BLUE, PINK, GREEN, CYAN
        }

        public Colors color = Colors.MULTI;
        public int pause = 1;
    }


    public PulseAnimation (final String text, final Options options) {
        switch (options.color) {
            case MULTI:
                //Parse all... no break
            case WHITE:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§7" + text);
                this.formatted.add("§f" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§f" + text);
                }
                this.formatted.add("§f" + text);
                this.formatted.add("§7" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }
                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case BLACK:
                this.formatted.add("§f" + text);
                this.formatted.add("§7" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }
                this.formatted.add("§0" + text);
                this.formatted.add("§7" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case RED:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§4" + text);
                this.formatted.add("§c" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§c" + text);
                }
                this.formatted.add("§c" + text);
                this.formatted.add("§4" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case YELLOW:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§6" + text);
                this.formatted.add("§e" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§e" + text);
                }
                this.formatted.add("§e" + text);
                this.formatted.add("§6" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case BLUE:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§1" + text);
                this.formatted.add("§9" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§9" + text);
                }
                this.formatted.add("§9" + text);
                this.formatted.add("§1" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }
                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case PINK:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§5" + text);
                this.formatted.add("§d" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§d" + text);
                }
                this.formatted.add("§5" + text);
                this.formatted.add("§d" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case GREEN:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§2" + text);
                this.formatted.add("§a" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§a" + text);
                }
                this.formatted.add("§a" + text);
                this.formatted.add("§2" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case CYAN:
                this.formatted.add("§0" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§3" + text);
                this.formatted.add("§b" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§b" + text);
                }
                this.formatted.add("§b" + text);
                this.formatted.add("§3" + text);
                this.formatted.add("§8" + text);
                this.formatted.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.formatted.add("§0" + text);
                }
                break;
        }
    }
}