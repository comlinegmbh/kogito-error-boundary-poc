package de.comline;

import org.kie.kogito.Model;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "org.kie.**", "de.comline" })
public class Main implements CommandLineRunner {

	@Autowired
	@Qualifier("poc")
	private Process<? extends Model> process;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Model model = process.createModel();
		ProcessInstance<?> instance = process.createInstance(model);
		instance.start();
		System.exit(0);
	}

}