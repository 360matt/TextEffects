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
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§7" + text);
                this.frames.add("§f" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§f" + text);
                }
                this.frames.add("§f" + text);
                this.frames.add("§7" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }
                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case BLACK:
                this.frames.add("§f" + text);
                this.frames.add("§7" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }
                this.frames.add("§0" + text);
                this.frames.add("§7" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case RED:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§4" + text);
                this.frames.add("§c" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§c" + text);
                }
                this.frames.add("§c" + text);
                this.frames.add("§4" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case YELLOW:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§6" + text);
                this.frames.add("§e" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§e" + text);
                }
                this.frames.add("§e" + text);
                this.frames.add("§6" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case BLUE:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§1" + text);
                this.frames.add("§9" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§9" + text);
                }
                this.frames.add("§9" + text);
                this.frames.add("§1" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }
                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case PINK:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§5" + text);
                this.frames.add("§d" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§d" + text);
                }
                this.frames.add("§5" + text);
                this.frames.add("§d" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }

            case GREEN:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§2" + text);
                this.frames.add("§a" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§a" + text);
                }
                this.frames.add("§a" + text);
                this.frames.add("§2" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }

                if (!options.color.equals(Options.Colors.MULTI)) {
                    break;
                }
            case CYAN:
                this.frames.add("§0" + text);
                this.frames.add("§8" + text);
                this.frames.add("§3" + text);
                this.frames.add("§b" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§b" + text);
                }
                this.frames.add("§b" + text);
                this.frames.add("§3" + text);
                this.frames.add("§8" + text);
                this.frames.add("§0" + text);
                for (int i = 0; i < options.pause; i++) {
                    this.frames.add("§0" + text);
                }
                break;
        }
    }
}