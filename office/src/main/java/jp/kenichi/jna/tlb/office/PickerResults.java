
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03E5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03E5-0000-0000-C000-000000000046}")
public interface PickerResults extends IUnknown, IRawDispatchHandle, IDispatch {
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
    PickerResult getItem(Integer Index);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param Id [in] {@code String}
     * @param DisplayName [in] {@code String}
     * @param Type [in] {@code String}
     * @param SIPId [in, optional] {@code String}
     * @param ItemData [in, optional] {@code Object}
     * @param SubItems [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    PickerResult Add(String Id,
            String DisplayName,
            String Type,
            String SIPId,
            Object ItemData,
            Object SubItems);
            
    
}