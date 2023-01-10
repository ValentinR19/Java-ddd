package org.valrod.mooc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.valrod.main.mooc.backend.MoocBackendApplication;
import org.valrod.shared.infrastructure.InfrastructureTestCase;

@ContextConfiguration(classes = MoocBackendApplication.class)
@SpringBootTest
public class MoocContextInfrastructureTestCase extends InfrastructureTestCase {
}
