
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4DCF0AC2-53CC-45E5-B417-01F3DDD387E5})</p>
 */
@ComInterface(iid="{4DCF0AC2-53CC-45E5-B417-01F3DDD387E5}")
public interface SharedResource extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x80010000)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x82f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x82f)
    AcResourceType getType();
            
    /**
     * <p>id(0x80f)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80f)
    void Delete();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(12)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}