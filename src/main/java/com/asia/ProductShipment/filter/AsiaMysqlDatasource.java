package com.asia.ProductShipment.filter;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(value="com.asia.ProductShipment.board.dao", sqlSessionFactoryRef="secondSqlSessionFactory")
@MapperScan(value="com.asia.ProductShipment.login.dao", sqlSessionFactoryRef="secondSqlSessionFactory") 
@EnableTransactionManagement
public class AsiaMysqlDatasource {
    
	@Bean(name="secondDataSource") 
	@ConfigurationProperties(prefix="spring.asia-mysql.datasource") 
	public DataSource secondDataSource() { //application.properties에서 정의한 DB 연결 정보를 빌드 
		return DataSourceBuilder.create().build();  
	} 
	
	@Bean(name="secondSqlSessionFactory") 
	public SqlSessionFactory secondSqlSessionFactory(@Qualifier("secondDataSource") DataSource secondDataSource, ApplicationContext applicationContext) throws Exception{ 
		//세션 생성 시, 빌드된 DataSource를 세팅하고 SQL문을 관리할 mapper.xml의 경로를 알려준다. 
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean(); 
		sqlSessionFactoryBean.setDataSource(secondDataSource); 
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mappers/**/*.xml"));
		return sqlSessionFactoryBean.getObject(); 
	} 
	
	
	@Bean(name="secondSqlSessionTemplate") 
	public SqlSessionTemplate secondSqlSessionTemplate(SqlSessionFactory secondSqlSessionFactory) throws Exception { 
		return new SqlSessionTemplate(secondSqlSessionFactory); 
	}
}
