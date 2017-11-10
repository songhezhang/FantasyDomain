package com.fantasystep.systemweaver.item;

import com.fantasystep.annotation.DomainClass;
import com.fantasystep.systemweaver.SysWDomain;

@DomainClass(validParents = { EPlatform.class }, label = "LABEL_ETHERNET_NETWORK", icon = "ethernet-network.ico")
public class EthernetNetwork extends SysWDomain {

	private static final long serialVersionUID = -1291134236766974803L;

}
