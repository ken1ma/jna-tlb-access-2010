
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F163F201-ADA2-11CF-89A9-00A0C9054129})</p>
 */
@ComInterface(iid="{F163F201-ADA2-11CF-89A9-00A0C9054129}")
public interface _References_EventsListener {
    /**
     * <p>id(0x0)</p>
     */
    @ComEventCallback(dispid = 0x0)
    void ItemAdded(Reference Reference);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void ItemRemoved(Reference Reference);
            
    
}