/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TRaise extends Token
{
    public TRaise()
    {
        super.setText("raise");
    }

    public TRaise(int line, int pos)
    {
        super.setText("raise");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRaise(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRaise(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRaise text.");
    }
}
