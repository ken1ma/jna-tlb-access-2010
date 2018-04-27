
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000534-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000534-0000-0010-8000-00AA006D2EA4}")
public interface _ADO extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x1f4)
    Properties getProperties();
            
    
}