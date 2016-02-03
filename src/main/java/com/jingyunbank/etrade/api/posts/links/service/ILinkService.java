package com.jingyunbank.etrade.api.posts.links.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.posts.links.bo.Link;

public interface ILinkService {

	public boolean save(Link bo) throws Exception;

	public boolean refresh(Link bo) throws Exception;

	public boolean remove(String id) throws Exception;

	public List<Link> listLinks() throws Exception;

	public Optional<Link> singByID(String id) throws Exception;
}
