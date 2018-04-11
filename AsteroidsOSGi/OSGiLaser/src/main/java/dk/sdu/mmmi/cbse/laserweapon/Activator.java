package dk.sdu.mmmi.cbse.laserweapon;

import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
    private ServiceRegistration registrate;

    public void start(BundleContext context) throws Exception {
        this.registrate = context.registerService(IEntityProcessingService.class, new LaserSystem(), null);
    }

    public void stop(BundleContext context) throws Exception {
        this.registrate.unregister();
    }

}
