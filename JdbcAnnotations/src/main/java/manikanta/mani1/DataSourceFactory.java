package manikanta.mani1;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "classpath:manikanta/mani/config/db.properties")
public class DataSourceFactory {
	@Autowired
	public Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("driverClass"));
		dataSource.setUrl(environment.getProperty("url"));
		dataSource.setUsername(environment.getProperty("uName"));
		dataSource.setPassword(environment.getProperty("password"));
		return dataSource;

	}

}
