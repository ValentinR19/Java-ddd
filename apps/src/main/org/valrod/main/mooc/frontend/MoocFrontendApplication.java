package org.valrod.main.mooc.frontend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.valrod.main.mooc.backend.command.AnotherFakeCommand;
import org.valrod.main.mooc.backend.command.FakeCommand;
import org.valrod.shared.domain.Service;

import java.util.HashMap;
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
        value = {"org.valrod.shared", "org.valrod.mooc", "org.valrod.main.mooc.frontend"}
)
public class MoocFrontendApplication {
    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
            put("fake", FakeCommand.class);
            put("another_fake", AnotherFakeCommand.class);
        }};
    }
}
