
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9E3F602F-BA36-4865-B3CD-F2EB008F62DE})</p>
 */
@ComInterface(iid="{9E3F602F-BA36-4865-B3CD-F2EB008F62DE}")
public interface _TempVars extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    TempVar getItem(Object Index);
            
    /**
     * <p>id(0x7d1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x7d1)
    Integer getCount();
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x88f)
    void Add(String Name,
            Object Value);
            
    /**
     * <p>id(0x890)</p>
     * <p>vtableId(13)</p>
     * @param var [in] {@code Object}
     */
    @ComMethod(name = "Remove", dispId = 0x890)
    void Remove(Object var);
            
    /**
     * <p>id(0x9b8)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "RemoveAll", dispId = 0x9b8)
    void RemoveAll();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(15)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}