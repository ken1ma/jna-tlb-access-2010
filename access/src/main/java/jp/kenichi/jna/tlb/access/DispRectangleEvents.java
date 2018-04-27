
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E705271-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
@ComInterface(iid="{2E705271-92D1-43CC-A57B-ED48BCCC711D}")
public interface DispRectangleEvents extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    
}