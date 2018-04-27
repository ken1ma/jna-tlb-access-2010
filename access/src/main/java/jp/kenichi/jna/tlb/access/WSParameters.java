
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({540FC6D0-9BCA-4236-B6C0-E5598CB7A332})</p>
 */
@ComInterface(iid="{540FC6D0-9BCA-4236-B6C0-E5598CB7A332}")
public interface WSParameters extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    WSParameter getItem(Object Index);
            
    /**
     * <p>id(0x7d1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x7d1)
    Integer getCount();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(11)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}