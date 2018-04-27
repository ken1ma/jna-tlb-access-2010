
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D7281A87-4B30-41C5-AB7B-FABF9A35442A})</p>
 */
@ComInterface(iid="{D7281A87-4B30-41C5-AB7B-FABF9A35442A}")
public interface _ReportEvents2Listener {
    /**
     * <p>id(0x812)</p>
     */
    @ComEventCallback(dispid = 0x812)
    void Open(VARIANT Cancel);
            
    /**
     * <p>id(0x816)</p>
     */
    @ComEventCallback(dispid = 0x816)
    void Close();
            
    /**
     * <p>id(0x817)</p>
     */
    @ComEventCallback(dispid = 0x817)
    void Activate();
            
    /**
     * <p>id(0x818)</p>
     */
    @ComEventCallback(dispid = 0x818)
    void Deactivate();
            
    /**
     * <p>id(0x823)</p>
     */
    @ComEventCallback(dispid = 0x823)
    void Error(VARIANT DataErr,
            VARIANT Response);
            
    /**
     * <p>id(0x871)</p>
     */
    @ComEventCallback(dispid = 0x871)
    void NoData(VARIANT Cancel);
            
    /**
     * <p>id(0x872)</p>
     */
    @ComEventCallback(dispid = 0x872)
    void Page();
            
    /**
     * <p>id(0x80a)</p>
     */
    @ComEventCallback(dispid = 0x80a)
    void Current();
            
    /**
     * <p>id(0x813)</p>
     */
    @ComEventCallback(dispid = 0x813)
    void Load();
            
    /**
     * <p>id(0x814)</p>
     */
    @ComEventCallback(dispid = 0x814)
    void Resize();
            
    /**
     * <p>id(0x815)</p>
     */
    @ComEventCallback(dispid = 0x815)
    void Unload(VARIANT Cancel);
            
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
     * <p>id(0x824)</p>
     */
    @ComEventCallback(dispid = 0x824)
    void Timer();
            
    /**
     * <p>id(0x86b)</p>
     */
    @ComEventCallback(dispid = 0x86b)
    void Filter(VARIANT Cancel,
            VARIANT FilterType);
            
    /**
     * <p>id(0x86c)</p>
     */
    @ComEventCallback(dispid = 0x86c)
    void ApplyFilter(VARIANT Cancel,
            VARIANT ApplyType);
            
    /**
     * <p>id(0x961)</p>
     */
    @ComEventCallback(dispid = 0x961)
    void MouseWheel(Boolean Page,
            Integer Count);
            
    
}