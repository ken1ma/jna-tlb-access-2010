
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1712-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1712-0000-0000-C000-000000000046}")
public interface Axes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020000)
    Integer getCount();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Type [in] {@code XlAxisType}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComProperty(name = "Item", dispId = 0x60020001)
    IMsoAxis getItem(XlAxisType Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Type [in] {@code XlAxisType}
     * @param AxisGroup [in, optional] {@code XlAxisGroup}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    IMsoAxis get_Default(XlAxisType Type,
            XlAxisGroup AxisGroup);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}