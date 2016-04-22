package com.jingyunbank.etrade.api.flow.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.flow.bo.FlowStatus;

public interface IFlowStatusService {

	public Optional<FlowStatus> single(String flowType, String currentStatus, String flag);
	
}
