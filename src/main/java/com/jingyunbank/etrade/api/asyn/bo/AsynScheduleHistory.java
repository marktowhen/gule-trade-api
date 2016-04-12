package com.jingyunbank.etrade.api.asyn.bo;

import java.util.Date;

public class AsynScheduleHistory extends AsynSchedule  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2195868384178403702L;

	private Date finishtime;
	public Date getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}
	
}
