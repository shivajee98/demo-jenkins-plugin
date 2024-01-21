// CHECKSTYLE:OFF

package io.jenkins.plugins;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code HelloWorldBuilder.Name}: {@code Enter Your Name Here}.
     * 
     * @return
     *     {@code Enter Your Name Here}
     */
    public static String HelloWorldBuilder_Name() {
        return holder.format("HelloWorldBuilder.Name");
    }

    /**
     * Key {@code HelloWorldBuilder.Name}: {@code Enter Your Name Here}.
     * 
     * @return
     *     {@code Enter Your Name Here}
     */
    public static Localizable _HelloWorldBuilder_Name() {
        return new Localizable(holder, "HelloWorldBuilder.Name");
    }

}
