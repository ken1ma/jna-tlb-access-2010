
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E705280-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
@ComInterface(iid="{2E705280-92D1-43CC-A57B-ED48BCCC711D}")
public interface DispPageHdrFtrInReportEventsListener {
    /**
     * <p>id(0x81f)</p>
     */
    @ComEventCallback(dispid = 0x81f)
    void Format(VARIANT Cancel,
            VARIANT FormatCount);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComEventCallback(dispid = 0x820)
    void Print(VARIANT Cancel,
            VARIANT PrintCount);
            
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComEventCallback(dispid = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @ComEventCallback(dispid = 0xfffffda7)
    void DblClick(VARIANT Cancel);
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @ComEventCallback(dispid = 0xfffffda3)
    void MouseDown(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @ComEventCallback(dispid = 0xfffffda2)
    void MouseMove(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @ComEventCallback(dispid = 0xfffffda1)
    void MouseUp(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0x9b6)</p>
     */
    @ComEventCallback(dispid = 0x9b6)
    void Paint();
            
    
}