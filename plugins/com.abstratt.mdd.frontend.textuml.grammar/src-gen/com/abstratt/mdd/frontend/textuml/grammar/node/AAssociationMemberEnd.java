/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AAssociationMemberEnd extends PAssociationMemberEnd
{
    private TRole _role_;
    private PQualifiedIdentifier _classifier_;
    private TDot _dot_;
    private TIdentifier _property_;

    public AAssociationMemberEnd()
    {
        // Constructor
    }

    public AAssociationMemberEnd(
        @SuppressWarnings("hiding") TRole _role_,
        @SuppressWarnings("hiding") PQualifiedIdentifier _classifier_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TIdentifier _property_)
    {
        // Constructor
        setRole(_role_);

        setClassifier(_classifier_);

        setDot(_dot_);

        setProperty(_property_);

    }

    @Override
    public Object clone()
    {
        return new AAssociationMemberEnd(
            cloneNode(this._role_),
            cloneNode(this._classifier_),
            cloneNode(this._dot_),
            cloneNode(this._property_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssociationMemberEnd(this);
    }

    public TRole getRole()
    {
        return this._role_;
    }

    public void setRole(TRole node)
    {
        if(this._role_ != null)
        {
            this._role_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._role_ = node;
    }

    public PQualifiedIdentifier getClassifier()
    {
        return this._classifier_;
    }

    public void setClassifier(PQualifiedIdentifier node)
    {
        if(this._classifier_ != null)
        {
            this._classifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classifier_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TIdentifier getProperty()
    {
        return this._property_;
    }

    public void setProperty(TIdentifier node)
    {
        if(this._property_ != null)
        {
            this._property_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._property_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._role_)
            + toString(this._classifier_)
            + toString(this._dot_)
            + toString(this._property_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._role_ == child)
        {
            this._role_ = null;
            return;
        }

        if(this._classifier_ == child)
        {
            this._classifier_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._property_ == child)
        {
            this._property_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._role_ == oldChild)
        {
            setRole((TRole) newChild);
            return;
        }

        if(this._classifier_ == oldChild)
        {
            setClassifier((PQualifiedIdentifier) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._property_ == oldChild)
        {
            setProperty((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
