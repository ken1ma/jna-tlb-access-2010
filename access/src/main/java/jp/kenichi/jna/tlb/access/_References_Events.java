
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F163F201-ADA2-11CF-89A9-00A0C9054129})</p>
 */
@ComInterface(iid="{F163F201-ADA2-11CF-89A9-00A0C9054129}")
public interface _References_Events extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * @param Reference [] {@code Reference}
     */
    @ComMethod(name = "ItemAdded", dispId = 0x0)
    void ItemAdded(Reference Reference);
            
    /**
     * <p>id(0x1)</p>
     * @param Reference [] {@code Reference}
     */
    @ComMethod(name = "ItemRemoved", dispId = 0x1)
    void ItemRemoved(Reference Reference);
            
    
}