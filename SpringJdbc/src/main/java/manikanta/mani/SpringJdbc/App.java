package manikanta.mani.SpringJdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MocUtil.class);

		Person person = container.getBean(Person.class);
		person.displayPerson();
		container.close();
	}

}
