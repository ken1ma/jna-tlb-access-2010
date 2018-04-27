
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000568-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000568-0000-0010-8000-00AA006D2EA4}")
public interface ADOStreamConstruction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param ppStm [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Stream", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT getStream(VARIANT ppStm);
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param ppStm [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Stream", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT setStream(com.sun.jna.platform.win32.COM.util.IUnknown ppStm);
            
    
}