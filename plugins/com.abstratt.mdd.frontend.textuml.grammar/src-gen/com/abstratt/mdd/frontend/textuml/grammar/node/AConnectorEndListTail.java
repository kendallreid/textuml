/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AConnectorEndListTail extends PConnectorEndListTail
{
    private TComma _comma_;
    private PConnectorEndList _connectorEndList_;

    public AConnectorEndListTail()
    {
        // Constructor
    }

    public AConnectorEndListTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PConnectorEndList _connectorEndList_)
    {
        // Constructor
        setComma(_comma_);

        setConnectorEndList(_connectorEndList_);

    }

    @Override
    public Object clone()
    {
        return new AConnectorEndListTail(
            cloneNode(this._comma_),
            cloneNode(this._connectorEndList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConnectorEndListTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PConnectorEndList getConnectorEndList()
    {
        return this._connectorEndList_;
    }

    public void setConnectorEndList(PConnectorEndList node)
    {
        if(this._connectorEndList_ != null)
        {
            this._connectorEndList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._connectorEndList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._connectorEndList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._connectorEndList_ == child)
        {
            this._connectorEndList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._connectorEndList_ == oldChild)
        {
            setConnectorEndList((PConnectorEndList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
