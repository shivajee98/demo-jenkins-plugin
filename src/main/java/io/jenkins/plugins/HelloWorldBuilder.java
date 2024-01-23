package io.jenkins.plugins;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import hudson.Launcher;
import hudson.model.*;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import java.io.IOException;
import org.kohsuke.stapler.DataBoundConstructor;

public class HelloWorldBuilder extends Builder {
    private String name;

    @DataBoundConstructor
    public HelloWorldBuilder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean perform(Build<?, ?> build, Launcher launcher, BuildListener listener)
            throws InterruptedException, IOException {
        listener.getLogger().println(name);
        return true;
    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> jobType) {
            return jobType == FreeStyleProject.class;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return Messages.HelloWorldBuilder_Name();
        }
    }
}
