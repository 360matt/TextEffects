package fr.i360matt.textEffects;

import java.util.ArrayList;
import java.util.List;

public abstract class Animation {
    public int cursor = 0;
    public List<String> formatted = new ArrayList<>();

    public final String getNext () {
        return (cursor < formatted.size())
                ? formatted.get(cursor++)
                : formatted.get( (cursor=0) );
    }

}
