/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AClassHeader extends PClassHeader
{
    private PClassModifiers _classModifiers_;
    private PClassType _classType_;
    private TIdentifier _identifier_;
    private POptionalFormalTemplateParameters _optionalFormalTemplateParameters_;
    private PClassSpecializesSection _classSpecializesSection_;
    private PClassImplementsSection _classImplementsSection_;

    public AClassHeader()
    {
        // Constructor
    }

    public AClassHeader(
        @SuppressWarnings("hiding") PClassModifiers _classModifiers_,
        @SuppressWarnings("hiding") PClassType _classType_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") POptionalFormalTemplateParameters _optionalFormalTemplateParameters_,
        @SuppressWarnings("hiding") PClassSpecializesSection _classSpecializesSection_,
        @SuppressWarnings("hiding") PClassImplementsSection _classImplementsSection_)
    {
        // Constructor
        setClassModifiers(_classModifiers_);

        setClassType(_classType_);

        setIdentifier(_identifier_);

        setOptionalFormalTemplateParameters(_optionalFormalTemplateParameters_);

        setClassSpecializesSection(_classSpecializesSection_);

        setClassImplementsSection(_classImplementsSection_);

    }

    @Override
    public Object clone()
    {
        return new AClassHeader(
            cloneNode(this._classModifiers_),
            cloneNode(this._classType_),
            cloneNode(this._identifier_),
            cloneNode(this._optionalFormalTemplateParameters_),
            cloneNode(this._classSpecializesSection_),
            cloneNode(this._classImplementsSection_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassHeader(this);
    }

    public PClassModifiers getClassModifiers()
    {
        return this._classModifiers_;
    }

    public void setClassModifiers(PClassModifiers node)
    {
        if(this._classModifiers_ != null)
        {
            this._classModifiers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classModifiers_ = node;
    }

    public PClassType getClassType()
    {
        return this._classType_;
    }

    public void setClassType(PClassType node)
    {
        if(this._classType_ != null)
        {
            this._classType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classType_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public POptionalFormalTemplateParameters getOptionalFormalTemplateParameters()
    {
        return this._optionalFormalTemplateParameters_;
    }

    public void setOptionalFormalTemplateParameters(POptionalFormalTemplateParameters node)
    {
        if(this._optionalFormalTemplateParameters_ != null)
        {
            this._optionalFormalTemplateParameters_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._optionalFormalTemplateParameters_ = node;
    }

    public PClassSpecializesSection getClassSpecializesSection()
    {
        return this._classSpecializesSection_;
    }

    public void setClassSpecializesSection(PClassSpecializesSection node)
    {
        if(this._classSpecializesSection_ != null)
        {
            this._classSpecializesSection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classSpecializesSection_ = node;
    }

    public PClassImplementsSection getClassImplementsSection()
    {
        return this._classImplementsSection_;
    }

    public void setClassImplementsSection(PClassImplementsSection node)
    {
        if(this._classImplementsSection_ != null)
        {
            this._classImplementsSection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classImplementsSection_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classModifiers_)
            + toString(this._classType_)
            + toString(this._identifier_)
            + toString(this._optionalFormalTemplateParameters_)
            + toString(this._classSpecializesSection_)
            + toString(this._classImplementsSection_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classModifiers_ == child)
        {
            this._classModifiers_ = null;
            return;
        }

        if(this._classType_ == child)
        {
            this._classType_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._optionalFormalTemplateParameters_ == child)
        {
            this._optionalFormalTemplateParameters_ = null;
            return;
        }

        if(this._classSpecializesSection_ == child)
        {
            this._classSpecializesSection_ = null;
            return;
        }

        if(this._classImplementsSection_ == child)
        {
            this._classImplementsSection_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classModifiers_ == oldChild)
        {
            setClassModifiers((PClassModifiers) newChild);
            return;
        }

        if(this._classType_ == oldChild)
        {
            setClassType((PClassType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._optionalFormalTemplateParameters_ == oldChild)
        {
            setOptionalFormalTemplateParameters((POptionalFormalTemplateParameters) newChild);
            return;
        }

        if(this._classSpecializesSection_ == oldChild)
        {
            setClassSpecializesSection((PClassSpecializesSection) newChild);
            return;
        }

        if(this._classImplementsSection_ == oldChild)
        {
            setClassImplementsSection((PClassImplementsSection) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}