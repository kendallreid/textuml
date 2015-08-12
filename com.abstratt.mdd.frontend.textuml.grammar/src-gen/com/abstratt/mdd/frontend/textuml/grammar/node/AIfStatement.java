/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AIfStatement extends PIfStatement
{
    private TIf _if_;
    private PIfClause _ifClause_;
    private PRestIf _restIf_;

    public AIfStatement()
    {
        // Constructor
    }

    public AIfStatement(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PIfClause _ifClause_,
        @SuppressWarnings("hiding") PRestIf _restIf_)
    {
        // Constructor
        setIf(_if_);

        setIfClause(_ifClause_);

        setRestIf(_restIf_);

    }

    @Override
    public Object clone()
    {
        return new AIfStatement(
            cloneNode(this._if_),
            cloneNode(this._ifClause_),
            cloneNode(this._restIf_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStatement(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PIfClause getIfClause()
    {
        return this._ifClause_;
    }

    public void setIfClause(PIfClause node)
    {
        if(this._ifClause_ != null)
        {
            this._ifClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifClause_ = node;
    }

    public PRestIf getRestIf()
    {
        return this._restIf_;
    }

    public void setRestIf(PRestIf node)
    {
        if(this._restIf_ != null)
        {
            this._restIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._restIf_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._ifClause_)
            + toString(this._restIf_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._ifClause_ == child)
        {
            this._ifClause_ = null;
            return;
        }

        if(this._restIf_ == child)
        {
            this._restIf_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._ifClause_ == oldChild)
        {
            setIfClause((PIfClause) newChild);
            return;
        }

        if(this._restIf_ == oldChild)
        {
            setRestIf((PRestIf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}