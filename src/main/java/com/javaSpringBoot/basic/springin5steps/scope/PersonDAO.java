package com.javaSpringBoot.basic.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	@Autowired
	JdbcConnection jdbcconnection;

	public JdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(JdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	
	
	
}
