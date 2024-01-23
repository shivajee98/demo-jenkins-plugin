package io.jenkins.plugins;

import static org.junit.jupiter.api.Assertions.*;

import hudson.model.FreeStyleBuild;
import hudson.model.FreeStyleProject;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

public class DelayBuildTest {
    @Rule
    public JenkinsRule rule = new JenkinsRule();

    @Test
    public void CheckSleepOutput() throws IOException, ExecutionException, InterruptedException {
        // Given
        long delay = 12;
        DelayBuild build = new DelayBuild(delay);
        FreeStyleProject project = rule.createFreeStyleProject();
        project.getBuildersList().add(build);

        // When I build the freestyle project
        FreeStyleBuild freeStyleBuild = project.scheduleBuild2(0).get();

        // Then
        assertTrue(freeStyleBuild.getLog().contains("Delay Build for " + delay + " ms"));
    }
}
