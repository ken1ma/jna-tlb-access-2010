
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EB106213-9C89-11CF-A2B3-00A0C90542FF})</p>
 */
@ComInterface(iid="{EB106213-9C89-11CF-A2B3-00A0C90542FF}")
public interface _References extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param var [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Reference Item(Object var);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020002)
    Integer getCount();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Guid [in] {@code String}
     * @param Major [in] {@code Integer}
     * @param Minor [in] {@code Integer}
     */
    @ComMethod(name = "AddFromGuid", dispId = 0x60020004)
    Reference AddFromGuid(String Guid,
            Integer Major,
            Integer Minor);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "AddFromFile", dispId = 0x60020005)
    Reference AddFromFile(String FileName);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param Reference [in] {@code Reference}
     */
    @ComMethod(name = "Remove", dispId = 0x60020006)
    void Remove(Reference Reference);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(14)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}