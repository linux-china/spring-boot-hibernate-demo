package org.mvnsearch.domain.infrastructure.domain.account;

import org.mvnsearch.domain.model.account.Account;
import org.mvnsearch.domain.model.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

/**
 * account repository implementation
 *
 * @author linux_china
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Autowired
    HibernateTemplate hibernateTemplate;
    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Account> findOne(Integer id) {
        return Optional.of(hibernateTemplate.get(Account.class, id));
    }
}
