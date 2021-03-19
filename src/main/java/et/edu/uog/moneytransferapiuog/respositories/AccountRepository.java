package et.edu.uog.moneytransferapiuog.respositories;

import et.edu.uog.moneytransferapiuog.domains.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Create, Read, Update, Delete
 *
 * @author Biniam Asnake
 */
public interface AccountRepository extends CrudRepository<Account, Long> {
}
