
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DC6B66C0-6128-101B-AF4E-00AA003F0F07})</p>
 */
@ComInterface(iid="{DC6B66C0-6128-101B-AF4E-00AA003F0F07}")
public interface Screen extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x862)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "ActiveDatasheet", dispId = 0x862)
    Form getActiveDatasheet();
            
    /**
     * <p>id(0x7d6)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ActiveControl", dispId = 0x7d6)
    Control getActiveControl();
            
    /**
     * <p>id(0x7d7)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PreviousControl", dispId = 0x7d7)
    Control getPreviousControl();
            
    /**
     * <p>id(0x7d8)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ActiveForm", dispId = 0x7d8)
    Form getActiveForm();
            
    /**
     * <p>id(0x7d9)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveReport", dispId = 0x7d9)
    Report getActiveReport();
            
    /**
     * <p>id(0x83a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0x83a)
    Short getMousePointer();
            
    /**
     * <p>id(0x83a)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "MousePointer", dispId = 0x83a)
    void setMousePointer(Short param0);
            
    /**
     * <p>id(0x8a6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ActiveDataAccessPage", dispId = 0x8a6)
    DataAccessPage getActiveDataAccessPage();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(17)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}