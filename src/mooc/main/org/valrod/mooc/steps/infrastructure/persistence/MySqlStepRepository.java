package org.valrod.mooc.steps.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.valrod.mooc.steps.domain.Step;
import org.valrod.mooc.steps.domain.StepId;
import org.valrod.mooc.steps.domain.StepRepository;
import org.valrod.shared.domain.Service;
import org.valrod.shared.infrastructure.hibernate.HibernateRepository;

import java.util.Optional;

@Service
public class MySqlStepRepository extends HibernateRepository<Step> implements StepRepository {
    private SessionFactory sessionFactory;

    public MySqlStepRepository(SessionFactory sessionFactory) {
        super(sessionFactory, Step.class);
    }

    @Override
    public void save(Step step) {
        persist(step);
    }

    @Override
    public Optional<? extends Step> search(StepId id) {
        return byId(id);
    }
}
