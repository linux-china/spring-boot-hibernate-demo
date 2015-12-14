package org.mvnsearch.domain.infrastructure.domain;

import org.junit.Test;
import org.mvnsearch.HibernateAppBaseTest;
import org.mvnsearch.domain.model.account.Account;
import org.mvnsearch.domain.model.account.AccountRepository;
import org.unitils.spring.annotation.SpringBeanByType;

import java.util.Optional;

/**
 * account repository implementation test
 *
 * @author linux_china
 */
public class AccountRepositoryImplTest extends HibernateAppBaseTest {
    @SpringBeanByType
    private AccountRepository accountRepository;

    @Test
    public void testFindOne() {
        Optional<Account> account = accountRepository.findOne(1);
        account.ifPresent(t -> System.out.println(t.getNick()));
    }
}
