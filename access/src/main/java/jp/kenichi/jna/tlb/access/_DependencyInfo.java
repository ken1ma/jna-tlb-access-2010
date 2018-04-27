
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D05819C6-8859-418B-A82F-18B6CB743C8E})</p>
 */
@ComInterface(iid="{D05819C6-8859-418B-A82F-18B6CB743C8E}")
public interface _DependencyInfo extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x984)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Dependants", dispId = 0x984)
    _DependencyObjects getDependants();
            
    /**
     * <p>id(0x985)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Dependencies", dispId = 0x985)
    _DependencyObjects getDependencies();
            
    /**
     * <p>id(0x986)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "OutOfDateObjects", dispId = 0x986)
    _DependencyObjects getOutOfDateObjects();
            
    /**
     * <p>id(0x987)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "InsufficientPermissions", dispId = 0x987)
    _DependencyObjects getInsufficientPermissions();
            
    /**
     * <p>id(0x988)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "UnsupportedObjects", dispId = 0x988)
    _DependencyObjects getUnsupportedObjects();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(13)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}