package fr.i360matt.textEffects;

import java.util.ArrayList;
import java.util.List;

public abstract class Animation {
    public int lenght = 0;
    public List<String> formatted = new ArrayList<>();

    public final String getNext () {
        return (lenght < formatted.size())
                ? formatted.get(lenght++)
                : formatted.get( (lenght=0) );
    }

}
