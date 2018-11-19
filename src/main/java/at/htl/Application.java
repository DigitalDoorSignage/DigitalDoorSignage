package at.htl;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class Application {

    @PostConstruct
    public void init(){

    }
}
