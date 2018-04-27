
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7A7B2B33-A93D-4E04-BFC7-6041AAA0046D})</p>
 */
@ComInterface(iid="{7A7B2B33-A93D-4E04-BFC7-6041AAA0046D}")
public interface WebService extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa16)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Entities", dispId = 0xa16)
    Entities getEntities();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(10)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}