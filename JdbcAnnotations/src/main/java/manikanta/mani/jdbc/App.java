package manikanta.mani.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import manikanta.mani1.MocUtil;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);
		JdbcTemplate bean = container.getBean(JdbcTemplate.class);
		bean.update("insert into emp_tbl values(8,'Mk',69000)");
		container.close();
	}
}
