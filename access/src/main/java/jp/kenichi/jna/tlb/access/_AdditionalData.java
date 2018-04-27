
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DBC51762-A8ED-11D3-A0DD-00C04F68712B})</p>
 */
@ComInterface(iid="{DBC51762-A8ED-11D3-A0DD-00C04F68712B}")
public interface _AdditionalData extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x14)
    String getName();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x14)
    void setName(String param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    _AdditionalData getItem(Object Index);
            
    /**
     * <p>id(0x7d1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x7d1)
    Integer getCount();
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(11)</p>
     * @param var [in] {@code String}
     */
    @ComMethod(name = "Add", dispId = 0x88f)
    _AdditionalData Add(String var);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(12)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}