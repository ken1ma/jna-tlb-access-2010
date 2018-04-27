
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E70526E-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
@ComInterface(iid="{2E70526E-92D1-43CC-A57B-ED48BCCC711D}")
public interface DispCustomControlEventsListener {
    /**
     * <p>id(0x81c)</p>
     */
    @ComEventCallback(dispid = 0x81c)
    void Updated(VARIANT Code);
            
    /**
     * <p>id(0x7e3)</p>
     */
    @ComEventCallback(dispid = 0x7e3)
    void Enter();
            
    /**
     * <p>id(0x81b)</p>
     */
    @ComEventCallback(dispid = 0x81b)
    void Exit(VARIANT Cancel);
            
    /**
     * <p>id(0x819)</p>
     */
    @ComEventCallback(dispid = 0x819)
    void GotFocus();
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComEventCallback(dispid = 0x81a)
    void LostFocus();
            
    
}