package com.be4tech.b4collect;

import com.be4tech.b4collect.B4CollectV2ReactApp;
import com.be4tech.b4collect.config.AsyncSyncConfiguration;
import com.be4tech.b4collect.config.EmbeddedElasticsearch;
import com.be4tech.b4collect.config.EmbeddedKafka;
import com.be4tech.b4collect.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { B4CollectV2ReactApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
