package kyng.work.boilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@ComponentScan(basePackages = ["kyng.work"])
@EntityScan(basePackages = ["kyng.work.boilerplate.entity"])
@EnableJpaRepositories(basePackages = ["kyng.work.boilerplate.repository"])
@SpringBootApplication
class BoilerplateApplication {
	companion object {}

	init {}

	// beans
}

fun main(args: Array<String>) {
	runApplication<BoilerplateApplication>(*args)
}
