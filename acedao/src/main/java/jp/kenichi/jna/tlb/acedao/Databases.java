
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000073-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000073-0000-0010-8000-00AA006D2EA4}")
public interface Databases extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020000)
    Short getCount();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x60020002)
    void Refresh();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param Item [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Database getItem(Object Item);
            
    
}