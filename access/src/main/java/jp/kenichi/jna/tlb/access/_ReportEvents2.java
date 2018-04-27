
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D7281A87-4B30-41C5-AB7B-FABF9A35442A})</p>
 */
@ComInterface(iid="{D7281A87-4B30-41C5-AB7B-FABF9A35442A}")
public interface _ReportEvents2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x812)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Open", dispId = 0x812)
    void Open(VARIANT Cancel);
            
    /**
     * <p>id(0x816)</p>
     */
    @ComMethod(name = "Close", dispId = 0x816)
    void Close();
            
    /**
     * <p>id(0x817)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x817)
    void Activate();
            
    /**
     * <p>id(0x818)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x818)
    void Deactivate();
            
    /**
     * <p>id(0x823)</p>
     * @param DataErr [inout] {@code Short}
     * @param Response [out] {@code Short}
     */
    @ComMethod(name = "Error", dispId = 0x823)
    void Error(VARIANT DataErr,
            VARIANT Response);
            
    /**
     * <p>id(0x871)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "NoData", dispId = 0x871)
    void NoData(VARIANT Cancel);
            
    /**
     * <p>id(0x872)</p>
     */
    @ComMethod(name = "Page", dispId = 0x872)
    void Page();
            
    /**
     * <p>id(0x80a)</p>
     */
    @ComMethod(name = "Current", dispId = 0x80a)
    void Current();
            
    /**
     * <p>id(0x813)</p>
     */
    @ComMethod(name = "Load", dispId = 0x813)
    void Load();
            
    /**
     * <p>id(0x814)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x814)
    void Resize();
            
    /**
     * <p>id(0x815)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Unload", dispId = 0x815)
    void Unload(VARIANT Cancel);
            
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
            
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComMethod(name = "Click", dispId = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "DblClick", dispId = 0xfffffda7)
    void DblClick(VARIANT Cancel);
            
    /**
     * <p>id(0xfffffda3)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseDown", dispId = 0xfffffda3)
    void MouseDown(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseMove", dispId = 0xfffffda2)
    void MouseMove(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseUp", dispId = 0xfffffda1)
    void MouseUp(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda6)</p>
     * @param KeyCode [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     */
    @ComMethod(name = "KeyDown", dispId = 0xfffffda6)
    void KeyDown(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     * @param KeyAscii [inout] {@code Short}
     */
    @ComMethod(name = "KeyPress", dispId = 0xfffffda5)
    void KeyPress(VARIANT KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     * @param KeyCode [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     */
    @ComMethod(name = "KeyUp", dispId = 0xfffffda4)
    void KeyUp(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComMethod(name = "Timer", dispId = 0x824)
    void Timer();
            
    /**
     * <p>id(0x86b)</p>
     * @param Cancel [out] {@code Short}
     * @param FilterType [inout] {@code Short}
     */
    @ComMethod(name = "Filter", dispId = 0x86b)
    void Filter(VARIANT Cancel,
            VARIANT FilterType);
            
    /**
     * <p>id(0x86c)</p>
     * @param Cancel [out] {@code Short}
     * @param ApplyType [inout] {@code Short}
     */
    @ComMethod(name = "ApplyFilter", dispId = 0x86c)
    void ApplyFilter(VARIANT Cancel,
            VARIANT ApplyType);
            
    /**
     * <p>id(0x961)</p>
     * @param Page [in] {@code Boolean}
     * @param Count [in] {@code Integer}
     */
    @ComMethod(name = "MouseWheel", dispId = 0x961)
    void MouseWheel(Boolean Page,
            Integer Count);
            
    
}