
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0921F331-A7C9-11D1-9944-006008197D41})</p>
 */
@ComInterface(iid="{0921F331-A7C9-11D1-9944-006008197D41}")
public interface AccessObjectProperties extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    AccessObjectProperty getItem(Object Index);
            
    /**
     * <p>id(0x7d1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x7d1)
    Integer getCount();
            
    /**
     * <p>id(0x88f)</p>
     * <p>vtableId(12)</p>
     * @param PropertyName [in] {@code String}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x88f)
    void Add(String PropertyName,
            Object Value);
            
    /**
     * <p>id(0x890)</p>
     * <p>vtableId(13)</p>
     * @param Item [in] {@code Object}
     */
    @ComMethod(name = "Remove", dispId = 0x890)
    void Remove(Object Item);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(14)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}