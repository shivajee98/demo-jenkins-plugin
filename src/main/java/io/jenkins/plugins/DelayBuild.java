package io.jenkins.plugins;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;
import java.io.IOException;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

public class DelayBuild extends Builder {
    private final long delay;

    @DataBoundConstructor
    public DelayBuild(long delay) {
        this.delay = delay;
    }

    @Override
    public boolean perform(Build<?, ?> build, Launcher launcher, BuildListener listener)
            throws InterruptedException, IOException {
        listener.getLogger().println("Delay Build for " + delay + " ms");
        Thread.sleep(delay);
        return true;
    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> jobType) {
            return jobType == FreeStyleProject.class;
        }

        public FormValidation doCheckDelay(@QueryParameter String delay) {
            try {
                long longValue = Long.parseLong(delay);
                if (longValue < 0) {
                    return FormValidation.error("Enter a positive number");
                } else {
                    return FormValidation.ok();
                }
            } catch (NumberFormatException e) {
                return FormValidation.error("Provide a valid positive number");
            }
        }
    }
}
