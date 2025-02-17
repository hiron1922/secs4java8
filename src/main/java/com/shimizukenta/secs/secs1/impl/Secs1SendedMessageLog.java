package com.shimizukenta.secs.secs1.impl;

import java.time.LocalDateTime;

import com.shimizukenta.secs.impl.AbstractSecsSendedMessageLog;

public class Secs1SendedMessageLog extends AbstractSecsSendedMessageLog {
	
	private static final long serialVersionUID = 5464441728143108575L;
	
	private static final String commonSubject = "Sended SECS1-Message";
	
	public Secs1SendedMessageLog(AbstractSecs1Message message, LocalDateTime timestamp) {
		super(message, timestamp);
	}

	public Secs1SendedMessageLog(AbstractSecs1Message message) {
		super(message);
	}
	
	@Override
	public String subject() {
		return commonSubject;
	}
	
}
