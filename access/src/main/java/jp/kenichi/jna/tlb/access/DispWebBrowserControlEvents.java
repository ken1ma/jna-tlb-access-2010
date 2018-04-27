
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EACB9075-68F8-4E3B-B865-E1CE6BE0447C})</p>
 */
@ComInterface(iid="{EACB9075-68F8-4E3B-B865-E1CE6BE0447C}")
public interface DispWebBrowserControlEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x81c)</p>
     * @param Code [inout] {@code Short}
     */
    @ComMethod(name = "Updated", dispId = 0x81c)
    void Updated(VARIANT Code);
            
    /**
     * <p>id(0x80d)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "BeforeUpdate", dispId = 0x80d)
    void BeforeUpdate(VARIANT Cancel);
            
    /**
     * <p>id(0x80e)</p>
     */
    @ComMethod(name = "AfterUpdate", dispId = 0x80e)
    void AfterUpdate();
            
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
     * <p>id(0x89d)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Dirty", dispId = 0x89d)
    void Dirty(VARIANT Cancel);
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComMethod(name = "Change", dispId = 0x81d)
    void Change();
            
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
     * <p>id(0x9dc)</p>
     * @param pDisp [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param URL [in] {@code Object}
     * @param flags [in] {@code Object}
     * @param TargetFrameName [in] {@code Object}
     * @param PostData [in] {@code Object}
     * @param Headers [in] {@code Object}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeNavigate2", dispId = 0x9dc)
    void BeforeNavigate2(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object flags,
            Object TargetFrameName,
            Object PostData,
            Object Headers,
            VARIANT Cancel);
            
    /**
     * <p>id(0x9e0)</p>
     * @param pDisp [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param URL [in] {@code Object}
     */
    @ComMethod(name = "DocumentComplete", dispId = 0x9e0)
    void DocumentComplete(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL);
            
    /**
     * <p>id(0x9d3)</p>
     * @param Progress [in] {@code Integer}
     * @param ProgressMax [in] {@code Integer}
     */
    @ComMethod(name = "ProgressChange", dispId = 0x9d3)
    void ProgressChange(Integer Progress,
            Integer ProgressMax);
            
    /**
     * <p>id(0x9ce)</p>
     * @param pDisp [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param URL [in] {@code Object}
     * @param TargetFrameName [in] {@code Object}
     * @param StatusCode [in] {@code Object}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "NavigateError", dispId = 0x9ce)
    void NavigateError(com.sun.jna.platform.win32.COM.util.IDispatch pDisp,
            Object URL,
            Object TargetFrameName,
            Object StatusCode,
            VARIANT Cancel);
            
    
}