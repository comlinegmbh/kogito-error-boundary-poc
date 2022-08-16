package de.comline;

import org.drools.core.event.DebugProcessEventListener;
import org.jbpm.process.instance.event.KogitoProcessEventListenerAdapter;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.kogito.process.impl.DefaultProcessEventListenerConfig;
import org.springframework.stereotype.Component;

@Component
public class ProcessListenerConfig extends DefaultProcessEventListenerConfig {
	public ProcessListenerConfig() {
		super(new KogitoProcessEventListenerAdapter(new MyDebugProcessEventListener()));
	}

	public static class MyDebugProcessEventListener extends DebugProcessEventListener {
		@Override
		public void beforeVariableChanged(ProcessVariableChangedEvent event) {
			super.beforeVariableChanged(event);
		}
	}
}