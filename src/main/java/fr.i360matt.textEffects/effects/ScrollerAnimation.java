package fr.i360matt.textEffects.effects;

import fr.i360matt.textEffects.Animation;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public final class ScrollerAnimation extends Animation {
    public static class Options {
        public int width = 32;
        public int space = 32;
    }

    public ScrollerAnimation (String text, final Options options) {
        final List<String> temp = new ArrayList<>();

        if (text.length() < options.width) {
            final StringBuilder spaceBuilder = new StringBuilder();
            while (spaceBuilder.length() <
                    options.width)
                spaceBuilder.append(" ");
            text = text + spaceBuilder;
        }

        options.width -= 2;

        for (int i = 0; i < text.length() - options.width; i++) {
            temp.add(text.substring(i, i + options.width));
        }

        final StringBuilder spacing = new StringBuilder();
        for (int i = 0; i < options.space; ++i) {
            temp.add(text.substring(text.length() - options.width + (Math.min(i, options.width))) + spacing);
            if (spacing.length() < options.width)
                spacing.append(" ");
        }

        for (int i = 0; i < options.width - options.space; ++i)
            temp.add(text.substring(text.length() - options.width + options.space + i) + spacing + text.substring(0, i));

        for (int i = 0; i < options.space; i++) {
            if (i > spacing.length()) break;
            temp.add(spacing.substring(0, spacing.length() - i) + text.substring(0, options.width - (Math.min(options.space, options.width)) + i));
        }

        int pos = 0;
        ChatColor stored = ChatColor.RESET;
        for (int i = 0; i < temp.size(); i++) {
            StringBuilder builder = new StringBuilder(temp.get(pos++ % temp.size()));

            if (builder.charAt(builder.length() - 1) == '§')
                builder.setCharAt(builder.length() - 1, ' ');

            if (builder.charAt(0) == '§') {
                final ChatColor color = ChatColor.getByChar(builder.charAt(1));
                if (color != null) {
                    stored = color;
                    builder = new StringBuilder(temp.get(pos++ % temp.size()));
                    if (builder.charAt(0) != ' ')
                        builder.deleteCharAt(0);
                }
            }

            this.formatted.add(stored + builder.substring(1));
        }

    }
}