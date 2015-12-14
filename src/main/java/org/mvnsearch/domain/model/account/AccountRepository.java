package org.mvnsearch.domain.model.account;

import java.util.Optional;

/**
 * account repository
 *
 * @author linux_china
 */
public interface AccountRepository {

    public Optional<Account> findOne(Integer id);
}
