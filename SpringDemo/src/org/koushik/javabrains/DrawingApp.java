package org.koushik.javabrains;

// import org.springframework.beans.factory.BeanFactory;
// import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate and draw a Triangle using an Application Context object
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();
	}

}
