/*
 *    VMClassFactory.java    1.2    03/01/14 SMI
 *
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package vm;
import components.ClassInfo;

public interface VMClassFactory {
    public ClassClass newVMClass( components.ClassInfo c );

    public void setTypes();

    /*
     * Add more stuff here as we carve more out of ClassClass
     */
}
