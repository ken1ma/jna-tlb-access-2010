
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9D2AB5D3-CD72-4A9A-A72E-2B3492CBD0AE})</p>
 */
@ComInterface(iid="{9D2AB5D3-CD72-4A9A-A72E-2B3492CBD0AE}")
public interface _SmartTag extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    _SmartTagProperties getProperties();
            
    /**
     * <p>id(0x98a)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "SmartTagActions", dispId = 0x98a)
    _SmartTagActions getSmartTagActions();
            
    /**
     * <p>id(0x98b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "XML", dispId = 0x98b)
    String getXML();
            
    /**
     * <p>id(0x80f)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80f)
    void Delete();
            
    /**
     * <p>id(0x98e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsMissing", dispId = 0x98e)
    Boolean getIsMissing();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(15)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}