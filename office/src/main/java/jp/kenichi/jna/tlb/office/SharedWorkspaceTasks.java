
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C037A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C037A-0000-0000-C000-000000000046}")
public interface SharedWorkspaceTasks extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    SharedWorkspaceTask getItem(Integer Index);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param Title [in] {@code String}
     * @param Status [in, optional] {@code Object}
     * @param Priority [in, optional] {@code Object}
     * @param Assignee [in, optional] {@code Object}
     * @param Description [in, optional] {@code Object}
     * @param DueDate [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    SharedWorkspaceTask Add(String Title,
            Object Status,
            Object Priority,
            Object Assignee,
            Object Description,
            Object DueDate);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ItemCountExceeded", dispId = 0x4)
    Boolean getItemCountExceeded();
            
    
}