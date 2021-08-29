package fr.i360matt.textEffects.utils;

import net.md_5.bungee.api.ChatColor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows you to use the gradient for texts
 *
 * @author 360matt
 */
public class GradientText {

    public static Color getColor (Color start, Color end, float fAmount) {
        float fInverse = (float) (1.0 - fAmount);

        final float r = (end.getRed()/255F) * fAmount + (start.getRed()/255F) * fInverse;
        final float g = (end.getGreen()/255F) * fAmount + (start.getGreen()/255F) * fInverse;
        final float b = (end.getBlue()/255F) * fAmount + (start.getBlue()/255F) * fInverse;

        return new Color(r, g, b);
    }

    public static String getGradient (final String text, final Color start, final Color end) {
        final StringBuilder res = new StringBuilder();

        final float coef = (1F / text.length());

        float temp = 0F;
        for (final char character : text.toCharArray()) {
            res.append(ChatColor.of(getColor(start, end, temp)));
            res.append(character);
            temp += coef;
        }
        return res.toString();
    }

    /**
     *
     * Note:
     * only the first character following the formatting (§m, §n, §l) will be taken into account.
     * So you have to add formatting for each character
     *
     * @param text The text that needs to be transformed.
     * @param start The start color (left).
     * @param end The end color (right).
     * @return A list containing all the frames of the animation.
     */
    public static List<String> getAnimatedGradient (String text, final Color start, final Color end) {
        final List<String> res = new ArrayList<>();

        text = text.replaceAll("(§)([A-F]|[a-f]|[0-9])", "");
        // remove § color, useless ... most easy to handle the text ...

        final char[] chars = text.toCharArray();
        // optimisation: create only once time an array

        final float coef = (1F / (text.length())); // variation of color per frame
        final int cycle = (int) (1 / coef); // number of frame for 1/4 of totals frames

        for (int i = 0; i < (cycle*4); i++)
            res.add(null); // pre-set the list, in order by putting element with #set(index, str)

        for (int iter = 0; iter < cycle; iter++) {
            final Color dynamic1 = getColor(start, end, iter*coef);
            final Color dynamic2 = getColor(end, start, iter*coef);
            // change dynamically the start/end color

            final StringBuilder frame1 = new StringBuilder();
            final StringBuilder frame2 = new StringBuilder();
            final StringBuilder frame3 = new StringBuilder();
            final StringBuilder frame4 = new StringBuilder();
            // optimisation: handle 4 frame in same time, with same iter/chars values.

            float temp = 0F;
            int missed = 0;

            for (int i = 0; i < chars.length; i++) {

                frame1.append(ChatColor.of(getColor(dynamic1, end, temp)));
                frame2.append(ChatColor.of(getColor(end, dynamic2, temp)));
                frame3.append(ChatColor.of(getColor(dynamic2, start, temp)));
                frame4.append(ChatColor.of(getColor(start, dynamic1, temp)));


                char c = chars[i];
                // optimisation: get only once time an element from array

                frame1.append(c);
                frame2.append(c);
                frame3.append(c);
                frame4.append(c);

                if (c == '§' && chars.length > i+1) {
                    char next = chars[++i];
                    missed++; // lost variation with ++i without going through the end of the loop
                    if (next == 'm' || next == 'M' || next == 'l' || next == 'L' || next == 'n' || next == 'N') {
                        frame1.append(next);
                        frame2.append(next);
                        frame3.append(next);
                        frame4.append(next);

                        if (chars.length > i+1) {
                            char next2 = chars[++i];
                            missed++; // same comment
                            frame1.append(next2);
                            frame2.append(next2);
                            frame3.append(next2);
                            frame4.append(next2);
                        }
                    }
                }

                temp += coef; // increment variation
                if (missed > 1) {
                    temp += coef * missed; // adding lost variations
                    missed = 0;
                }
               /* if (temp > 1)
                    temp = 1; */
                // uncomment if index bound error !
            }

            res.set(iter, frame1.toString());
            res.set(iter + (cycle), frame2.toString());
            res.set(iter + (cycle*2), frame3.toString());
            res.set(iter + (cycle*3), frame4.toString());
            // push the 4 frames with their order
        }

        return res;
    }

}
