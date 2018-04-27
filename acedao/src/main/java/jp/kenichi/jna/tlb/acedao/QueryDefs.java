
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0000007B-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{0000007B-0000-0010-8000-00AA006D2EA4}")
public interface QueryDefs extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60030000)</p>
     * <p>vtableId(10)</p>
     * @param Object [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Append", dispId = 0x60030000)
    void Append(com.sun.jna.platform.win32.COM.util.IDispatch Object);
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(11)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "Delete", dispId = 0x60030001)
    void Delete(String Name);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Item [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    QueryDef getItem(Object Item);
            
    
}