package com.jingyunbank.etrade.api.asyn.service.context;

import com.jingyunbank.etrade.api.asyn.bo.AsynSchedule;

public interface IAsynRunService {

	public void run(AsynSchedule schedule);
}
