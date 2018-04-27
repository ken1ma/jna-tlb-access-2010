
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0334-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0334-0000-0000-C000-000000000046}")
public interface PropertyTests extends IUnknown, IRawDispatchHandle, IDispatch {
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
    PropertyTest getItem(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x4)
    Integer getCount();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param Name [in] {@code String}
     * @param Condition [in] {@code MsoCondition}
     * @param Value [in, optional] {@code Object}
     * @param SecondValue [in, optional] {@code Object}
     * @param Connector [in, optional] {@code MsoConnector}
     */
    @ComMethod(name = "Add", dispId = 0x5)
    void Add(String Name,
            MsoCondition Condition,
            Object Value,
            Object SecondValue,
            MsoConnector Connector);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x6)
    void Remove(Integer Index);
            
    
}