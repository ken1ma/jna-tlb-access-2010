
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0393-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0393-0000-0000-C000-000000000046}")
public interface DocumentInspector extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Description", dispId = 0x1)
    String getDescription();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param Status [out] {@code MsoDocInspectorStatus}
     * @param Results [out] {@code String}
     */
    @ComMethod(name = "Inspect", dispId = 0x2)
    void Inspect(VARIANT Status,
            VARIANT Results);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     * @param Status [out] {@code MsoDocInspectorStatus}
     * @param Results [out] {@code String}
     */
    @ComMethod(name = "Fix", dispId = 0x3)
    void Fix(VARIANT Status,
            VARIANT Results);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}