
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000567-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000567-0000-0010-8000-00AA006D2EA4}")
public interface ADORecordConstruction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param ppRow [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Row", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT getRow(VARIANT ppRow);
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param ppRow [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Row", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT setRow(com.sun.jna.platform.win32.COM.util.IUnknown ppRow);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "ParentRow", dispId = 0x60020002)
    com.sun.jna.platform.win32.WinNT.HRESULT setParentRow(com.sun.jna.platform.win32.COM.util.IUnknown param0);
            
    
}