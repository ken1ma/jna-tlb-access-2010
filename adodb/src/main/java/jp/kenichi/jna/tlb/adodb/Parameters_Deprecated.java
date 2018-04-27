
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0000050D-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{0000050D-0000-0010-8000-00AA006D2EA4}")
public interface Parameters_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x2)
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
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x60030001)
    void Delete(Object Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    _Parameter_Deprecated getItem(Object Index);
            
    
}