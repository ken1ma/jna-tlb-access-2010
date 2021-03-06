
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0396-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0396-0000-0000-C000-000000000046}")
public interface IRibbonExtensibility extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param RibbonID [in] {@code String}
     */
    @ComMethod(name = "GetCustomUI", dispId = 0x1)
    String GetCustomUI(String RibbonID);
            
    
}