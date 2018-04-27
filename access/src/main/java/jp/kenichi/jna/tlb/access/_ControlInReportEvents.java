
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({90B322A4-F1D9-11CD-8701-00AA003F0F07})</p>
 * <p>source(_DispControlInReportEvents)</p>
 * <p>source(__ControlInReportEvents)</p>
 * <p>interface(_Control)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{90B322A4-F1D9-11CD-8701-00AA003F0F07}")
public interface _ControlInReportEvents extends IUnknown
    ,_Control
    ,IConnectionPoint
{

}