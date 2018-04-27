
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E992-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E992-E47C-11CD-8701-00AA003F0F07}")
public interface DispNavigationControlEventsListener {
    /**
     * <p>id(0x80d)</p>
     */
    @ComEventCallback(dispid = 0x80d)
    void BeforeUpdate(VARIANT Cancel);
            
    /**
     * <p>id(0x80e)</p>
     */
    @ComEventCallback(dispid = 0x80e)
    void AfterUpdate();
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComEventCallback(dispid = 0x81d)
    void Change();
            
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
     * <p>id(0xfffffda6)</p>
     */
    @ComEventCallback(dispid = 0xfffffda6)
    void KeyDown(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @ComEventCallback(dispid = 0xfffffda5)
    void KeyPress(VARIANT KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @ComEventCallback(dispid = 0xfffffda4)
    void KeyUp(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0x89d)</p>
     */
    @ComEventCallback(dispid = 0x89d)
    void Dirty(VARIANT Cancel);
            
    /**
     * <p>id(0x860)</p>
     */
    @ComEventCallback(dispid = 0x860)
    void Undo(VARIANT Cancel);
            
    
}