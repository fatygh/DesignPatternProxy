import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

public class MetierImpl implements IMetier {

    @Override
    @Transactional
    @Cacheable
    public void process() {
        System.out.println("Traitement ");
    }
}
