
package jp.kenichi.jna.tlb.vbide;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E118-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E118-0000-0000-C000-000000000046}")
public interface _dispReferencesEventsListener {
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void ItemAdded(Reference Reference);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void ItemRemoved(Reference Reference);
            
    
}