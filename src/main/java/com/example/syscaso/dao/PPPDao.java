package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.PPP;

public interface PPPDao {
	PPP create(PPP c);
	PPP update(PPP c);
	void delete(Long id);
	Optional<PPP> read(Long id);
	List<PPP> readAll();
}
