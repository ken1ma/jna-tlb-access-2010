
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({27CE30A0-91FF-101B-AF4E-00AA003F0F07})</p>
 * <p>source(_ReportEvents)</p>
 * <p>interface(_Report)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{27CE30A0-91FF-101B-AF4E-00AA003F0F07}")
public interface ReportOld extends IUnknown
    ,_Report
    ,IConnectionPoint
{

}