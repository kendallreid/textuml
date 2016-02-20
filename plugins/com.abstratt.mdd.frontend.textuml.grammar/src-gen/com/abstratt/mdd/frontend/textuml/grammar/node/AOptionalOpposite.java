/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AOptionalOpposite extends POptionalOpposite
{
    private TOpposite _opposite_;
    private TIdentifier _otherEnd_;

    public AOptionalOpposite()
    {
        // Constructor
    }

    public AOptionalOpposite(
        @SuppressWarnings("hiding") TOpposite _opposite_,
        @SuppressWarnings("hiding") TIdentifier _otherEnd_)
    {
        // Constructor
        setOpposite(_opposite_);

        setOtherEnd(_otherEnd_);

    }

    @Override
    public Object clone()
    {
        return new AOptionalOpposite(
            cloneNode(this._opposite_),
            cloneNode(this._otherEnd_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOptionalOpposite(this);
    }

    public TOpposite getOpposite()
    {
        return this._opposite_;
    }

    public void setOpposite(TOpposite node)
    {
        if(this._opposite_ != null)
        {
            this._opposite_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opposite_ = node;
    }

    public TIdentifier getOtherEnd()
    {
        return this._otherEnd_;
    }

    public void setOtherEnd(TIdentifier node)
    {
        if(this._otherEnd_ != null)
        {
            this._otherEnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._otherEnd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opposite_)
            + toString(this._otherEnd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opposite_ == child)
        {
            this._opposite_ = null;
            return;
        }

        if(this._otherEnd_ == child)
        {
            this._otherEnd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opposite_ == oldChild)
        {
            setOpposite((TOpposite) newChild);
            return;
        }

        if(this._otherEnd_ == oldChild)
        {
            setOtherEnd((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}