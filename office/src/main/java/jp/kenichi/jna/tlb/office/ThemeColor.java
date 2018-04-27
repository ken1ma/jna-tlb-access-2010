
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03A1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03A1-0000-0000-C000-000000000046}")
public interface ThemeColor extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    Integer getRGB();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    void setRGB(Integer param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ThemeColorSchemeIndex", dispId = 0x60030003)
    MsoThemeColorSchemeIndex getThemeColorSchemeIndex();
            
    
}