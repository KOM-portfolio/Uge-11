package dk.sdu.mmmi.cbse.osgicollision;

import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
    private ServiceRegistration registrate;
    
    public void start(BundleContext context) throws Exception {
        this.registrate = context.registerService(IPostEntityProcessingService.class, new CollisionSystem(), null);
    }

    public void stop(BundleContext context) throws Exception {
        this.registrate.unregister();
    }

}
