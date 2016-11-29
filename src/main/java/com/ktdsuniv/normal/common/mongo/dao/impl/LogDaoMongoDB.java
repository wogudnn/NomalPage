package com.ktdsuniv.normal.common.mongo.dao.impl;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.ktdsuniv.normal.common.mongo.dao.LogDao;
import com.ktdsuniv.normal.common.mongo.schema.LogSchema;

public class LogDaoMongoDB implements LogDao {

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void writeLog(LogSchema loggerVO) {
		mongoTemplate.insert(loggerVO);
	}
	
}
