import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Controller {
    @Autowired
    private IMetier metier = new TransactionalProxy();

    public String index(){
        metier.process();
        return "index";
    }
}
