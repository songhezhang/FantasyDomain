package com.fantasystep.systemweaver.item;

import com.fantasystep.annotation.DomainClass;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.systemweaver.SysWDomain;

@DomainClass(validParents = { EntityGroup.class }, label = "LABEL_E_PLATFORM", icon = "e-platform.ico")
public class EPlatform extends SysWDomain {

	private static final long serialVersionUID = 8316698461907706648L;

}
