package dk.sdu.mmmi.cbse.laserweapon;

import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
    private ServiceRegistration entityRegistrate;
    private ServiceRegistration laserRegistrate;

    public void start(BundleContext context) throws Exception {
        LaserSystem laserImpl = new LaserSystem();
        this.entityRegistrate = context.registerService(IEntityProcessingService.class, laserImpl, null);
        this.laserRegistrate = context.registerService(BulletSPI.class, laserImpl, null);
    }

    public void stop(BundleContext context) throws Exception {
        this.entityRegistrate.unregister();
        this.laserRegistrate.unregister();
    }

}
