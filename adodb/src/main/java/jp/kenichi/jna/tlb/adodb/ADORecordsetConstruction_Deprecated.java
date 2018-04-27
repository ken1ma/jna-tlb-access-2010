
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000283-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000283-0000-0010-8000-00AA006D2EA4}")
public interface ADORecordsetConstruction_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param ppRowset [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Rowset", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowset(VARIANT ppRowset);
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     * @param ppRowset [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "Rowset", dispId = 0x60020000)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowset(com.sun.jna.platform.win32.COM.util.IUnknown ppRowset);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param plChapter [out] {@code Integer}
     */
    @ComProperty(name = "Chapter", dispId = 0x60020002)
    com.sun.jna.platform.win32.WinNT.HRESULT getChapter(VARIANT plChapter);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     * @param plChapter [in] {@code Integer}
     */
    @ComProperty(name = "Chapter", dispId = 0x60020002)
    com.sun.jna.platform.win32.WinNT.HRESULT setChapter(Integer plChapter);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param ppRowPos [out] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "RowPosition", dispId = 0x60020004)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowPosition(VARIANT ppRowPos);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param ppRowPos [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComProperty(name = "RowPosition", dispId = 0x60020004)
    com.sun.jna.platform.win32.WinNT.HRESULT setRowPosition(com.sun.jna.platform.win32.COM.util.IUnknown ppRowPos);
            
    
}