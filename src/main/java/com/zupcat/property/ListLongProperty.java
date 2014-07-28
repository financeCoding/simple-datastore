package com.zupcat.property;

import com.zupcat.model.PersistentObject;

import java.io.Serializable;

public class ListLongProperty extends AbstractListAnyProperty<Long> implements Serializable {

    private static final long serialVersionUID = 6181606486836703354L;

    public ListLongProperty(final PersistentObject owner, final String name, final boolean sentToClient, final boolean auditable) {
        super(owner, name, sentToClient, auditable);
    }

    @Override
    protected Long convertItemFromString(final String s) {
        return s == null ? null : Long.valueOf(s);
    }
}