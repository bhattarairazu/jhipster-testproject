package com.ontarget.testing;

import com.ontarget.testing.RedisTestContainerExtension;
import com.ontarget.testing.TestingjhipsterprojectApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = TestingjhipsterprojectApp.class)
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
