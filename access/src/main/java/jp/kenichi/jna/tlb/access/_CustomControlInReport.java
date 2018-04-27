
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({300471E0-7426-11CE-AB63-00AA0042B7CE})</p>
 * <p>source(DispCustomControlInReportEvents)</p>
 * <p>source(_CustomControlInReportEvents)</p>
 * <p>interface(_CustomControl)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{300471E0-7426-11CE-AB63-00AA0042B7CE}")
public interface _CustomControlInReport extends IUnknown
    ,_CustomControl
    ,IConnectionPoint
{

}