package com.netflix.workflowuploader;

import com.netflix.archaius.Test;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext bundleContext) throws Exception {
        Test test = new Test();
        System.out.println("Starting workflow uploader");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Stopping workflow uploader");
    }
}
