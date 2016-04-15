package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.marketing.group.bo.Group;

public interface IGroupService {

	public Optional<Group> single(String groupid) ;
}
