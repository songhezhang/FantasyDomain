package com.fantasystep.systemweaver;

import com.fantasystep.annotation.ControlType;
import com.fantasystep.annotation.DomainClass;
import com.fantasystep.annotation.FantasyStep;
import com.fantasystep.annotation.FantasyView;
import com.fantasystep.annotation.SerializationType;
import com.fantasystep.annotation.Storage;
import com.fantasystep.domain.MongoDynamicDomain;
import com.fantasystep.domain.Node;
import com.fantasystep.systemweaver.annotation.SystemWeaver;

@DomainClass(label = "LABEL_ANY_GROUP", icon = "file-roller.png")
public abstract class SysWDomain extends Node implements MongoDynamicDomain {
	
	private static final long serialVersionUID = 387796940786683851L;
	
	@SystemWeaver
	@FantasyStep(required = true, storage = Storage.MONGO, serializationType = SerializationType.STRING)
	@FantasyView(controlType = ControlType.TEXTBOX, label = "LABEL_HANDLE_ID")
	private String handleId;

	public String getHandleId() {
		return handleId;
	}

	public void setHandleId(String handleId) {
		this.handleId = handleId;
	}

}
