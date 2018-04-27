
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E70526E-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
@ComInterface(iid="{2E70526E-92D1-43CC-A57B-ED48BCCC711D}")
public interface DispCustomControlEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x81c)</p>
     * @param Code [inout] {@code Short}
     */
    @ComMethod(name = "Updated", dispId = 0x81c)
    void Updated(VARIANT Code);
            
    /**
     * <p>id(0x7e3)</p>
     */
    @ComMethod(name = "Enter", dispId = 0x7e3)
    void Enter();
            
    /**
     * <p>id(0x81b)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Exit", dispId = 0x81b)
    void Exit(VARIANT Cancel);
            
    /**
     * <p>id(0x819)</p>
     */
    @ComMethod(name = "GotFocus", dispId = 0x819)
    void GotFocus();
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComMethod(name = "LostFocus", dispId = 0x81a)
    void LostFocus();
            
    
}