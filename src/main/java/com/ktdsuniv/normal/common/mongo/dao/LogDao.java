package com.ktdsuniv.normal.common.mongo.dao;

import com.ktdsuniv.normal.common.mongo.schema.LogSchema;

public interface LogDao {

	public void writeLog(LogSchema loggerVO);
}
