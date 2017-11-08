package com.fantasystep.systemweaver.item;

import com.fantasystep.annotation.ControlType;
import com.fantasystep.annotation.DomainClass;
import com.fantasystep.annotation.FantasyStep;
import com.fantasystep.annotation.FantasyView;
import com.fantasystep.annotation.Storage;
import com.fantasystep.systemweaver.SysWDomain;
import com.fantasystep.systemweaver.annotation.SystemWeaver;

@DomainClass(validParents = { MicroControllerCoreVirtualMachine.class }, label = "LABEL_COMPOSITION", icon = "gtk-file.png")
public class Composition extends SysWDomain {

	private static final long serialVersionUID = 6874945419593743747L;
	
	@SystemWeaver(isPartAttr = true)
	@FantasyStep(storage = Storage.MONGO)
	@FantasyView(controlType = ControlType.TEXTBOX, label = "LABEL_CYCLE_TIME")
	
	private Integer cycleTime;

	public Integer getCycleTime() {
		return cycleTime;
	}

	public void setCycleTime(Integer cycleTime) {
		this.cycleTime = cycleTime;
	}

}
