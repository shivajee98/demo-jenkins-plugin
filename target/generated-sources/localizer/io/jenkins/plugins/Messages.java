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

    /**
     * Key {@code Delay.NotNumber}: {@code Enter A Valid Number}.
     * 
     * @return
     *     {@code Enter A Valid Number}
     */
    public static String Delay_NotNumber() {
        return holder.format("Delay.NotNumber");
    }

    /**
     * Key {@code Delay.NotNumber}: {@code Enter A Valid Number}.
     * 
     * @return
     *     {@code Enter A Valid Number}
     */
    public static Localizable _Delay_NotNumber() {
        return new Localizable(holder, "Delay.NotNumber");
    }

    /**
     * Key {@code Delay.ErrorNegativeNumber}: {@code Enter Positive Number}.
     * 
     * @return
     *     {@code Enter Positive Number}
     */
    public static String Delay_ErrorNegativeNumber() {
        return holder.format("Delay.ErrorNegativeNumber");
    }

    /**
     * Key {@code Delay.ErrorNegativeNumber}: {@code Enter Positive Number}.
     * 
     * @return
     *     {@code Enter Positive Number}
     */
    public static Localizable _Delay_ErrorNegativeNumber() {
        return new Localizable(holder, "Delay.ErrorNegativeNumber");
    }

}
