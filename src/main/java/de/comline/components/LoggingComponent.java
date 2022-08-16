package de.comline.components;

import org.springframework.stereotype.Component;

@Component
public class LoggingComponent {

	public void logException(Object ex) {
		System.out.println("Exception: " + ex);
	}

}
