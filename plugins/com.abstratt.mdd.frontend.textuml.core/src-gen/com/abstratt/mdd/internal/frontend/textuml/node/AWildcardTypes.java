/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AWildcardTypes extends PWildcardTypes
{
    private TLab _lab_;
    private PWildcardType _wildcardType_;
    private PWildcardTypeTail _wildcardTypeTail_;
    private TRab _rab_;

    public AWildcardTypes()
    {
        // Constructor
    }

    public AWildcardTypes(
        @SuppressWarnings("hiding") TLab _lab_,
        @SuppressWarnings("hiding") PWildcardType _wildcardType_,
        @SuppressWarnings("hiding") PWildcardTypeTail _wildcardTypeTail_,
        @SuppressWarnings("hiding") TRab _rab_)
    {
        // Constructor
        setLab(_lab_);

        setWildcardType(_wildcardType_);

        setWildcardTypeTail(_wildcardTypeTail_);

        setRab(_rab_);

    }

    @Override
    public Object clone()
    {
        return new AWildcardTypes(
            cloneNode(this._lab_),
            cloneNode(this._wildcardType_),
            cloneNode(this._wildcardTypeTail_),
            cloneNode(this._rab_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWildcardTypes(this);
    }

    public TLab getLab()
    {
        return this._lab_;
    }

    public void setLab(TLab node)
    {
        if(this._lab_ != null)
        {
            this._lab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lab_ = node;
    }

    public PWildcardType getWildcardType()
    {
        return this._wildcardType_;
    }

    public void setWildcardType(PWildcardType node)
    {
        if(this._wildcardType_ != null)
        {
            this._wildcardType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardType_ = node;
    }

    public PWildcardTypeTail getWildcardTypeTail()
    {
        return this._wildcardTypeTail_;
    }

    public void setWildcardTypeTail(PWildcardTypeTail node)
    {
        if(this._wildcardTypeTail_ != null)
        {
            this._wildcardTypeTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardTypeTail_ = node;
    }

    public TRab getRab()
    {
        return this._rab_;
    }

    public void setRab(TRab node)
    {
        if(this._rab_ != null)
        {
            this._rab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rab_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lab_)
            + toString(this._wildcardType_)
            + toString(this._wildcardTypeTail_)
            + toString(this._rab_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lab_ == child)
        {
            this._lab_ = null;
            return;
        }

        if(this._wildcardType_ == child)
        {
            this._wildcardType_ = null;
            return;
        }

        if(this._wildcardTypeTail_ == child)
        {
            this._wildcardTypeTail_ = null;
            return;
        }

        if(this._rab_ == child)
        {
            this._rab_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lab_ == oldChild)
        {
            setLab((TLab) newChild);
            return;
        }

        if(this._wildcardType_ == oldChild)
        {
            setWildcardType((PWildcardType) newChild);
            return;
        }

        if(this._wildcardTypeTail_ == oldChild)
        {
            setWildcardTypeTail((PWildcardTypeTail) newChild);
            return;
        }

        if(this._rab_ == oldChild)
        {
            setRab((TRab) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}