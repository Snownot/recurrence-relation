package org.recurrencerelation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuring a context in bean style.
 */
@Configuration
@PropertySource(value = "classpath:application.yml", factory = YamlPropertySourceFactory.class)
@ComponentScan(basePackages = "org.recurrencerelation")
@EnableAspectJAutoProxy
public class ConfigApplication {


}
