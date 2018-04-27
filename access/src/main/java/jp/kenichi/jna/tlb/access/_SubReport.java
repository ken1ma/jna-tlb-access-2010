
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E966-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E966-E47C-11CD-8701-00AA003F0F07}")
public interface _SubReport extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x829)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Form", dispId = 0x829)
    Form getForm();
            
    /**
     * <p>id(0x831)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Report", dispId = 0x831)
    Report getReport();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(11)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}