
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({96EFA5B6-F286-4590-96B5-F944707646A1})</p>
 */
@ComInterface(iid="{96EFA5B6-F286-4590-96B5-F944707646A1}")
public interface Operation extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0xa19)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "WSParameters", dispId = 0xa19)
    WSParameters getWSParameters();
            
    /**
     * <p>id(0xa18)</p>
     * <p>vtableId(10)</p>
     * @param bstrParameters [in, optional] {@code String}
     */
    @ComMethod(name = "Execute", dispId = 0xa18)
    Object Execute(String bstrParameters);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(11)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}