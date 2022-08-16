package de.comline.components;

import org.kie.kogito.process.workitem.WorkItemExecutionException;
import org.springframework.stereotype.Component;

@Component
public class AlwaysThrowingComponent {

	public void throwException() {
		throw new WorkItemExecutionException("MY_ERROR", "my exception message");
	}

}
