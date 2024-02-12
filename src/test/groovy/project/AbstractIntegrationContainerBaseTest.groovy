package project

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import org.testcontainers.containers.GenericContainer

@SpringBootTest
class AbstractIntegrationContainerBaseTest extends Specification {
    static final GenericContainer MY_REDIS_CONTAINER

    static {
        MY_REDIS_CONTAINER = new GenericContainer<>("redis:6")
                .withExposedPorts(6379)

        MY_REDIS_CONTAINER.start()

        System.setProperty("spring.redis.host", MY_REDIS_CONTAINER.getHost())
        System.setProperty("spring.redis.host", MY_REDIS_CONTAINER.getMappedPort(6379).toString())

    }

}
