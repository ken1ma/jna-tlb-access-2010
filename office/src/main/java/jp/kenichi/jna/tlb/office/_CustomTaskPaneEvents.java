
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C033C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C033C-0000-0000-C000-000000000046}")
public interface _CustomTaskPaneEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param CustomTaskPaneInst [in] {@code _CustomTaskPane}
     */
    @ComMethod(name = "VisibleStateChange", dispId = 0x1)
    void VisibleStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param CustomTaskPaneInst [in] {@code _CustomTaskPane}
     */
    @ComMethod(name = "DockPositionStateChange", dispId = 0x2)
    void DockPositionStateChange(_CustomTaskPane CustomTaskPaneInst);
            
    
}