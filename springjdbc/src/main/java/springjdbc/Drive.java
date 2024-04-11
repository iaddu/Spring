package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Drive {
	public static void main(String ar[]) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
	 JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean("jdbcTemplate");
	 String query="insert into Student values(?,?,?)";
	 int result=jdbcTemplate.update(query,"103","Beta","Tokyo");
	 System.out.println(result);
	}
}
