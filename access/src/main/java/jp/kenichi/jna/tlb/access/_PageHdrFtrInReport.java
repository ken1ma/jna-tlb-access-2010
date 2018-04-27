
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({7AD9E906-BAF8-11CE-A68A-00AA003F0F07})</p>
 * <p>source(DispPageHdrFtrInReportEvents)</p>
 * <p>source(_PageHdrFtrInReportEvents)</p>
 * <p>interface(_Section)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{7AD9E906-BAF8-11CE-A68A-00AA003F0F07}")
public interface _PageHdrFtrInReport extends IUnknown
    ,_Section
    ,IConnectionPoint
{

}